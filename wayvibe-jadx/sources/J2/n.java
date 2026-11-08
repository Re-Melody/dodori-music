package J2;

import B2.C;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f6531i;

    public n(j jVar, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(jVar, j10, j11);
        this.f6526d = j12;
        this.f6527e = j13;
        this.f6528f = list;
        this.f6531i = j14;
        this.f6529g = j15;
        this.f6530h = j16;
    }

    public final long b(long j10, long j11) {
        long jD = d(j10);
        return jD != -1 ? jD : (int) (f((j11 - this.f6530h) + this.f6531i, j10) - c(j10, j11));
    }

    public final long c(long j10, long j11) {
        long jD = d(j10);
        long j12 = this.f6526d;
        if (jD == -1) {
            long j13 = this.f6529g;
            if (j13 != -9223372036854775807L) {
                return Math.max(j12, f((j11 - this.f6530h) - j13, j10));
            }
        }
        return j12;
    }

    public abstract long d(long j10);

    public final long e(long j10, long j11) {
        long j12 = this.f6540b;
        long j13 = this.f6526d;
        List list = this.f6528f;
        if (list != null) {
            return (((q) list.get((int) (j10 - j13))).f6536b * 1000000) / j12;
        }
        long jD = d(j11);
        return (jD == -1 || j10 != (j13 + jD) - 1) ? (this.f6527e * 1000000) / j12 : j11 - g(j10);
    }

    public final long f(long j10, long j11) {
        long jD = d(j11);
        long j12 = this.f6526d;
        if (jD != 0) {
            if (this.f6528f != null) {
                long j13 = (jD + j12) - 1;
                long j14 = j12;
                while (j14 <= j13) {
                    long j15 = ((j13 - j14) / 2) + j14;
                    long jG = g(j15);
                    if (jG < j10) {
                        j14 = j15 + 1;
                    } else {
                        if (jG <= j10) {
                            return j15;
                        }
                        j13 = j15 - 1;
                    }
                }
                return j14 == j12 ? j14 : j13;
            }
            long j16 = (j10 / ((this.f6527e * 1000000) / this.f6540b)) + j12;
            if (j16 >= j12) {
                return jD == -1 ? j16 : Math.min(j16, (j12 + jD) - 1);
            }
        }
        return j12;
    }

    public final long g(long j10) {
        long j11 = this.f6526d;
        List list = this.f6528f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).f6535a - this.f6541c : (j10 - j11) * this.f6527e;
        int i10 = C.f560a;
        return C.Q(j12, 1000000L, this.f6540b, RoundingMode.FLOOR);
    }

    public abstract j h(k kVar, long j10);

    public boolean i() {
        return this.f6528f != null;
    }
}
