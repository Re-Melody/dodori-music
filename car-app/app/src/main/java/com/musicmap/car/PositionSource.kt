package com.musicmap.car

import android.annotation.SuppressLint
import android.content.Context
import android.location.*
import android.os.Bundle
import android.os.Looper

interface PositionSource {
    fun start(onPosition: (GeoPoint) -> Unit, onStatus: (String) -> Unit)
    fun stop()
}

/** Standard Android fallback. Positions are not fabricated when GPS is absent. */
class AndroidPositionSource(context: Context) : PositionSource, LocationListener {
    private val manager = context.getSystemService(LocationManager::class.java)
    private var position: (GeoPoint) -> Unit = {}
    private var status: (String) -> Unit = {}
    @SuppressLint("MissingPermission")
    override fun start(onPosition: (GeoPoint) -> Unit, onStatus: (String) -> Unit) {
        position = onPosition; status = onStatus
        try {
            val providers = listOf(LocationManager.GPS_PROVIDER, LocationManager.NETWORK_PROVIDER)
                .filter { manager.isProviderEnabled(it) }
            if (providers.isEmpty()) { status("기기 위치 설정을 켜 주세요"); return }
            providers.forEach { manager.requestLocationUpdates(it, 3000L, 30f, this, Looper.getMainLooper()) }
            status("Android 위치 · 새 위치 수신 대기")
        } catch (_: SecurityException) { status("위치 권한이 필요해요") }
    }
    override fun onLocationChanged(location: Location) {
        if (location.elapsedRealtimeNanos > 0 && android.os.SystemClock.elapsedRealtimeNanos() - location.elapsedRealtimeNanos > 120_000_000_000L) return
        status("Android 위치 · 실시간 수신"); position(GeoPoint(location.latitude, location.longitude))
    }
    override fun onProviderDisabled(provider: String) { status("위치 제공자 꺼짐 · ${provider}") }
    override fun onProviderEnabled(provider: String) { status("새 위치 수신 대기") }
    @Deprecated("Legacy callback") override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) = Unit
    override fun stop() { manager.removeUpdates(this) }
}
