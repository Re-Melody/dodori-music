package U6;

import G0.C0467f0;
import O6.N;
import O6.T;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class c implements F6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K6.c f12238c = K6.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f12239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12240b;

    public c(byte[] bArr, V6.a aVar) throws GeneralSecurityException {
        if (!f12238c.f()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C0467f0 c0467f0 = H6.e.f6079a;
        o.a(bArr.length);
        this.f12239a = new SecretKeySpec(bArr, "AES");
        this.f12240b = aVar.b();
    }

    @Override // F6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = N.a(12);
        AlgorithmParameterSpec algorithmParameterSpecA = H6.e.a(bArrA, 0, bArrA.length);
        Cipher cipher = (Cipher) H6.e.f6079a.get();
        cipher.init(1, this.f12239a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f12240b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr3.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // F6.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f12240b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!T.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = H6.e.a(bArr, bArr3.length, 12);
        Cipher cipher = (Cipher) H6.e.f6079a.get();
        cipher.init(2, this.f12239a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
