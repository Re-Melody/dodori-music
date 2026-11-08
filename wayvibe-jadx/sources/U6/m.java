package U6;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class m implements R6.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K6.c f12264e = K6.c.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f12267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12268d;

    public m(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        l lVar = new l(this);
        this.f12265a = lVar;
        if (!f12264e.f()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f12266b = str;
        this.f12267c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f12268d = 20;
                break;
            case "HMACSHA224":
                this.f12268d = 28;
                break;
            case "HMACSHA256":
                this.f12268d = 32;
                break;
            case "HMACSHA384":
                this.f12268d = 48;
                break;
            case "HMACSHA512":
                this.f12268d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        lVar.get();
    }

    @Override // R6.c
    public final byte[] e(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f12268d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        l lVar = this.f12265a;
        ((Mac) lVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i10);
    }
}
