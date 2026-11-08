package p194s3;

import B2.C;
import Z2.A;
import Z2.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f26104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f26105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26108e;

    public g(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f26104a = jArr;
        this.f26105b = jArr2;
        this.f26106c = j10;
        this.f26107d = j11;
        this.f26108e = i10;
    }

    @Override // p194s3.f
    public final long a(long j10) {
        return this.f26104a[C.f(this.f26105b, j10, true)];
    }

    @Override // p194s3.f
    public final long c() {
        return this.f26107d;
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        long[] jArr = this.f26104a;
        int iF = C.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f26105b;
        A a10 = new A(j11, jArr2[iF]);
        if (j11 >= j10 || iF == jArr.length - 1) {
            return new y(a10, a10);
        }
        int i10 = iF + 1;
        return new y(a10, new A(jArr[i10], jArr2[i10]));
    }

    @Override // p194s3.f
    public final int j() {
        return this.f26108e;
    }

    @Override // Z2.z
    public final long l() {
        return this.f26106c;
    }
}
