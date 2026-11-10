package com.musicmap.car

import android.app.Activity
import android.app.Instrumentation
import android.content.ComponentName
import android.content.Intent
import android.media.AudioAttributes
import android.media.AudioFocusRequest
import android.media.AudioManager
import android.media.browse.MediaBrowser
import android.media.session.MediaController
import android.media.session.PlaybackState
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

/** Device-level regression checks. These do not emulate vehicle hardware or CarUxRestrictions. */
class VehicleQa(private val test: Instrumentation) {
    private val context get() = test.targetContext
    private val state get() = (context.applicationContext as MusicMapApplication).state
    private val passed = mutableListOf<String>()
    private var browser: MediaBrowser? = null
    private var audio: AudioManager? = null
    private var competingFocus: AudioFocusRequest? = null
    private lateinit var controller: MediaController
    private lateinit var activity: Activity

    private fun main(block: () -> Unit) = test.runOnMainSync(block)
    private fun command(action: String, key: String? = null, value: String? = null) = main {
        context.startForegroundService(Intent(context, PlaybackService::class.java).setAction(action).apply {
            if (key != null) putExtra(key, value)
        })
    }
    private fun await(label: String, condition: () -> Boolean) {
        val deadline = SystemClock.elapsedRealtime() + 8000
        var ok = false
        while (!ok && SystemClock.elapsedRealtime() < deadline) {
            main { ok = condition() }
            if (!ok) Thread.sleep(100)
        }
        check(ok) { label }
        passed.add(label)
    }
    private fun holds(label: String, condition: () -> Boolean) {
        repeat(12) {
            var ok = false
            main { ok = condition() }
            check(ok) { label }
            Thread.sleep(100)
        }
        passed.add(label)
    }
    private fun connect() {
        val latch = CountDownLatch(1)
        main {
            browser = MediaBrowser(context, ComponentName(context, PlaybackService::class.java), object : MediaBrowser.ConnectionCallback() {
                override fun onConnected() {
                    controller = MediaController(context, browser!!.sessionToken)
                    latch.countDown()
                }
            }, null)
            browser!!.connect()
        }
        check(latch.await(8, TimeUnit.SECONDS)) { "MediaBrowser connection" }
    }
    private fun children(id: String): List<MediaBrowser.MediaItem> {
        val latch = CountDownLatch(1)
        var items = emptyList<MediaBrowser.MediaItem>()
        main {
            browser!!.subscribe(id, object : MediaBrowser.SubscriptionCallback() {
                override fun onChildrenLoaded(parentId: String, children: MutableList<MediaBrowser.MediaItem>) {
                    items = children.toList(); latch.countDown()
                }
            })
        }
        check(latch.await(8, TimeUnit.SECONDS)) { "Browse $id" }
        main { browser!!.unsubscribe(id) }
        return items
    }
    private fun views(view: View): List<View> = listOf(view) +
        if (view is ViewGroup) (0 until view.childCount).flatMap { views(view.getChildAt(it)) } else emptyList()

