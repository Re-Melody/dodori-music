package com.musicmap.car

import android.content.Context
import android.media.AudioAttributes
import android.os.Handler
import android.os.Looper
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import java.util.Locale

/** Vehicle signals that change the listening mood. Implemented per platform flavor. */
interface DriveSignals {
    fun start(onRain: (Boolean) -> Unit, onMode: (DriveMode) -> Unit)
    fun stop()
}

/** Spoken guidance, so the driver does not need to read the screen. */
interface Announcer {
    /** Called on the main thread when speech starts and ends, so music can be lowered. */
    var onSpeaking: (Boolean) -> Unit
    fun speak(text: String)
    fun stop()
    fun release()
}

/** Platform text-to-speech. Used on standard Android and as the fallback on Pleos. */
class AndroidAnnouncer(context: Context) : Announcer {
    override var onSpeaking: (Boolean) -> Unit = {}
    private val main = Handler(Looper.getMainLooper())
    private var ready = false
    private var failed = false
    private var pending: String? = null
    private lateinit var engine: TextToSpeech

    init {
        engine = TextToSpeech(context.applicationContext) { status ->
            if (status != TextToSpeech.SUCCESS) { failed = true; return@TextToSpeech }
            runCatching {
                engine.language = Locale.KOREA
                engine.setAudioAttributes(AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_NAVIGATION_GUIDANCE)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH).build())
                engine.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                    override fun onStart(utteranceId: String?) { main.post { onSpeaking(true) } }
                    override fun onDone(utteranceId: String?) { main.post { onSpeaking(false) } }
                    @Deprecated("Deprecated in Java")
                    override fun onError(utteranceId: String?) { main.post { onSpeaking(false) } }
                })
                ready = true
                pending?.let { pending = null; speak(it) }
            }.onFailure { failed = true }
        }
    }
    override fun speak(text: String) {
        if (failed) return
        if (!ready) { pending = text; return }
        runCatching { engine.speak(text, TextToSpeech.QUEUE_FLUSH, null, "drive-announcement") }
    }
    override fun stop() { pending = null; runCatching { engine.stop() }; onSpeaking(false) }
    override fun release() { pending = null; runCatching { engine.shutdown() } }
}
