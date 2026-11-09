package com.musicmap.car

import android.app.Application
import android.os.Handler
import android.os.Looper

class MusicMapApplication : Application() {
    val state = AppState()
}

class AppState {
    var point: GeoPoint? = null
    var region: MusicRegion? = null
    var genre = "전체"
    var recommendations = emptyList<Track>()
    var current: Track? = null
    var playing = false
    var positionMs = 0
    var durationMs = 1
    var demo = false
    var demoProgress = 0.0
    var source = "위치 수신 대기"
    var message = "지역별 창작 시연곡 · 실제 음악 서비스 미연결"
    var favorites = setOf<String>()
    val listeners = linkedSetOf<() -> Unit>()
    private val main = Handler(Looper.getMainLooper())
    fun changed() {
        if (Looper.myLooper() == Looper.getMainLooper()) listeners.toList().forEach { it() }
        else main.post { listeners.toList().forEach { it() } }
    }
}
