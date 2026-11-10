package com.musicmap.car

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Proxy

/**
 * Optional binary boundary for Apple's separately licensed AARs. No substitute player or preview URL
 * is used when MusicKit is absent. Keep these class/member names in sync with the installed SDK.
 * The bridge fails explicitly if its SDK contract is not available.
 */
object MusicKitBridge {
    private const val AUTH = "com.apple.android.sdk.authentication."
    private const val PLAYER = "com.apple.android.music.playback.controller."
    private const val QUEUE = "com.apple.android.music.playback.queue."
    fun problem(): String? = try {
        Class.forName(AUTH + "AuthenticationFactory")
        Class.forName(PLAYER + "MediaPlayerControllerFactory")
        Class.forName(QUEUE + "CatalogPlaybackQueueItemProvider\$Builder")
        null
    } catch (_: ClassNotFoundException) {
        "Apple Music 연결 준비 중입니다. MusicKit 설정을 완료한 뒤 다시 시도해 주세요."
    } catch (_: LinkageError) {
        "이 기기에서 Apple Music 구성 요소를 불러올 수 없어요. 앱 설치 구성을 확인해 주세요."
    }

    private fun manager(context: Context): Any = Class.forName(AUTH + "AuthenticationFactory")
        .getMethod("createAuthenticationManager", Context::class.java).invoke(null, context)!!

    fun signInIntent(context: Context): Intent {
        val manager = manager(context)
        val builder = Class.forName(AUTH + "AuthenticationManager")
            .getMethod("createIntentBuilder", String::class.java).invoke(manager, AppleMusicConfig.developerToken)
        return Class.forName(AUTH + "AuthIntentBuilder").getMethod("build").invoke(builder) as Intent
    }

    fun userToken(context: Context, data: Intent): String {
        val result = Class.forName(AUTH + "AuthenticationManager")
            .getMethod("handleTokenResult", Intent::class.java).invoke(manager(context), data)
        val type = Class.forName(AUTH + "TokenResult")
        check(type.getMethod("isError").invoke(result) == false) { "Apple Music 인증을 완료하지 못했어요. 다시 연결해 주세요." }
        return (type.getMethod("getMusicUserToken").invoke(result) as? String)
            ?.takeIf { it.isNotBlank() } ?: error("Apple Music 인증 결과가 비어 있어요. 다시 연결해 주세요.")
    }

    fun player(context: Context, account: AppleMusicAccount, onChanged: () -> Unit, onEnded: () -> Unit,
               onError: () -> Unit) = NativePlayer(context, account, onChanged, onEnded, onError)

    class NativePlayer internal constructor(context: Context, account: AppleMusicAccount,
        onChanged: () -> Unit, onEnded: () -> Unit, onError: () -> Unit) : AutoCloseable {
        private val main = Handler(Looper.getMainLooper())
        private val type = Class.forName(PLAYER + "MediaPlayerController")
        private val listenerType = Class.forName(PLAYER + "MediaPlayerController\$Listener")
        private var closed = false
        private val tokensType = Class.forName(AUTH + "TokenProvider")
        private val tokens = Proxy.newProxyInstance(tokensType.classLoader, arrayOf(tokensType)) { proxy, method, args ->
            when (method.name) {
                "getDeveloperToken" -> AppleMusicConfig.developerToken
                "getUserToken" -> account.userToken
                "toString" -> "MusicMapTokenProvider"
                "hashCode" -> System.identityHashCode(proxy)
                "equals" -> proxy === args?.firstOrNull()
                else -> null
            }
        }
        private val controller = Class.forName(PLAYER + "MediaPlayerControllerFactory")
            .getMethod("createLocalController", Context::class.java, tokensType).invoke(null, context.applicationContext, tokens)!!
        private val listener = Proxy.newProxyInstance(listenerType.classLoader, arrayOf(listenerType)) { proxy, method, args ->
            when (method.name) {
                "toString" -> "MusicMapPlayerListener"
                "hashCode" -> System.identityHashCode(proxy)
                "equals" -> proxy === args?.firstOrNull()
                else -> {
                    main.post {
                        if (!closed) when (method.name) {
                            "onError" -> onError()
                            "onItemEnded" -> onEnded()
                            else -> onChanged()
                        }
                    }
                    null
                }
            }
        }
        private val positionGetter by lazy { accessor("getCurrentPlaybackPosition", "getCurrentPosition") }
        private val durationGetter by lazy { accessor("getCurrentPlaybackDuration", "getDuration") }

        init {
            try {
                // Resolve the complete playback contract before allowing a song to be selected.
                listOf("play", "pause", "stop", "release", "getPlaybackState")
                    .forEach { type.getMethod(it) }
                positionGetter; durationGetter
                type.getMethod("seekToPosition", Long::class.javaPrimitiveType)
                type.getMethod("addListener", listenerType).invoke(controller, listener)
            } catch (error: Exception) {
                runCatching { type.getMethod("release").invoke(controller) }
                throw error
            }
        }
        fun load(id: String) {
            val builderType = Class.forName(QUEUE + "CatalogPlaybackQueueItemProvider\$Builder")
            val builder = builderType.getConstructor().newInstance()
            builderType.getMethod("items", Int::class.javaPrimitiveType, Array<String>::class.java)
                .invoke(builder, 1, arrayOf(id)) // MediaItemType.SONG
            val provider = builderType.getMethod("build").invoke(builder)
            type.getMethod("prepare", Class.forName(QUEUE + "PlaybackQueueItemProvider"), Boolean::class.javaPrimitiveType)
                .invoke(controller, provider, true)
        }
        fun play() { call("play") }
        fun pause() { call("pause") }
        fun stop() { call("stop") }
        fun seek(positionMs: Long) { type.getMethod("seekToPosition", Long::class.javaPrimitiveType).invoke(controller, positionMs) }
        val playing get() = (call("getPlaybackState") as Number).toInt() == 1
        // Bind the installed SDK's timing accessors once; an unsupported SDK fails at construction.
        private fun accessor(vararg names: String) = names.firstNotNullOfOrNull { name ->
            type.methods.firstOrNull { it.name == name && it.parameterCount == 0 &&
                (it.returnType == Long::class.javaPrimitiveType || it.returnType == Int::class.javaPrimitiveType) }
        } ?: throw NoSuchMethodException("Unsupported MusicKit timing API")
        val positionMs get() = (positionGetter.invoke(controller) as Number).toLong().coerceAtLeast(0).coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
        val durationMs get() = (durationGetter.invoke(controller) as Number).toLong().coerceAtLeast(1).coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
        private fun call(name: String): Any? = try { type.getMethod(name).invoke(controller) }
            catch (error: InvocationTargetException) { throw IllegalStateException("MusicKit playback failed", error.targetException) }
        override fun close() {
            closed = true; main.removeCallbacksAndMessages(null)
            try { type.getMethod("removeListener", listenerType).invoke(controller, listener) }
            finally { call("release") }
        }
    }
}
