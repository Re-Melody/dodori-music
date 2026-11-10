package com.musicmap.car

import android.app.*
import android.content.*
import android.content.pm.ServiceInfo
import android.media.*
import android.media.browse.MediaBrowser
import android.media.session.*
import android.os.*
import android.service.media.MediaBrowserService

/** Platform MediaBrowserService exposes a real browse tree and session to the vehicle. */
class PlaybackService : MediaBrowserService() {
    private val state get() = (application as MusicMapApplication).state
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var session: MediaSession
    private lateinit var audio: AudioManager
    private lateinit var focus: AudioFocusRequest
    private var player: MediaPlayer? = null
    private var ready = false
    private var desiredPlay = false
    private var resumeOnGain = false
    private var ducked = false
    private var queue = emptyList<Track>()
    private var index = -1
    private var locationSource: PositionSource? = null
    private var foreground = false
    private var stopped = false
    private val preferences by lazy { getSharedPreferences("music-map", MODE_PRIVATE) }
    private val tick = object : Runnable {
        override fun run() {
            if (state.demo) {
                state.demoProgress = (state.demoProgress + 1.0 / 180).coerceAtMost(1.0)
                updatePosition(Catalog.routePoint(state.demoProgress))
                if (state.demoProgress >= 1.0) { state.demo = false; state.source = "시연 경로 도착" }
            }
            if (ready) player?.let { state.positionMs = it.currentPosition; state.durationMs = it.duration }
            publish()
            handler.postDelayed(this, 1000)
        }
    }

