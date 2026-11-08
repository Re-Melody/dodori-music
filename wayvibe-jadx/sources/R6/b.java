package R6;

import B2.AbstractC0112b;
import F6.j;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10909a;

    public b(int i10) {
        this.f10909a = i10;
    }

    public static b b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new b(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    @Override // F6.j
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f10909a == this.f10909a;
    }

    public final int hashCode() {
        return Objects.hash(b.class, Integer.valueOf(this.f10909a));
    }

    public final String toString() {
        return AbstractC0112b.i(new StringBuilder("AesCmac PRF Parameters ("), this.f10909a, "-byte key)");
    }
}
