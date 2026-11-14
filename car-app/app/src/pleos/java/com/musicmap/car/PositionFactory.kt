package com.musicmap.car

import android.content.Context
import android.Manifest
import android.content.pm.PackageManager
import ai.pleos.playground.location.fused.FusedLocation
import ai.pleos.playground.location.fused.listener.FusedLocationListener
import ai.pleos.playground.location.fused.model.LocationData

fun createPositionSource(context: Context): PositionSource = PleosPositionSource(context)
private const val PLEOS_LOCATION_PERMISSION = "pleos.car.permission.FUSED_LOCATION"
fun positionPermissions(): Array<String> = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, PLEOS_LOCATION_PERMISSION)
fun hasPositionPermission(context: Context): Boolean =
    context.checkSelfPermission(PLEOS_LOCATION_PERMISSION) == PackageManager.PERMISSION_GRANTED &&
        (context.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED ||
            context.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)

/** Typed integration with the official FusedLocation 1.1.3 API; no reflection or fabricated GPS. */
class PleosPositionSource(context: Context) : PositionSource {
    private val sdk = FusedLocation(context)
    private var listener: FusedLocationListener? = null
    private var initialized = false
    override fun start(onPosition: (GeoPoint) -> Unit, onStatus: (String) -> Unit) {
        try {
            if (!sdk.isSupported()) {
                onStatus("Pleos 위치 SDK 미지원 · 시연 경로를 선택해 주세요"); return
            }
            sdk.initialize(); initialized = true
            val callback = object : FusedLocationListener {
                override fun onChanged(location: LocationData?) {
                    if (location == null) { onStatus("Pleos 위치 수신 대기"); return }
                    if (!location.latitude.isFinite() || !location.longitude.isFinite()) return
                    onStatus("Pleos 차량 위치 · 실시간 수신")
                    onPosition(GeoPoint(location.latitude, location.longitude))
                }
                override fun onError(exception: Exception) { onStatus("Pleos 위치 접근 실패 · SDK 권한과 서비스 상태를 확인해 주세요") }
            }
            listener = callback
            sdk.registerFusedLocationCallback(callback)
            onStatus("Pleos 차량 위치 수신 대기")
        } catch (_: Exception) { onStatus("Pleos 위치 연결 실패 · SDK 사용 가능 상태를 확인해 주세요") }
    }
    override fun stop() {
        if (initialized) {
            listener?.let { runCatching { sdk.unregisterFusedLocationCallback(it) } }
            runCatching { sdk.release() }; initialized = false
        }
        listener = null
    }
}
