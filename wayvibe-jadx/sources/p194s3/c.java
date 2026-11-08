package p194s3;

import B2.C;
import Z2.A;
import Z2.y;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f26082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f26083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26084c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f26082a = jArr;
        this.f26083b = jArr2;
        this.f26084c = j10 == -9223372036854775807L ? C.I(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair b(long[] jArr, long[] jArr2, long j10) {
        int iF = C.f(jArr, j10, true);
        long j11 = jArr[iF];
        long j12 = jArr2[iF];
        int i10 = iF + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // p194s3.f
    public final long a(long j10) {
        return C.I(((Long) b(this.f26082a, this.f26083b, j10).second).longValue());
    }

    @Override // p194s3.f
    public final long c() {
        return -1L;
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        Pair pairB = b(this.f26083b, this.f26082a, C.T(C.k(j10, 0L, this.f26084c)));
        A a10 = new A(C.I(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new y(a10, a10);
    }

    @Override // p194s3.f
    public final int j() {
        return -2147483647;
    }

    @Override // Z2.z
    public final long l() {
        return this.f26084c;
    }
}
