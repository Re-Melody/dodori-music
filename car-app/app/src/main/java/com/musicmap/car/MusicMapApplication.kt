package com.musicmap.car

import android.app.Application
import android.os.Handler
import android.os.Looper

class MusicMapApplication : Application() {
    val state = AppState()
    val appleMusic by lazy { AppleMusicRepository(this) }
    val driveData by lazy { DriveData() }
    val overrides by lazy { SegmentOverrides(this) }
    override fun onCreate() {
        super.onCreate()
        val preferences = getSharedPreferences("music-map", MODE_PRIVATE)
        state.favorites = preferences.getStringSet("favorites", emptySet())!!.toSet()
        state.voiceOn = preferences.getBoolean("voice", true)
    }
}

class AppState {
    var appleTracks = emptyList<Track>()
    var point: GeoPoint? = null
    var region: MusicRegion? = null
    var genre = "전체"
    var recommendations = emptyList<Track>()
    var current: Track? = null
    var playing = false
    var buffering = false
    var positionMs = 0
    var durationMs = 1
    var demo = false
    var demoProgress = 0.0
    var source = "위치 수신 대기"
    var message = ""
    /** Mood reported by the car (or by the guided demo route). */
    var drive = DriveContext()
    var voiceOn = true
    /** The line currently being announced, shown as a caption so it also works with sound off. */
    var caption = ""
    /** The drive to a chosen destination, if one is set. */
    var plan: DrivePlan? = null
    /** Segments already driven through on this plan. */
    var visited = setOf<String>()
    var favorites = setOf<String>()
    val listeners = linkedSetOf<() -> Unit>()
    private val main = Handler(Looper.getMainLooper())
    fun changed() {
        if (Looper.myLooper() == Looper.getMainLooper()) listeners.toList().forEach { it() }
        else main.post { listeners.toList().forEach { it() } }
    }
}