    override fun onCreate() {
        super.onCreate()
        state.favorites = preferences.getStringSet("favorites", emptySet())!!.toSet()
        audio = getSystemService(AudioManager::class.java)
        focus = AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN)
            .setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build())
            .setOnAudioFocusChangeListener { change ->
                when (change) {
                    AudioManager.AUDIOFOCUS_LOSS -> { pause(); session.isActive = false }
                    AudioManager.AUDIOFOCUS_LOSS_TRANSIENT -> {
                        resumeOnGain = desiredPlay; pause(abandon = false)
                    }
                    AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK -> {
                        ducked = true; player?.setVolume(.2f, .2f)
                    }
                    AudioManager.AUDIOFOCUS_GAIN -> {
                        ducked = false; player?.setVolume(1f, 1f)
                        if (resumeOnGain) { resumeOnGain = false; play() }
                    }
                }
            }.build()
        session = MediaSession(this, "MusicMap").apply {
            setFlags(MediaSession.FLAG_HANDLES_MEDIA_BUTTONS or MediaSession.FLAG_HANDLES_TRANSPORT_CONTROLS)
            setCallback(object : MediaSession.Callback() {
                override fun onPlay() { ensureForeground(); play() }
                override fun onPause() { pause() }
                override fun onStop() { stopAll() }
                override fun onSkipToNext() { skip(1) }
                override fun onSkipToPrevious() { skip(-1) }
                override fun onSeekTo(pos: Long) { if (ready) player?.seekTo(pos.toInt().coerceIn(0, state.durationMs)) }
                override fun onPlayFromMediaId(mediaId: String?, extras: Bundle?) {
                    Catalog.tracks.find { it.id == mediaId }?.let { ensureForeground(); select(it) }
                }
                override fun onPlayFromSearch(query: String?, extras: Bundle?) {
                    val matches = Catalog.tracks.filter { query.isNullOrBlank() || "${it.title} ${it.artist} ${it.genre}".contains(query, true) }
                    matches.firstOrNull()?.let { ensureForeground(); queue = matches; index = 0; publishQueue(); load(it, true) }
                }
            })
            setSessionActivity(PendingIntent.getActivity(this@PlaybackService, 0, Intent(this@PlaybackService, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE))
        }
        sessionToken = session.sessionToken
        getSystemService(NotificationManager::class.java).createNotificationChannel(
            NotificationChannel("playback", "음악 재생 및 위치", NotificationManager.IMPORTANCE_LOW))
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(noisy, IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY), RECEIVER_NOT_EXPORTED)
        else registerReceiver(noisy, IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY))
        handler.post(tick)
        publish()
    }

    override fun onGetRoot(clientPackageName: String, clientUid: Int, rootHints: Bundle?): BrowserRoot =
        BrowserRoot("root", Bundle().apply { putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true) })

    override fun onLoadChildren(parentId: String, result: Result<MutableList<MediaBrowser.MediaItem>>) {
        val items = when (parentId) {
            "root" -> listOf(folder("music", "음악"))
            "music" -> listOf(folder("nearby", "현재 지역 추천"), folder("favorites", "즐겨찾기"), folder("all", "전체 시연곡"))
            "nearby" -> state.recommendations.map(::mediaItem)
            "favorites" -> Catalog.tracks.filter { it.id in state.favorites }.map(::mediaItem)
            "all" -> Catalog.tracks.map(::mediaItem)
            else -> emptyList()
        }
        result.sendResult(items.toMutableList())
    }

    private fun folder(id: String, title: String) = MediaBrowser.MediaItem(
        MediaDescription.Builder().setMediaId(id).setTitle(title).build(), MediaBrowser.MediaItem.FLAG_BROWSABLE)
    private fun mediaItem(track: Track) = MediaBrowser.MediaItem(
        MediaDescription.Builder().setMediaId(track.id).setTitle(track.title).setSubtitle(track.artist).setDescription(track.reason).build(), MediaBrowser.MediaItem.FLAG_PLAYABLE)

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        ensureForeground()
        when (intent?.action) {
            "play" -> if (state.playing) pause() else play()
            "next" -> skip(1)
            "previous" -> skip(-1)
            "stop" -> stopAll()
            "select" -> Catalog.tracks.find { it.id == intent.getStringExtra("id") }?.let(::select)
            "demo" -> {
                stopPosition(); state.demoProgress = 0.0; state.demo = true
                ensureForeground()
                state.source = "시연 위치 · 서울 → 수원 → 용인"
                updatePosition(Catalog.routePoint(0.0))
            }
            "jump" -> if (state.demo) {
                state.demoProgress = if (state.demoProgress < 0.5) 0.5 else 1.0
                updatePosition(Catalog.routePoint(state.demoProgress))
            }
            "live" -> startPosition()
            "genre" -> {
                state.genre = intent.getStringExtra("value") ?: "전체"; refreshRecommendations()
            }
            "favorite" -> intent.getStringExtra("id")?.let { id ->
                state.favorites = if (id in state.favorites) state.favorites - id else state.favorites + id
                preferences.edit().putStringSet("favorites", state.favorites).apply()
                notifyChildrenChanged("favorites")
            }
        }
        publish()
        return START_NOT_STICKY
    }

    private fun updatePosition(point: GeoPoint) {
        state.point = point
        val next = Catalog.detect(point, state.region?.id)
        if (next?.id != state.region?.id) {
            state.region = next
            refreshRecommendations()
            state.message = if (next == null) "아직 이 지역의 등록된 시연곡이 없어요" else "${next.name} 추천 갱신 · 재생 중인 곡은 유지"
        }
    }
    private fun refreshRecommendations() {
        state.recommendations = Catalog.recommend(state.region?.id, state.genre)
        queue = Catalog.queueFor(state.current, state.recommendations)
        index = if (state.current == null) -1 else 0
        publishQueue()
        notifyChildrenChanged("nearby")
    }
    private fun publishQueue() {
        session.setQueue(queue.mapIndexed { i, track -> MediaSession.QueueItem(mediaItem(track).description, i.toLong()) })
    }
    private fun select(track: Track) {
        queue = (if (track in state.recommendations) state.recommendations else Catalog.tracks)
        index = queue.indexOf(track); publishQueue(); load(track, true)
    }
    private fun load(track: Track, autoplay: Boolean) {
        player?.release(); ready = false; desiredPlay = autoplay
        stopped = false; state.current = track; state.playing = false; state.positionMs = 0
        val created = MediaPlayer()
        player = created
        try {
            created.setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build())
            created.setWakeMode(this, PowerManager.PARTIAL_WAKE_LOCK)
            assets.openFd("audio/${track.asset}").use { created.setDataSource(it.fileDescriptor, it.startOffset, it.length) }
            created.setOnPreparedListener {
                if (player !== it) return@setOnPreparedListener
                ready = true; state.durationMs = it.duration
                session.setMetadata(MediaMetadata.Builder(session.controller.metadata)
                    .putLong(MediaMetadata.METADATA_KEY_DURATION, it.duration.toLong()).build())
                if (desiredPlay) play() else publish()
            }
            created.setOnCompletionListener { skip(1) }
            created.setOnErrorListener { _, _, _ ->
                ready = false; desiredPlay = false; state.playing = false
                state.message = "재생 실패 · 다른 곡을 선택해 주세요"; publish(); true
            }
            created.prepareAsync()
        } catch (e: Exception) {
            created.release(); player = null; desiredPlay = false
            state.message = "음원을 열 수 없어요"; publish()
        }
        session.setMetadata(MediaMetadata.Builder().putString(MediaMetadata.METADATA_KEY_MEDIA_ID, track.id)
            .putString(MediaMetadata.METADATA_KEY_TITLE, track.title).putString(MediaMetadata.METADATA_KEY_ARTIST, track.artist)
            .putString(MediaMetadata.METADATA_KEY_ALBUM, "지역별 창작 시연곡").build())
        publish()
    }
    private fun play() {
        stopped = false
        if (state.current == null) {
            state.recommendations.firstOrNull()?.let(::select) ?: run { state.message = "먼저 시연 경로나 현재 위치를 선택해 주세요"; publish() }
            return
        }
        desiredPlay = true
        if (player == null) { state.current?.let { load(it, true) }; return }
        if (!ready) return
        if (audio.requestAudioFocus(focus) == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
            session.isActive = true
            val volume = if (ducked) .2f else 1f
            player?.setVolume(volume, volume); player?.start(); state.playing = true
        } else { desiredPlay = false; state.message = "다른 오디오 사용이 끝난 뒤 재생해 주세요" }
        publish()
    }
    private fun pause(abandon: Boolean = true) {
        desiredPlay = false
        if (ready) player?.pause()
        state.playing = false
        if (abandon) {
            resumeOnGain = false; ducked = false; player?.setVolume(1f, 1f)
            audio.abandonAudioFocusRequest(focus)
        }
        publish()
    }
    private fun stopPlayback() {
        pause(); player?.release(); player = null; ready = false
        stopped = true; state.positionMs = 0; session.isActive = false; publish()
    }
    private fun stopAll() {
        stopPlayback(); stopPosition(); state.source = "위치 수신 중지"
        stopForeground(STOP_FOREGROUND_REMOVE); foreground = false; stopSelf(); publish()
    }
    private fun skip(direction: Int) {
        if (direction < 0 && ready && (player?.currentPosition ?: 0) > 3000) { player?.seekTo(0); return }
        val next = index + direction
        if (next in queue.indices) { index = next; load(queue[next], true) }
        else { pause(); state.message = "추천 목록의 끝이에요"; publish() }
    }
    private fun startPosition() {
        stopPosition(); state.demo = false; state.point = null; state.region = null; refreshRecommendations()
        if (!hasPositionPermission(this)) {
            state.source = "위치 권한 필요"; return
        }
        locationSource = createPositionSource(this)
        state.source = "위치 수신 대기"
        ensureForeground()
        locationSource?.start({ point -> handler.post { updatePosition(point); publish() } }, { message -> handler.post { state.source = message; publish() } })
    }
    private fun stopPosition() { locationSource?.stop(); locationSource = null; state.demo = false }
    private fun publish() {
        val playbackState = if (state.playing) PlaybackState.STATE_PLAYING else if (stopped) PlaybackState.STATE_STOPPED else if (state.current == null) PlaybackState.STATE_NONE else PlaybackState.STATE_PAUSED
        session.setPlaybackState(PlaybackState.Builder().setActions(
            PlaybackState.ACTION_PLAY or PlaybackState.ACTION_PAUSE or PlaybackState.ACTION_STOP or
                PlaybackState.ACTION_SKIP_TO_NEXT or PlaybackState.ACTION_SKIP_TO_PREVIOUS or
                PlaybackState.ACTION_PLAY_FROM_MEDIA_ID or PlaybackState.ACTION_PLAY_FROM_SEARCH or PlaybackState.ACTION_SEEK_TO)
            .setState(playbackState, state.positionMs.toLong(), if (state.playing) 1f else 0f)
            .setActiveQueueItemId(if (index in queue.indices) index.toLong() else MediaSession.QueueItem.UNKNOWN_ID.toLong()).build())
        state.changed()
        if (foreground) getSystemService(NotificationManager::class.java).notify(1, notification())
    }
    private fun notification(): Notification {
        fun action(name: String, title: String, icon: Int) = Notification.Action.Builder(icon, title,
            PendingIntent.getService(this, name.hashCode(), Intent(this, PlaybackService::class.java).setAction(name), PendingIntent.FLAG_IMMUTABLE)).build()
        return Notification.Builder(this, "playback").setSmallIcon(R.drawable.ic_music)
            .setContentTitle(state.current?.title ?: "길 위의 음악")
            .setContentText(state.region?.name ?: state.source).setContentIntent(session.controller.sessionActivity)
            .setStyle(Notification.MediaStyle().setMediaSession(session.sessionToken).setShowActionsInCompactView(0, 1, 2))
            .addAction(action("previous", "이전 곡", android.R.drawable.ic_media_previous))
            .addAction(action("play", if (state.playing) "일시정지" else "재생", if (state.playing) android.R.drawable.ic_media_pause else android.R.drawable.ic_media_play))
            .addAction(action("next", "다음 곡", android.R.drawable.ic_media_next))
            .addAction(action("stop", "종료", android.R.drawable.ic_menu_close_clear_cancel))
            .setOnlyAlertOnce(true).setOngoing(state.playing).build()
    }
    private fun ensureForeground() {
        if (Build.VERSION.SDK_INT >= 29) {
            var types = ServiceInfo.FOREGROUND_SERVICE_TYPE_MEDIA_PLAYBACK
            if (locationSource != null) types = types or ServiceInfo.FOREGROUND_SERVICE_TYPE_LOCATION
            startForeground(1, notification(), types)
        } else startForeground(1, notification())
        foreground = true
    }
    private val noisy = object : BroadcastReceiver() { override fun onReceive(context: Context?, intent: Intent?) { pause() } }
    override fun onTaskRemoved(rootIntent: Intent?) {
        stopPlayback(); stopPosition(); stopSelf(); super.onTaskRemoved(rootIntent)
    }
    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null); stopPosition(); player?.release(); player = null
        audio.abandonAudioFocusRequest(focus); session.release(); unregisterReceiver(noisy)
        state.playing = false; state.current = null; state.positionMs = 0; state.durationMs = 1
        state.source = "위치 수신 중지"; state.changed(); super.onDestroy()
    }
}
