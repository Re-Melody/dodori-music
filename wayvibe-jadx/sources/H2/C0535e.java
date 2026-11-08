package H2;

import A6.k0;
import java.util.Set;

/* JADX INFO: renamed from: H2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0535e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0535e f5894d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A6.I f5897c;

    static {
        C0535e c0535e;
        if (B2.C.f560a >= 33) {
            A6.H h10 = new A6.H(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                h10.a(Integer.valueOf(B2.C.r(i10)));
            }
            c0535e = new C0535e(2, h10.f());
        } else {
            c0535e = new C0535e(2, 10);
        }
        f5894d = c0535e;
    }

    public C0535e(int i10, Set set) {
        this.f5895a = i10;
        A6.I iR = A6.I.r(set);
        this.f5897c = iR;
        k0 it = iR.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f5896b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0535e)) {
            return false;
        }
        C0535e c0535e = (C0535e) obj;
        return this.f5895a == c0535e.f5895a && this.f5896b == c0535e.f5896b && B2.C.a(this.f5897c, c0535e.f5897c);
    }

    public final int hashCode() {
        int i10 = ((this.f5895a * 31) + this.f5896b) * 31;
        A6.I i11 = this.f5897c;
        return i10 + (i11 == null ? 0 : i11.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f5895a + ", maxChannelCount=" + this.f5896b + ", channelMasks=" + this.f5897c + "]";
    }

    public C0535e(int i10, int i11) {
        this.f5895a = i10;
        this.f5896b = i11;
        this.f5897c = null;
    }
}
