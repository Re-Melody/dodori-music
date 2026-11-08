package U6;

import G0.C0467f0;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K6.c f12227d = K6.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0467f0 f12228e = new C0467f0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f12229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12231c;

    public a(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!f12227d.f()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        o.a(bArr.length);
        this.f12229a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f12228e.get()).getBlockSize();
        this.f12231c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f12230b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f12228e.get();
        byte[] bArr4 = new byte[this.f12231c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f12230b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f12229a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
