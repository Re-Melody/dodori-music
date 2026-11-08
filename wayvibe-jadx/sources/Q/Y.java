package Q;

import p143n0.C2096x;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10014d;

    public Y(long j10, long j11, long j12, long j13) {
        this.f10011a = j10;
        this.f10012b = j11;
        this.f10013c = j12;
        this.f10014d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        return C2096x.c(this.f10011a, y6.f10011a) && C2096x.c(this.f10012b, y6.f10012b) && C2096x.c(this.f10013c, y6.f10013c) && C2096x.c(this.f10014d, y6.f10014d);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f10014d) + p134m1.b.g(this.f10013c, p134m1.b.g(this.f10012b, Long.hashCode(this.f10011a) * 31, 31), 31);
    }
}
