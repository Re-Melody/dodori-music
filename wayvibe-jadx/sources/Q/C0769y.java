package Q;

import p143n0.C2096x;

/* JADX INFO: renamed from: Q.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0769y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10534d;

    public C0769y(long j10, long j11, long j12, long j13) {
        this.f10531a = j10;
        this.f10532b = j11;
        this.f10533c = j12;
        this.f10534d = j13;
    }

    public final C0769y a(long j10, long j11, long j12, long j13) {
        if (j10 == 16) {
            j10 = this.f10531a;
        }
        return new C0769y(j10, j11 != 16 ? j11 : this.f10532b, j12 != 16 ? j12 : this.f10533c, j13 != 16 ? j13 : this.f10534d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0769y)) {
            return false;
        }
        C0769y c0769y = (C0769y) obj;
        return C2096x.c(this.f10531a, c0769y.f10531a) && C2096x.c(this.f10532b, c0769y.f10532b) && C2096x.c(this.f10533c, c0769y.f10533c) && C2096x.c(this.f10534d, c0769y.f10534d);
    }

    public final int hashCode() {
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.f10534d) + p134m1.b.g(this.f10533c, p134m1.b.g(this.f10532b, Long.hashCode(this.f10531a) * 31, 31), 31);
    }
}
