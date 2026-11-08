package G6;

import B2.AbstractC0112b;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0516c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0524k f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5525b;

    public N(int i10, C0524k c0524k) {
        this.f5524a = c0524k;
        this.f5525b = i10;
    }

    public static N b(int i10, C0524k c0524k) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new N(i10, c0524k);
    }

    @Override // F6.j
    public final boolean a() {
        return this.f5524a != C0524k.f5559H;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n6 = (N) obj;
        return n6.f5524a == this.f5524a && n6.f5525b == this.f5525b;
    }

    public final int hashCode() {
        return Objects.hash(N.class, this.f5524a, Integer.valueOf(this.f5525b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(this.f5524a);
        sb.append("salt_size_bytes: ");
        return AbstractC0112b.i(sb, this.f5525b, ")");
    }
}
