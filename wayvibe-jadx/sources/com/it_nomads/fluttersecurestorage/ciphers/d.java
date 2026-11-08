package com.it_nomads.fluttersecurestorage.ciphers;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P7.e f18829c;

    public d(Context context, P7.e eVar) throws Exception {
        this.f18828b = context;
        this.f18829c = eVar;
        String str = context.getPackageName() + ".FlutterSecureStoragePluginKey";
        this.f18827a = str;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(str, null) == null) {
            a();
        }
    }

    public static Cipher b(Context context, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        String string = sharedPreferences.getString("KeyStoreIV1", null);
        if (string != null) {
            cipher.init(2, key, new GCMParameterSpec(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, Base64.decode(string, 0)));
            return cipher;
        }
        cipher.init(1, key);
        byte[] iv = cipher.getIV();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("KeyStoreIV1", Base64.encodeToString(iv, 0));
        editorEdit.apply();
        return cipher;
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public final byte[] B(SecretKeySpec secretKeySpec) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot wrap other keys");
    }

    public final void a() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        Context context = this.f18828b;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean z10 = keyguardManager != null && keyguardManager.isDeviceSecure();
        if (this.f18829c.f9750f && !z10) {
            throw new Exception("BIOMETRIC_UNAVAILABLE: Biometric enforcement enabled but device has no PIN, pattern, password, or biometric enrolled. Cannot generate secure key.");
        }
        if (!z10) {
            Log.w("AESCipher23", "Device has no PIN/biometric security. Generating key without user authentication requirement (enforceBiometrics=false).");
        }
        String str = this.f18827a;
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
        if (z10) {
            keySize.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                keySize.setUserAuthenticationParameters(0, 3);
            } else {
                keySize.setUserAuthenticationValidityDurationSeconds(-1);
            }
            keySize.setInvalidatedByBiometricEnrollment(true);
        } else {
            keySize.setUserAuthenticationRequired(false);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            keySize.setUnlockedDeviceRequired(true);
            if (i10 < 28 ? false : context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                keySize.setIsStrongBoxBacked(true);
                Log.d("AESCipher23", "StrongBox is available and enabled for biometric key");
            } else {
                Log.w("AESCipher23", "StrongBox requested but not available on this device. Using standard TEE.");
            }
        }
        try {
            keyGenerator.init(keySize.build());
            keyGenerator.generateKey();
        } catch (Exception e2) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                if (i11 < 28 ? false : context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    Log.w("AESCipher23", " Key generation failed with StrongBox. Retrying without StrongBox.", e2);
                    KeyGenParameterSpec.Builder unlockedDeviceRequired = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setUnlockedDeviceRequired(true);
                    if (z10) {
                        unlockedDeviceRequired.setUserAuthenticationRequired(true);
                        if (i11 >= 30) {
                            unlockedDeviceRequired.setUserAuthenticationParameters(0, 3);
                        } else {
                            unlockedDeviceRequired.setUserAuthenticationValidityDurationSeconds(-1);
                        }
                        unlockedDeviceRequired.setInvalidatedByBiometricEnrollment(true);
                    }
                    keyGenerator.init(unlockedDeviceRequired.build());
                    keyGenerator.generateKey();
                    Log.d("AESCipher23", "Key generation succeeded without StrongBox");
                    return;
                }
            }
            throw e2;
        }
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public final void i() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f18827a);
        this.f18828b.getSharedPreferences("FlutterSecureKeyStorage", 0).edit().remove("KeyStoreIV1").apply();
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public final Cipher p(Context context) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = this.f18827a;
        Key key = keyStore.getKey(str, null);
        if (key != null) {
            return b(context, key);
        }
        a();
        return b(context, keyStore.getKey(str, null));
    }

    @Override // com.it_nomads.fluttersecurestorage.ciphers.a
    public final Key t(byte[] bArr) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot unwrap other keys");
    }
}
