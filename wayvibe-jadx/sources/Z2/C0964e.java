package Z2;

/* JADX INFO: renamed from: Z2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13524d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13528h;

    public C0964e(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f13521a = j10;
        this.f13522b = j11;
        this.f13525e = j12;
        this.f13526f = j13;
        this.f13527g = j14;
        this.f13523c = j15;
        this.f13528h = a(j11, 0L, j12, j13, j14, j15);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return B2.C.k(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
    }
}
