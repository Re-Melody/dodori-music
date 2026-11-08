package F2;

/* JADX INFO: renamed from: F2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4145g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4152o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4146h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4147i = -9223372036854775807L;
    public long k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4149l = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4153p = 1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4154q = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4148j = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4150m = -9223372036854775807L;
    public long r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4155s = -9223372036854775807L;

    public C0415h(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f4139a = f10;
        this.f4140b = f11;
        this.f4141c = j10;
        this.f4142d = f12;
        this.f4143e = j11;
        this.f4144f = j12;
        this.f4145g = f13;
        this.f4152o = f10;
        this.f4151n = f11;
    }

    public final void a() {
        long j10;
        long j11 = this.f4146h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f4147i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f4149l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f4148j == j10) {
            return;
        }
        this.f4148j = j10;
        this.f4150m = j10;
        this.r = -9223372036854775807L;
        this.f4155s = -9223372036854775807L;
        this.f4154q = -9223372036854775807L;
    }
}
