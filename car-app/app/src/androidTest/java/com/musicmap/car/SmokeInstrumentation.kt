package com.musicmap.car

import android.app.Activity
import android.app.Instrumentation
import android.content.ComponentName
import android.content.Intent
import android.media.browse.MediaBrowser
import android.media.session.MediaController
import android.location.Location
import android.location.LocationManager
import android.location.Criteria
import android.os.SystemClock
import android.os.Bundle
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

/** Tests a real Android service/player, without screenshot-coordinate coupling. */
class SmokeInstrumentation : Instrumentation() {
    private var suite = "smoke"
    override fun onCreate(arguments: Bundle?) {
        super.onCreate(arguments)
        suite = arguments?.getString("suite") ?: "smoke"
        start()
    }
    override fun onStart() {
        if (suite != "smoke") { VehicleQa(this).run(suite); return }
        val passed = mutableListOf<String>()
        var browser: MediaBrowser? = null
        var mockManager: LocationManager? = null
        try {
            val activity = startActivitySync(Intent(targetContext, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
            val state = (targetContext.applicationContext as MusicMapApplication).state
            fun command(action: String, key: String? = null, value: String? = null) {
                runOnMainSync {
                    targetContext.startForegroundService(Intent(targetContext, PlaybackService::class.java).setAction(action).apply {
                        if (key != null) putExtra(key, value)
                    })
                }
            }
            fun await(label: String, predicate: () -> Boolean) {
                val deadline = System.currentTimeMillis() + 8000
                var success = false
                while (!success && System.currentTimeMillis() < deadline) {
                    runOnMainSync { success = predicate() }
                    if (!success) Thread.sleep(100)
                }
                check(success) { "Failed: $label" }; passed.add(label)
            }
            command("demo")
            await("Seoul demo starts without autoplay") { state.region?.id == "seoul" && !state.playing && state.recommendations.size == 2 }
            val connected = CountDownLatch(1)
            lateinit var controller: MediaController
            runOnMainSync {
                browser = MediaBrowser(targetContext, ComponentName(targetContext, PlaybackService::class.java), object : MediaBrowser.ConnectionCallback() {
                    override fun onConnected() { controller = MediaController(targetContext, browser!!.sessionToken); connected.countDown() }
                }, null)
                browser!!.connect()
            }
            check(connected.await(8, TimeUnit.SECONDS)) { "MediaBrowser did not connect" }
            val browsed = CountDownLatch(1)
            runOnMainSync {
                browser!!.subscribe("nearby", object : MediaBrowser.SubscriptionCallback() {
                    override fun onChildrenLoaded(parentId: String, children: MutableList<MediaBrowser.MediaItem>) {
                        if (children.size == 2 && children.all { it.isPlayable }) browsed.countDown()
                    }
                })
            }
            check(browsed.await(8, TimeUnit.SECONDS)) { "No browsable recommendations" }; passed.add("Vehicle browser exposes regional tracks")
            command("play")
            await("Bundled audio plays") { state.playing && state.current?.id == "river" && state.positionMs > 0 }
            command("jump")
            await("Region update preserves current song") { state.region?.id == "suwon" && state.current?.id == "river" && state.playing && state.recommendations.first().id == "walls" }
            runOnMainSync { controller.transportControls.skipToNext() }
            await("System next enters refreshed queue") { state.current?.id == "walls" && state.playing }
            if ("walls" !in state.favorites) command("favorite", "id", "walls")
            await("Favorites persist") { "walls" in state.favorites && targetContext.getSharedPreferences("music-map", 0).getStringSet("favorites", emptySet())!!.contains("walls") }
            command("genre", "value", "경쾌하게")
            await("Genre filters recommendations") { state.recommendations.map { it.id } == listOf("road") && state.current?.id == "walls" }
            runOnMainSync { activity.moveTaskToBack(true) }
            Thread.sleep(1200)
            await("Playback continues in background") { state.playing && state.positionMs > 0 }
            runOnMainSync { controller.transportControls.pause() }
            await("System pause works") { !state.playing }
            runOnMainSync { controller.transportControls.playFromSearch("새로운 길", null) }
            await("System search playback works") { state.playing && state.current?.id == "road" }
            command("jump")
            await("Demo reaches Yongin") { state.region?.id == "yongin" && state.current?.id == "road" }
            runOnMainSync { activity.startActivity(Intent(targetContext, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)) }
            mockManager = targetContext.getSystemService(LocationManager::class.java)
            mockManager.addTestProvider(LocationManager.GPS_PROVIDER, false, false, false, false, true, true, true, Criteria.POWER_LOW, Criteria.ACCURACY_FINE)
            mockManager.setTestProviderEnabled(LocationManager.GPS_PROVIDER, true)
            command("live")
            Thread.sleep(200)
            fun inject(lat: Double, lon: Double) {
                mockManager!!.setTestProviderLocation(LocationManager.GPS_PROVIDER, Location(LocationManager.GPS_PROVIDER).apply {
                    latitude = lat; longitude = lon; accuracy = 3f
                    time = System.currentTimeMillis(); elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos()
                })
            }
            inject(37.525, 126.938)
            await("Android GPS callback updates region") { !state.demo && state.region?.id == "seoul" && state.source.contains("실시간") }
            Thread.sleep(3200) // Respect the production provider's 3-second update interval.
            inject(35.18, 129.07)
            await("Unregistered GPS area clears recommendations") { state.region == null && state.recommendations.isEmpty() }
            command("stop")
            await("Stop ends playback and simulation") { !state.playing && !state.demo }
            runOnMainSync { browser?.disconnect() }
            mockManager.removeTestProvider(LocationManager.GPS_PROVIDER); mockManager = null
            finish(Activity.RESULT_OK, Bundle().apply { putString("stream", "PASS ${passed.size} checks\n" + passed.joinToString("\n")) })
        } catch (error: Throwable) {
            runOnMainSync { browser?.disconnect() }
            runCatching { mockManager?.removeTestProvider(LocationManager.GPS_PROVIDER) }
            finish(Activity.RESULT_CANCELED, Bundle().apply { putString("stream", "FAIL after ${passed.size} checks\n${error.stackTraceToString()}") })
        }
    }
}
