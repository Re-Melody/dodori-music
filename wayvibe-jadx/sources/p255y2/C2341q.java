package p255y2;

import B2.C;
import F.C0356a;

/* JADX INFO: renamed from: y2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2341q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28969a;

    static {
        new C2341q(new C0356a());
        C.D(0);
        C.D(1);
        C.D(2);
        C.D(3);
        C.D(4);
        C.D(5);
        C.D(6);
    }

    public C2341q(C0356a c0356a) {
        c0356a.getClass();
        int i10 = C.f560a;
        this.f28969a = c0356a.f3516a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2341q)) {
            return false;
        }
        C2341q c2341q = (C2341q) obj;
        c2341q.getClass();
        return this.f28969a == c2341q.f28969a;
    }

    public final int hashCode() {
        long j10 = this.f28969a;
        return ((((int) 0) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 29791;
    }
}
