package Z2;

import B2.AbstractC0111a;

/* JADX INFO: loaded from: classes.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f13592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f13593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13595d;

    public w(long[] jArr, long[] jArr2, long j10) {
        AbstractC0111a.d(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f13595d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f13592a = jArr;
            this.f13593b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f13592a = jArr3;
            long[] jArr4 = new long[i10];
            this.f13593b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f13594c = j10;
    }

    @Override // Z2.z
    public final boolean d() {
        return this.f13595d;
    }

    @Override // Z2.z
    public final y i(long j10) {
        if (!this.f13595d) {
            A a10 = A.f13455c;
            return new y(a10, a10);
        }
        long[] jArr = this.f13593b;
        int iF = B2.C.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f13592a;
        A a11 = new A(j11, jArr2[iF]);
        if (j11 == j10 || iF == jArr.length - 1) {
            return new y(a11, a11);
        }
        int i10 = iF + 1;
        return new y(a11, new A(jArr[i10], jArr2[i10]));
    }

    @Override // Z2.z
    public final long l() {
        return this.f13594c;
    }
}
