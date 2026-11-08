package Z2;

/* JADX INFO: loaded from: classes.dex */
public class j implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13545g;

    public j(long j10, long j11, int i10, int i11, boolean z10) {
        this.f13539a = j10;
        this.f13540b = j11;
        this.f13541c = i11 == -1 ? 1 : i11;
        this.f13543e = i10;
        this.f13545g = z10;
        if (j10 == -1) {
            this.f13542d = -1L;
            this.f13544f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f13542d = j12;
            this.f13544f = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
    }

    @Override // Z2.z
    public final boolean d() {
        return this.f13542d != -1 || this.f13545g;
    }

    @Override // Z2.z
    public final y i(long j10) {
        long j11 = this.f13542d;
        long j12 = this.f13540b;
        if (j11 == -1 && !this.f13545g) {
            A a10 = new A(0L, j12);
            return new y(a10, a10);
        }
        int i10 = this.f13543e;
        long j13 = this.f13541c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j12;
        long jMax2 = (Math.max(0L, jMax - j12) * 8000000) / ((long) i10);
        A a11 = new A(jMax2, jMax);
        if (j11 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f13539a) {
                return new y(a11, new A((Math.max(0L, j14 - j12) * 8000000) / ((long) i10), j14));
            }
        }
        return new y(a11, a11);
    }

    @Override // Z2.z
    public final long l() {
        return this.f13544f;
    }
}
