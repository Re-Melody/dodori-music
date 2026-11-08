package N6;

import android.util.Log;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class b implements F6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8616a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8617b;

    public b(String str) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f8617b = new b(str, keyStore);
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // F6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Object obj = this.f8617b;
        switch (this.f8616a) {
            case 0:
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[bArr.length + 28];
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, (SecretKey) obj);
                cipher.updateAAD(bArr2);
                if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                    throw new GeneralSecurityException("encryption failed: bytesWritten is wrong");
                }
                byte[] iv = cipher.getIV();
                if (iv.length != 12) {
                    throw new GeneralSecurityException("IV has unexpected length");
                }
                System.arraycopy(iv, 0, bArr3, 0, 12);
                return bArr3;
            default:
                b bVar = (b) obj;
                try {
                    return bVar.a(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e2);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return bVar.a(bArr, bArr2);
                }
        }
    }

    @Override // F6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Object obj = this.f8617b;
        switch (this.f8616a) {
            case 0:
                if (bArr.length < 28) {
                    throw new BadPaddingException("ciphertext too short");
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, bArr, 0, 12);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, (SecretKey) obj, gCMParameterSpec);
                cipher.updateAAD(bArr2);
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            default:
                b bVar = (b) obj;
                try {
                    return bVar.b(bArr, bArr2);
                } catch (BadPaddingException e2) {
                    throw e2;
                } catch (GeneralSecurityException e4) {
                    e = e4;
                    Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return bVar.b(bArr, bArr2);
                } catch (ProviderException e7) {
                    e = e7;
                    Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return bVar.b(bArr, bArr2);
                }
        }
    }

    public b(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f8617b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(p134m1.b.k("Keystore cannot load the key with ID: ", str));
        }
    }
}
