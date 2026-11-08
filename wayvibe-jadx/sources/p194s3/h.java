package p194s3;

import B2.AbstractC0111a;
import B2.C;
import Z2.A;
import Z2.y;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f26115g;

    public h(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f26109a = j10;
        this.f26110b = i10;
        this.f26111c = j11;
        this.f26112d = i11;
        this.f26113e = j12;
        this.f26115g = jArr;
        this.f26114f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // p194s3.f
    public final long a(long j10) {
        long j11 = j10 - this.f26109a;
        if (!d() || j11 <= this.f26110b) {
            return 0L;
        }
        long[] jArr = this.f26115g;
        AbstractC0111a.i(jArr);
        double d10 = (j11 * 256.0d) / this.f26113e;
        int iF = C.f(jArr, (long) d10, true);
        long j12 = this.f26111c;
        long j13 = (((long) iF) * j12) / 100;
        long j14 = jArr[iF];
        int i10 = iF + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iF == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // p194s3.f
    public final long c() {
        return this.f26114f;
    }

    @Override // Z2.z
    public final boolean d() {
        return this.f26115g != null;
    }

    @Override // Z2.z
    public final y i(long j10) {
        double d10;
        double d11;
        boolean zD = d();
        int i10 = this.f26110b;
        long j11 = this.f26109a;
        if (!zD) {
            A a10 = new A(0L, j11 + ((long) i10));
            return new y(a10, a10);
        }
        long jK = C.k(j10, 0L, this.f26111c);
        double d12 = (jK * 100.0d) / this.f26111c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = this.f26115g;
            AbstractC0111a.i(jArr);
            double d14 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i11))) + d14;
        }
        long j12 = this.f26113e;
        A a11 = new A(jK, j11 + C.k(Math.round((d13 / d10) * j12), i10, j12 - 1));
        return new y(a11, a11);
    }

    @Override // p194s3.f
    public final int j() {
        return this.f26112d;
    }

    @Override // Z2.z
    public final long l() {
        return this.f26111c;
    }
}
