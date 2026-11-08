package F2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R2.D f4000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4008i;

    public S(R2.D d10, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = true;
        AbstractC0111a.d(!z13 || z11);
        AbstractC0111a.d(!z12 || z11);
        if (z10 && (z11 || z12 || z13)) {
            z14 = false;
        }
        AbstractC0111a.d(z14);
        this.f4000a = d10;
        this.f4001b = j10;
        this.f4002c = j11;
        this.f4003d = j12;
        this.f4004e = j13;
        this.f4005f = z10;
        this.f4006g = z11;
        this.f4007h = z12;
        this.f4008i = z13;
    }

    public final S a(long j10) {
        if (j10 == this.f4002c) {
            return this;
        }
        return new S(this.f4000a, this.f4001b, j10, this.f4003d, this.f4004e, this.f4005f, this.f4006g, this.f4007h, this.f4008i);
    }

    public final S b(long j10) {
        if (j10 == this.f4001b) {
            return this;
        }
        return new S(this.f4000a, j10, this.f4002c, this.f4003d, this.f4004e, this.f4005f, this.f4006g, this.f4007h, this.f4008i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            S s8 = (S) obj;
            if (this.f4001b == s8.f4001b && this.f4002c == s8.f4002c && this.f4003d == s8.f4003d && this.f4004e == s8.f4004e && this.f4005f == s8.f4005f && this.f4006g == s8.f4006g && this.f4007h == s8.f4007h && this.f4008i == s8.f4008i && B2.C.a(this.f4000a, s8.f4000a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f4000a.hashCode() + 527) * 31) + ((int) this.f4001b)) * 31) + ((int) this.f4002c)) * 31) + ((int) this.f4003d)) * 31) + ((int) this.f4004e)) * 31) + (this.f4005f ? 1 : 0)) * 31) + (this.f4006g ? 1 : 0)) * 31) + (this.f4007h ? 1 : 0)) * 31) + (this.f4008i ? 1 : 0);
    }
}
