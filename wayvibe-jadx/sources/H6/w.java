package H6;

import O6.N;
import O6.T;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class w implements F6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K6.c f6128d = K6.c.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f6131c;

    public w(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f6128d.f()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f6129a = bArr;
        this.f6130b = bArr2;
        this.f6131c = provider;
    }

    @Override // F6.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = N.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(o.a(this.f6129a, bArrA), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(bArrA, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        K6.c cVar = l.f6099d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f6131c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr4 = this.f6130b;
        if (outputSize > 2147483623 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + 24 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, bArr4.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, bArr4.length + 24) == outputSize) {
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
        byte[] bArr3 = this.f6130b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!T.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(o.a(this.f6129a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        K6.c cVar = l.f6099d;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f6131c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }
}