    fun run(suite: String) {
        try {
            activity = test.startActivitySync(Intent(context, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            when (suite) {
                "cold-start" -> {
                    val saved = context.getSharedPreferences("music-map", 0).getStringSet("favorites", emptySet())!!.toSet()
                    check(saved.isNotEmpty()) { "Run smoke suite first to seed saved favorites" }
                    await("Saved favorites restored before starting playback service") { state.favorites == saved }
                    main { views(activity.window.decorView).filterIsInstance<Button>().first { it.text.contains("보관함") }.performClick() }
                    await("Cold-start library displays saved track") {
                        views(activity.window.decorView).any { v -> saved.any { id -> v.contentDescription?.startsWith(Catalog.tracks.first { it.id == id }.title) == true } }
                    }
                    holds("Opening library does not start audio or location") { !state.playing && !state.demo && state.point == null }
                }
                "system-stop" -> {
                    command("demo"); command("play"); connect()
                    await("Playback started before system stop") { state.playing && state.demo }
                    main { controller.transportControls.stop() }
                    await("System stop ends audio and location simulation") { !state.playing && !state.demo }
                    val point = state.point
                    holds("System stop leaves location unchanged") { state.point == point && !state.playing }
                    await("System reports stopped playback") { controller.playbackState?.state == PlaybackState.STATE_STOPPED }
                }
                "queue" -> {
                    command("demo"); connect()
                    main { controller.transportControls.playFromSearch("새로운 길", null) }
                    await("Search selects matching audio") { state.playing && state.current?.id == "road" }
                    await("System queue matches search playback") { controller.queue?.map { it.description.mediaId } == listOf("road") }
                    main { controller.transportControls.playFromMediaId("lake", null) }
                    await("System selects track outside current region") { state.playing && state.current?.id == "lake" }
                    await("System queue matches selected catalog") { controller.queue?.map { it.description.mediaId } == Catalog.tracks.map { it.id } }
                    await("System active queue item matches playing track") {
                        controller.queue?.find { it.queueId == controller.playbackState?.activeQueueItemId }?.description?.mediaId == "lake"
                    }
                }
                "focus" -> {
                    command("demo"); command("play"); connect()
                    await("Audio starts for focus checks") { state.playing }
                    audio = context.getSystemService(AudioManager::class.java)
                    fun request(gain: Int) = main {
                        competingFocus = AudioFocusRequest.Builder(gain)
                            .setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_ASSISTANCE_NAVIGATION_GUIDANCE).setContentType(AudioAttributes.CONTENT_TYPE_SPEECH).build())
                            .setOnAudioFocusChangeListener({}, Handler(Looper.getMainLooper())).build()
                        check(audio!!.requestAudioFocus(competingFocus!!) == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) { "Competing focus granted" }
                    }
                    request(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK)
                    holds("Navigation may-duck request keeps music playing") { state.playing }
                    main { audio!!.abandonAudioFocusRequest(competingFocus!!); competingFocus = null }
                    holds("Music continues after navigation focus release") { state.playing }
                    request(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT)
                    await("Transient audio interruption pauses playback") { !state.playing }
                    main { audio!!.abandonAudioFocusRequest(competingFocus!!); competingFocus = null }
                    await("Playback resumes after transient focus returns") { state.playing }
                    request(AudioManager.AUDIOFOCUS_GAIN_TRANSIENT)
                    await("Second interruption pauses playback") { !state.playing }
                    main { controller.transportControls.pause() }
                    Thread.sleep(200)
                    main { audio!!.abandonAudioFocusRequest(competingFocus!!); competingFocus = null }
                    holds("Explicit user pause prevents automatic resume") { !state.playing }
                    main { controller.transportControls.play() }
                    await("User can resume playback") { state.playing }
                    request(AudioManager.AUDIOFOCUS_GAIN)
                    await("Permanent focus loss pauses playback") { !state.playing }
                    main { audio!!.abandonAudioFocusRequest(competingFocus!!); competingFocus = null }
                    holds("Permanent focus loss does not auto-resume") { !state.playing }
                }
                "media" -> {
                    connect()
                    holds("Browser connection does not autoplay") { !state.playing && !state.demo }
                    check(children("root").map { it.mediaId } == listOf("music")); passed.add("Music category exposed at browser root")
                    check(children("music").map { it.mediaId } == listOf("nearby", "favorites", "all")); passed.add("Browser provides nearby favorites and catalog")
                    check(children("all").size == 6); passed.add("All six demo tracks browsable")
                    check(children("favorites").map { it.mediaId }.toSet() == state.favorites); passed.add("Browser favorites match saved library")
                    check(children("unknown").isEmpty()); passed.add("Unknown browser folder safely returns empty")
                    command("demo"); command("play")
                    await("Audio ready for transport checks") { state.playing && state.positionMs > 0 }
                    main { controller.transportControls.seekTo(6000) }
                    await("System seek updates actual player position") { state.positionMs in 5500..10000 }
                    main { controller.transportControls.skipToPrevious() }
                    await("Previous after three seconds restarts same song") { state.current?.id == "river" && state.positionMs < 2500 }
                    main { controller.transportControls.seekTo(23000) }
                    await("Track completion automatically advances") { state.current?.id == "city" && state.playing }
                    main { controller.transportControls.playFromSearch("no-matching-track-qa", null) }
                    holds("Unmatched search preserves current playback") { state.current?.id == "city" && state.playing }
                    main { controller.transportControls.pause() }
                    await("System pause acknowledged") { !state.playing }
                    Thread.sleep(1100)
                    val position = state.positionMs
                    holds("Paused audio position does not advance") { state.positionMs == position }
                    main { controller.transportControls.play() }
                    await("System resumes paused audio") { state.playing && state.positionMs > position }
                }
                "lifecycle" -> {
                    command("demo"); command("play"); connect()
                    await("Playback ready before activity recreation") { state.playing && state.positionMs > 0 }
                    val track = state.current?.id
                    val monitor = test.addMonitor(MainActivity::class.java.name, null, false)
                    main { activity.recreate() }
                    val recreated = test.waitForMonitorWithTimeout(monitor, 8000)
                    test.removeMonitor(monitor)
                    check(recreated != null) { "Recreated activity launched" }
                    test.waitForIdleSync()
                    await("Activity recreation keeps current playback") { state.playing && state.current?.id == track }
                    main { recreated.moveTaskToBack(true) }
                    val before = state.positionMs
                    Thread.sleep(1400)
                    await("Background playback position advances") { state.playing && state.positionMs > before }
                    main { controller.transportControls.pause() }
                    await("Background system pause works") { !state.playing }
                    main { controller.transportControls.play() }
                    await("Background system resume works") { state.playing }
                    command("stop")
                    await("Background stop ends playback and location") { !state.playing && !state.demo }
                }
                "permissions" -> {
                    command("live")
                    await("Denied location permission reported without crashing") { state.source == "위치 권한 필요" && state.point == null }
                    command("demo")
                    await("Demo remains available without location permission") { state.region?.id == "seoul" && state.demo && !state.playing }
                    command("play")
                    await("Offline bundled audio works without location permission") { state.playing && state.positionMs > 0 }
                }
                else -> error("Unknown suite: $suite")
            }
            test.finish(Activity.RESULT_OK, Bundle().apply { putString("stream", "PASS ${passed.size} checks [$suite]\n" + passed.joinToString("\n")) })
        } catch (error: Throwable) {
            test.finish(Activity.RESULT_CANCELED, Bundle().apply { putString("stream", "FAIL [$suite] after ${passed.size} checks\n" + passed.joinToString("\n") + "\n" + error.stackTraceToString()) })
        } finally {
            main { competingFocus?.let { audio?.abandonAudioFocusRequest(it) }; browser?.disconnect() }
        }
    }
}
