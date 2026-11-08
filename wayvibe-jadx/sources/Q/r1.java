package Q;

import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10443e;

    public r1(long j10, long j11, long j12, long j13, long j14) {
        this.f10439a = j10;
        this.f10440b = j11;
        this.f10441c = j12;
        this.f10442d = j13;
        this.f10443e = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return C2096x.c(this.f10439a, r1Var.f10439a) && C2096x.c(this.f10440b, r1Var.f10440b) && C2096x.c(this.f10441c, r1Var.f10441c) && C2096x.c(this.f10442d, r1Var.f10442d) && C2096x.c(this.f10443e, r1Var.f10443e);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f10443e) + p134m1.b.g(this.f10442d, p134m1.b.g(this.f10441c, p134m1.b.g(this.f10440b, Long.hashCode(this.f10439a) * 31, 31), 31), 31);
    }
}
