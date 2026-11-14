package com.musicmap.car

import ai.pleos.playground.tts.TextToSpeech
import ai.pleos.playground.tts.constant.ErrorType
import ai.pleos.playground.tts.constant.Mode
import ai.pleos.playground.tts.listener.EventListener
import ai.pleos.playground.tts.listener.OnInitializeListener
import ai.pleos.playground.vehicle.Vehicle
import ai.pleos.playground.vehicle.api.model.area.WindowArea
import ai.pleos.playground.vehicle.constant.area.WindowValue
import ai.pleos.playground.vehicle.constant.control.DrivingModeType
import ai.pleos.playground.vehicle.constant.control.WiperState
import ai.pleos.playground.vehicle.listener.DrivingModeStateListener
import ai.pleos.playground.vehicle.listener.WiperStateListener
import android.content.Context
import android.os.Handler
import android.os.Looper
import java.util.Locale

fun createDriveSignals(context: Context): DriveSignals? = PleosDriveSignals(context)
fun createAnnouncer(context: Context): Announcer = PleosAnnouncer(context)
fun drivePermissions(): Array<String> = arrayOf("pleos.car.permission.CAR_DRIVE", "pleos.car.permission.CAR_WINDOWS", "pleos.car.permission.TTS_SERVICE")

/**
 * Pleos Vehicle SDK 2.3.2: front wiper state and driving mode. Every call is asynchronous IPC and may be
 * unsupported on a given vehicle, so failures leave the mood unchanged instead of surfacing an error.
 */
class PleosDriveSignals(context: Context) : DriveSignals {
    private val app = context.applicationContext
    private val main = Handler(Looper.getMainLooper())
    private var vehicle: Vehicle? = null
    private val windshield = WindowArea(WindowValue.FRONT_WINDSHIELD)
    private var onRain: (Boolean) -> Unit = {}
    private var onMode: (DriveMode) -> Unit = {}
    private var attempts = 0
    private var registered = false

    private val wiperListener = object : WiperStateListener {
        override fun onWiperStateUpdated(state: WiperState?) { main.post { onRain(state == WiperState.ON) } }
        override fun onFailed(e: Exception) = Unit
    }
    private val modeListener = object : DrivingModeStateListener {
        override fun onDrivingModeStateUpdated(mode: DrivingModeType?) { main.post { onMode(mode.toDriveMode()) } }
        override fun onFailed(e: Exception) = Unit
    }
    private fun DrivingModeType?.toDriveMode() = when (this) {
        DrivingModeType.SPORT -> DriveMode.SPORT
        DrivingModeType.ECO -> DriveMode.ECO
        else -> DriveMode.NORMAL
    }

    override fun start(onRain: (Boolean) -> Unit, onMode: (DriveMode) -> Unit) {
        this.onRain = onRain; this.onMode = onMode
        try { vehicle = Vehicle(app).also { it.initialize() } } catch (_: Throwable) { vehicle = null; return }
        attempts = 0
        main.postDelayed(::register, 800)
    }
    /** The service binds asynchronously after initialize(); retry a few times before giving up. */
    private fun register() {
        val v = vehicle ?: return
        try {
            v.getWiper().getCurrentWiperState(windshield, { state -> main.post { onRain(state == WiperState.ON) } }, { })
            v.getWiper().registerWiperState(windshield, wiperListener)
            v.getDrivingMode().getCurrentDrivingModeState({ mode -> main.post { onMode(mode.toDriveMode()) } }, { })
            v.getDrivingMode().registerDrivingModeState(modeListener)
            registered = true
        } catch (_: Throwable) {
            if (++attempts < 4) main.postDelayed(::register, 1500)
        }
    }
    override fun stop() {
        main.removeCallbacksAndMessages(null)
        val v = vehicle ?: return
        if (registered) {
            runCatching { v.getWiper().unregisterWiperState(windshield, wiperListener) }
            runCatching { v.getDrivingMode().unregisterDrivingModeState(modeListener) }
        }
        runCatching { v.release() }
        vehicle = null; registered = false
    }
}

/**
 * Pleos TextToSpeech SDK 3.3.1 in on-device mode (no network or app registration needed).
 * Falls back to the platform engine when the Pleos service is unavailable.
 */
class PleosAnnouncer(context: Context) : Announcer {
    override var onSpeaking: (Boolean) -> Unit = {}
        set(value) { field = value; fallback?.onSpeaking = value }
    private val app = context.applicationContext
    private val main = Handler(Looper.getMainLooper())
    private var tts: TextToSpeech? = null
    private var ready = false
    private var pending: String? = null
    private var fallback: Announcer? = null

    private val events = object : EventListener {
        override fun onStart() { main.post { onSpeaking(true) } }
        override fun onReady() = Unit
        override fun onDone() { main.post { onSpeaking(false) } }
        override fun onError(error: ErrorType) { android.util.Log.w("DriveAnnouncer", "Pleos TTS error: $error"); main.post { onSpeaking(false) } }
        override fun onStop() { main.post { onSpeaking(false) } }
        override fun onUpdatedRms(rms: Double) = Unit
    }

    init {
        try {
            val engine = TextToSpeech(app, Mode.ON_DEVICE)
            tts = engine
            // Order matters: the SDK binds its service in initialize(); listeners can only be added afterwards.
            engine.initialize(object : OnInitializeListener {
                override fun onSuccess() {
                    main.post {
                        runCatching { engine.addEventListener(events) }
                        runCatching { engine.setLocale(Locale.KOREA) }
                        ready = true
                        pending?.let { pending = null; speak(it) }
                    }
                }
                override fun onFailure(error: ErrorType) { android.util.Log.w("DriveAnnouncer", "Pleos TTS init failed: $error"); main.post { useFallback() } }
            })
        } catch (e: Throwable) { android.util.Log.w("DriveAnnouncer", "Pleos TTS unavailable", e); useFallback() }
    }
    private fun useFallback() {
        if (fallback != null) return
        runCatching { tts?.release() }; tts = null; ready = false
        fallback = AndroidAnnouncer(app).also { it.onSpeaking = onSpeaking; pending?.let { text -> pending = null; it.speak(text) } }
    }
    override fun speak(text: String) {
        fallback?.let { it.speak(text); return }
        if (!ready) { pending = text; return }
        try { tts?.speak(text) } catch (e: Throwable) { android.util.Log.w("DriveAnnouncer", "Pleos TTS speak failed", e); pending = text; useFallback() }
    }
    override fun stop() {
        pending = null
        fallback?.stop()
        runCatching { tts?.stop() }
        onSpeaking(false)
    }
    override fun release() {
        pending = null; fallback?.release(); fallback = null
        runCatching { tts?.removeEventListener(events) }; runCatching { tts?.release() }; tts = null
    }
}
