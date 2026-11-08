package G3;

import B2.C;
import C4.g;
import Z2.A;
import Z2.y;
import Z2.z;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class e implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5459e;

    public e(g gVar, int i10, long j10, long j11) {
        this.f5455a = gVar;
        this.f5456b = i10;
        this.f5457c = j10;
        long j12 = (j11 - j10) / ((long) gVar.f1341d);
        this.f5458d = j12;
        this.f5459e = b(j12);
    }

    public final long b(long j10) {
        long j11 = j10 * ((long) this.f5456b);
        long j12 = this.f5455a.f1340c;
        int i10 = C.f560a;
        return C.Q(j11, 1000000L, j12, RoundingMode.FLOOR);
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        g gVar = this.f5455a;
        long j11 = (((long) gVar.f1340c) * j10) / (((long) this.f5456b) * 1000000);
        long j12 = this.f5458d;
        long jK = C.k(j11, 0L, j12 - 1);
        long j13 = ((long) gVar.f1341d) * jK;
        long j14 = this.f5457c;
        long jB = b(jK);
        A a10 = new A(jB, j13 + j14);
        if (jB >= j10 || jK == j12 - 1) {
            return new y(a10, a10);
        }
        long j15 = jK + 1;
        return new y(a10, new A(b(j15), (((long) gVar.f1341d) * j15) + j14));
    }

    @Override // Z2.z
    public final long l() {
        return this.f5459e;
    }
}
