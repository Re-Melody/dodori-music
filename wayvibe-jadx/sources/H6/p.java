package H6;

import G0.C0467f0;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K6.c f6112b = K6.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f6113a;

    public p(byte[] bArr) throws GeneralSecurityException {
        if (!f6112b.f()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C0467f0 c0467f0 = e.f6079a;
        U6.o.a(bArr.length);
        this.f6113a = new SecretKeySpec(bArr, "AES");
    }
}
