package com.musicmap.car

import android.content.Context
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import org.json.JSONObject
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec

/** The private MusicKit signing key never belongs on the device. Only the issued user token is stored. */
class AppleMusicAccount(context: Context) {
    private val prefs = context.getSharedPreferences("apple-music-account", Context.MODE_PRIVATE)
    private val alias = "music-map-apple-music"
    @Volatile var userToken: String
        private set
    @Volatile var storefront: String = prefs.getString("storefront", "") ?: ""
        private set

    init {
        userToken = runCatching {
            val encoded = prefs.getString("token", null) ?: return@runCatching ""
            val parts = encoded.split(':')
            val cipher = Cipher.getInstance("AES/GCM/NoPadding")
            cipher.init(Cipher.DECRYPT_MODE, key(), GCMParameterSpec(128, decode(parts[0])))
            String(cipher.doFinal(decode(parts[1])), Charsets.UTF_8)
        }.getOrElse { prefs.edit().clear().apply(); storefront = ""; "" }
    }

    fun save(token: String, store: String) {
        require(token.isNotBlank() && store.matches(Regex("[a-z]{2}")))
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, key())
        val encrypted = encode(cipher.iv) + ":" + encode(cipher.doFinal(token.toByteArray(Charsets.UTF_8)))
        check(prefs.edit().putString("token", encrypted).putString("storefront", store).commit())
        userToken = token; storefront = store
    }

    fun clear() { prefs.edit().clear().commit(); userToken = ""; storefront = "" }

    private fun key(): SecretKey {
        val store = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
        (store.getKey(alias, null) as? SecretKey)?.let { return it }
        return KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore").apply {
            init(KeyGenParameterSpec.Builder(alias, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM).setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE).build())
        }.generateKey()
    }

    private fun encode(bytes: ByteArray) = Base64.encodeToString(bytes, Base64.NO_WRAP)
    private fun decode(value: String) = Base64.decode(value, Base64.NO_WRAP)
}

object AppleMusicConfig {
    val developerToken get() = BuildConfig.APPLE_MUSIC_DEVELOPER_TOKEN.trim()
    fun tokenProblem(): String? {
        if (developerToken.isEmpty()) return "Apple Music 연결 준비 중입니다. 개발자 설정을 완료한 뒤 다시 시도해 주세요."
        return runCatching {
            val payload = developerToken.split('.')[1]
            val claims = JSONObject(String(Base64.decode(payload, Base64.URL_SAFE or Base64.NO_WRAP), Charsets.UTF_8))
            if (claims.getLong("exp") <= System.currentTimeMillis() / 1000 + 60)
                "Apple Music 연결 설정이 만료됐어요. 개발자 토큰을 갱신해 주세요." else null
        }.getOrElse { "Apple Music 연결 설정이 올바르지 않아요. 개발자 토큰을 확인해 주세요." }
    }
}
