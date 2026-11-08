package D8;

import java.util.Random;

/* JADX INFO: renamed from: D8.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0267d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f2506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f2508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f2509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2510e;

    public final long a() {
        long j10 = this.f2510e;
        double d10 = j10;
        this.f2510e = Math.min((long) (this.f2508c * d10), this.f2507b);
        double d11 = this.f2509d;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        p229v9.a.h(d13 >= d12);
        return j10 + ((long) ((this.f2506a.nextDouble() * (d13 - d12)) + d12));
    }
}
