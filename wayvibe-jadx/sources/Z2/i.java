package Z2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f13535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f13536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f13537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13538f;

    public i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f13534b = iArr;
        this.f13535c = jArr;
        this.f13536d = jArr2;
        this.f13537e = jArr3;
        int length = iArr.length;
        this.f13533a = length;
        if (length > 0) {
            this.f13538f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f13538f = 0L;
        }
    }

    @Override // Z2.z
    public final boolean d() {
        return true;
    }

    @Override // Z2.z
    public final y i(long j10) {
        long[] jArr = this.f13537e;
        int iF = B2.C.f(jArr, j10, true);
        long j11 = jArr[iF];
        long[] jArr2 = this.f13535c;
        A a10 = new A(j11, jArr2[iF]);
        if (j11 >= j10 || iF == this.f13533a - 1) {
            return new y(a10, a10);
        }
        int i10 = iF + 1;
        return new y(a10, new A(jArr[i10], jArr2[i10]));
    }

    @Override // Z2.z
    public final long l() {
        return this.f13538f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f13533a + ", sizes=" + Arrays.toString(this.f13534b) + ", offsets=" + Arrays.toString(this.f13535c) + ", timeUs=" + Arrays.toString(this.f13537e) + ", durationsUs=" + Arrays.toString(this.f13536d) + ")";
    }
}
