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
    private val appleMusic get() = (application as MusicMapApplication).appleMusic
    private var applePlayer: MusicKitBridge.NativePlayer? = null
    private var appleGeneration = 0
    private var ready = false
    private var desiredPlay = false
    private var resumeOnGain = false
    private var ducked = false
    private var queue = emptyList<Track>()
    private var index = -1
    private var locationSource: PositionSource? = null
    private var foreground = false
    private var stopped = false
    private var announcer: Announcer? = null
    private var signals: DriveSignals? = null
    /** Last values reported by the vehicle; the guided demo overrides them only while it runs. */
    private var vehicleContext = DriveContext()
    private var announcing = false
    private var signalsStarted = false
    private val preferences by lazy { getSharedPreferences("music-map", MODE_PRIVATE) }
    private val tick = object : Runnable {
        override fun run() {
            if (state.demo) {
                state.demoProgress = (state.demoProgress + 1.0 / 180).coerceAtMost(1.0)
                updatePosition(Catalog.routePoint(state.demoProgress))
                applyDemoWeather()
                if (state.demoProgress >= 1.0) { state.demo = false; state.source = "둘러보기 도착"; setContext(vehicleContext) }
            }
            if (ready) player?.let { state.positionMs = it.currentPosition; state.durationMs = it.duration }
            if (applePlayer != null) syncApplePlayback()
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
                        if (applePlayer != null) { resumeOnGain = desiredPlay; pause(abandon = false) }
                        else { ducked = true; applyVolume() }
                    }
                    AudioManager.AUDIOFOCUS_GAIN -> {
                        ducked = false; applyVolume()
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
                override fun onSeekTo(pos: Long) {
                    if (applePlayer != null) appleAction { it.seek(pos.coerceIn(0, state.durationMs.toLong())) }
                    else if (ready) player?.seekTo(pos.toInt().coerceIn(0, state.durationMs))
                }
                override fun onPlayFromMediaId(mediaId: String?, extras: Bundle?) {
                    findTrack(mediaId)?.let { ensureForeground(); select(it) }
                }
                override fun onPlayFromSearch(query: String?, extras: Bundle?) {
                    val matches = (Catalog.tracks + state.appleTracks).filter { query.isNullOrBlank() || "${it.title} ${it.artist} ${it.genre}".contains(query, true) }
                    matches.firstOrNull()?.let { ensureForeground(); queue = matches; index = 0; publishQueue(); load(it, true) }
                }
            })
            setSessionActivity(PendingIntent.getActivity(this@PlaybackService, 0, Intent(this@PlaybackService, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE))
        }
        sessionToken = session.sessionToken
        getSystemService(NotificationManager::class.java).createNotificationChannel(
            NotificationChannel("playback", "음악 재생", NotificationManager.IMPORTANCE_LOW))
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(noisy, IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY), RECEIVER_NOT_EXPORTED)
        else registerReceiver(noisy, IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY))
        handler.post(tick)
        publish()
    }

    /** Vehicle signals start with the first user command, after the permission prompts were answered. */
    private fun ensureSignals() {
        if (signalsStarted) return
        signalsStarted = true
        signals = createDriveSignals(this)?.also { source ->
            source.start(
                { rain -> vehicleContext = vehicleContext.copy(rain = rain); if (!state.demo) setContext(vehicleContext) },
                { mode -> vehicleContext = vehicleContext.copy(mode = mode); if (!state.demo) setContext(vehicleContext) })
        }
    }

    /** Applies a new drive mood: reorders the upcoming list and says why, once per change. */
    private fun setContext(next: DriveContext) {
        if (next == state.drive) return
        val moodChanged = next.mood != state.drive.mood || next.line != state.drive.line
        state.drive = next
        if (moodChanged) {
            refreshRecommendations()
            if (state.region != null) next.spoken?.let(::announce)
        }
        publish()
    }
    /** The guided route shows the rain response between Suwon and Yongin; real drives use the vehicle. */
    private fun applyDemoWeather() {
        setContext(DriveContext(rain = state.demoProgress in 0.6..0.92))
    }
    private val clearCaption = Runnable { state.caption = ""; state.changed() }
    private fun announce(text: String) {
        state.caption = text
        handler.removeCallbacks(clearCaption); handler.postDelayed(clearCaption, 8000)
        if (!state.voiceOn) return
        val speaker = announcer ?: createAnnouncer(this).also {
            it.onSpeaking = { speaking -> announcing = speaking; applyVolume() }
            announcer = it
        }
        speaker.speak(text)
    }
    private fun applyVolume() {
        val volume = if (ducked) .2f else if (announcing) .3f else 1f
        runCatching { player?.setVolume(volume, volume) }
    }

    override fun onGetRoot(clientPackageName: String, clientUid: Int, rootHints: Bundle?): BrowserRoot =
        BrowserRoot("root", Bundle().apply { putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true) })

    override fun onLoadChildren(parentId: String, result: Result<MutableList<MediaBrowser.MediaItem>>) {
        val items = when (parentId) {
            "root" -> listOf(folder("music", "음악"))
            "music" -> listOf(folder("nearby", "지금 지나는 곳"), folder("favorites", "보관함"), folder("all", "전체 곡"), folder("apple", "Apple Music · 선택한 목록"))
            "apple" -> if (appleMusic.connected) state.appleTracks.map(::mediaItem) else emptyList()
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
        ensureSignals()
        when (intent?.action) {
            "play" -> if (state.playing || state.buffering) pause() else play()
            "next" -> skip(1)
            "previous" -> skip(-1)
            "stop" -> stopAll()
            "select" -> findTrack(intent.getStringExtra("id"))?.let(::select)
            "apple_disconnect" -> {
                if (state.current?.appleMusicId != null) {
                    stopPlayback(); state.current = null; queue = emptyList(); index = -1; publishQueue()
                    session.setMetadata(null)
                    state.message = "Apple Music 연결을 해제했어요"
                    if (locationSource == null && !state.demo) stopAll()
                }
                notifyChildrenChanged("apple")
            }
            "demo" -> {
                stopPosition(); state.demoProgress = 0.0; state.demo = true
                ensureForeground()
                state.source = "둘러보기 · 서울에서 용인까지"
                updatePosition(Catalog.routePoint(0.0))
                applyDemoWeather()
            }
            "jump" -> if (state.demo) {
                state.demoProgress = if (state.demoProgress < 0.5) 0.5 else 1.0
                updatePosition(Catalog.routePoint(state.demoProgress))
                applyDemoWeather()
            }
            "voice" -> {
                state.voiceOn = !state.voiceOn
                preferences.edit().putBoolean("voice", state.voiceOn).apply()
                if (!state.voiceOn) announcer?.stop()
            }
            // Debug builds only: stand in for the vehicle signals when recording on a plain emulator.
            "sim_rain" -> if (BuildConfig.DEBUG) { vehicleContext = vehicleContext.copy(rain = intent.getBooleanExtra("on", true)); if (!state.demo) setContext(vehicleContext) }
            "sim_mode" -> if (BuildConfig.DEBUG) {
                vehicleContext = vehicleContext.copy(mode = runCatching { DriveMode.valueOf(intent.getStringExtra("value") ?: "NORMAL") }.getOrDefault(DriveMode.NORMAL))
                if (!state.demo) setContext(vehicleContext)
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
            state.message = ""
            if (next != null) announce("${next.spoken}에 들어왔어요. ${next.intro}")
        }
    }
    private fun refreshRecommendations() {
        state.recommendations = Catalog.recommend(state.region?.id, state.genre, state.drive.mood)
        if (state.current?.appleMusicId != null) {
            notifyChildrenChanged("nearby"); return
        }
        queue = Catalog.queueFor(state.current, state.recommendations)
        index = if (state.current == null) -1 else 0
        publishQueue()
        notifyChildrenChanged("nearby")
    }
    private fun publishQueue() {
        session.setQueue(queue.mapIndexed { i, track -> MediaSession.QueueItem(mediaItem(track).description, i.toLong()) })
    }
    private fun select(track: Track) {
        queue = if (track.appleMusicId != null) state.appleTracks.ifEmpty { listOf(track) }
            else if (track in state.recommendations) state.recommendations else Catalog.tracks
        if (track !in queue) queue = listOf(track)
        index = queue.indexOf(track); publishQueue(); load(track, true)
        notifyChildrenChanged("apple")
    }
    private fun findTrack(id: String?): Track? = (Catalog.tracks.find { it.id == id }
        ?: state.appleTracks.find { it.id == id } ?: id?.let { appleMusic.find(it) })
        ?.takeIf { !it.id.startsWith("apple:") || it.appleMusicId != null }
    /** Full songs go through MusicKit when an account is connected; otherwise the 30-second preview plays. */
    private fun usesMusicKit(track: Track?) = track?.appleMusicId != null &&
        (track.previewUrl == null || (appleMusic.connected && MusicKitBridge.problem() == null))
    private fun load(track: Track, autoplay: Boolean) {
        if (usesMusicKit(track)) { loadApple(track, autoplay); return }
        releaseApplePlayer()
        player?.release(); ready = false; desiredPlay = autoplay
        stopped = false; state.current = track; state.playing = false; state.buffering = true; state.positionMs = 0
        val created = MediaPlayer()
        player = created
        try {
            created.setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build())
            created.setWakeMode(this, PowerManager.PARTIAL_WAKE_LOCK)
            if (track.previewUrl != null) { created.setDataSource(track.previewUrl); state.message = "Apple Music · 30초 미리듣기" }
            else assets.openFd("audio/${track.asset}").use { created.setDataSource(it.fileDescriptor, it.startOffset, it.length) }
            created.setOnPreparedListener {
                if (player !== it) return@setOnPreparedListener
                ready = true; state.buffering = false; state.durationMs = it.duration
                session.setMetadata(MediaMetadata.Builder(session.controller.metadata)
                    .putLong(MediaMetadata.METADATA_KEY_DURATION, it.duration.toLong()).build())
                if (desiredPlay) play() else publish()
            }
            created.setOnCompletionListener { skip(1) }
            created.setOnErrorListener { _, _, _ ->
                ready = false; desiredPlay = false; state.playing = false; state.buffering = false
                state.message = if (track.previewUrl != null) "미리듣기를 불러오지 못했어요. 인터넷 연결을 확인해 주세요" else "재생 실패 · 다른 곡을 선택해 주세요"; publish(); true
            }
            created.prepareAsync()
        } catch (e: Exception) {
            created.release(); player = null; desiredPlay = false; state.buffering = false
            state.message = "음원을 열 수 없어요"; publish()
        }
        session.setMetadata(MediaMetadata.Builder().putString(MediaMetadata.METADATA_KEY_MEDIA_ID, track.id)
            .putString(MediaMetadata.METADATA_KEY_TITLE, track.title).putString(MediaMetadata.METADATA_KEY_ARTIST, track.artist)
            .putString(MediaMetadata.METADATA_KEY_ALBUM, Catalog.regions.find { it.id == track.regionId }?.name ?: track.reason.ifBlank { "길 위의 음악" }).build())
        publish()
    }
    private fun loadApple(track: Track, autoplay: Boolean) {
        val problem = AppleMusicConfig.tokenProblem() ?: MusicKitBridge.problem()
        if (!appleMusic.connected || problem != null) {
            state.message = problem ?: "Apple Music 화면에서 계정을 먼저 연결해 주세요"; publish(); return
        }
        // Each selected song gets its own controller generation; late callbacks cannot skip a new song.
        releaseApplePlayer()
        player?.release(); player = null; ready = false
        audio.abandonAudioFocusRequest(focus)
        val expectedGeneration = appleGeneration
        stopped = false; desiredPlay = autoplay; state.current = track; state.playing = false
        state.buffering = autoplay; state.positionMs = 0; state.durationMs = track.durationMs.coerceAtLeast(1)
        session.isActive = true
        session.setMetadata(MediaMetadata.Builder().putString(MediaMetadata.METADATA_KEY_MEDIA_ID, track.id)
            .putString(MediaMetadata.METADATA_KEY_TITLE, track.title).putString(MediaMetadata.METADATA_KEY_ARTIST, track.artist)
            .putString(MediaMetadata.METADATA_KEY_ALBUM, track.reason)
            .putLong(MediaMetadata.METADATA_KEY_DURATION, state.durationMs.toLong()).build())
        try {
            applePlayer = MusicKitBridge.player(this, appleMusic.account,
                onChanged = { if (expectedGeneration == appleGeneration) { syncApplePlayback(); publish() } },
                onEnded = { if (expectedGeneration == appleGeneration && desiredPlay) skip(1) },
                onError = { if (expectedGeneration == appleGeneration) applePlaybackFailed() })
            applePlayer!!.load(requireNotNull(track.appleMusicId))
            if (!autoplay) applePlayer!!.pause()
            state.message = "Apple Music · 전체 곡 스트리밍"
        } catch (_: Exception) { applePlaybackFailed() }
        catch (_: LinkageError) { applePlaybackFailed() }
        publish()
    }
    private fun syncApplePlayback() {
        appleAction { native ->
            state.playing = native.playing; state.positionMs = native.positionMs
            if (native.durationMs > 1) state.durationMs = native.durationMs
            if (state.playing) state.buffering = false
            // Pause can arrive while MusicKit is still preparing the queue.
            if (!desiredPlay && state.playing) { native.pause(); state.playing = false; state.buffering = false }
        }
    }
    private fun appleAction(action: (MusicKitBridge.NativePlayer) -> Unit) {
        try { applePlayer?.let(action) }
        catch (_: Exception) { applePlaybackFailed() }
        catch (_: LinkageError) { applePlaybackFailed() }
    }
    private fun applePlaybackFailed() {
        desiredPlay = false; state.playing = false; state.buffering = false
        releaseApplePlayer(); session.isActive = false
        state.message = "Apple Music 재생에 실패했어요. 구독·인터넷 연결과 MusicKit 설정을 확인해 주세요"; publish()
    }
    private fun releaseApplePlayer() {
        appleGeneration++
        val previous = applePlayer; applePlayer = null
        runCatching { previous?.stop() }; runCatching { previous?.close() }
    }
    private fun play() {
        stopped = false
        if (state.current == null) {
            state.recommendations.firstOrNull()?.let(::select) ?: run { state.message = "현재 위치를 켜거나 경로를 둘러보면 곡이 준비돼요"; publish() }
            return
        }
        desiredPlay = true
        if (usesMusicKit(state.current)) {
            if (!appleMusic.connected) { state.message = "Apple Music에 다시 연결해 주세요"; desiredPlay = false; publish(); return }
            if (applePlayer == null) loadApple(state.current!!, true)
            else { session.isActive = true; state.buffering = true; appleAction { it.play() }; publish() }
            return
        }
        if (player == null) { state.current?.let { load(it, true) }; return }
        if (!ready) return
        if (audio.requestAudioFocus(focus) == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
            session.isActive = true
            applyVolume(); player?.start(); state.playing = true
        } else { desiredPlay = false; state.message = "다른 오디오 사용이 끝난 뒤 재생해 주세요" }
        publish()
    }
    private fun pause(abandon: Boolean = true) {
        desiredPlay = false
        if (ready) player?.pause()
        appleAction { it.pause() }
        state.playing = false; state.buffering = false
        if (abandon) {
            resumeOnGain = false; ducked = false; applyVolume()
            audio.abandonAudioFocusRequest(focus)
        }
        publish()
    }
    private fun stopPlayback() {
        pause(); player?.release(); player = null; ready = false
        releaseApplePlayer()
        stopped = true; state.positionMs = 0; session.isActive = false; publish()
    }
    private fun stopAll() {
        stopPlayback(); stopPosition(); announcer?.stop(); state.source = "위치 수신 중지"; state.drive = vehicleContext
        stopForeground(STOP_FOREGROUND_REMOVE); foreground = false; stopSelf(); publish()
    }
    private fun skip(direction: Int) {
        if (direction < 0 && applePlayer != null && state.positionMs > 3000) { appleAction { it.seek(0) }; return }
        if (direction < 0 && ready && (player?.currentPosition ?: 0) > 3000) { player?.seekTo(0); return }
        val next = index + direction
        if (next in queue.indices) { index = next; load(queue[next], true) }
        else { pause(); state.message = "이 길의 곡을 모두 들었어요"; publish() }
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
        val playbackState = if (state.buffering) PlaybackState.STATE_BUFFERING else if (state.playing) PlaybackState.STATE_PLAYING else if (stopped) PlaybackState.STATE_STOPPED else if (state.current == null) PlaybackState.STATE_NONE else PlaybackState.STATE_PAUSED
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
            .setContentText(if (state.current?.appleMusicId != null) state.current?.artist else state.region?.name ?: state.source).setContentIntent(session.controller.sessionActivity)
            .setStyle(Notification.MediaStyle().setMediaSession(session.sessionToken).setShowActionsInCompactView(0, 1, 2))
            .addAction(action("previous", "이전 곡", android.R.drawable.ic_media_previous))
            .addAction(action("play", if (state.playing || state.buffering) "일시정지" else "재생", if (state.playing || state.buffering) android.R.drawable.ic_media_pause else android.R.drawable.ic_media_play))
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
        signals?.stop(); signals = null; announcer?.release(); announcer = null
        releaseApplePlayer()
        audio.abandonAudioFocusRequest(focus); session.release(); unregisterReceiver(noisy)
        state.playing = false; state.buffering = false; state.current = null; state.positionMs = 0; state.durationMs = 1
        state.source = "위치 수신 중지"; state.changed(); super.onDestroy()
    }
}
