package B4;

import X4.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f670d;

    public e(long j10, long j11, long[] jArr, long j12) {
        this.f667a = j10;
        this.f668b = j11;
        this.f669c = jArr;
        this.f670d = j12;
    }

    @Override // B4.b
    public final long a(long j10) {
        long j11;
        if (!b()) {
            return 0L;
        }
        long j12 = this.f667a;
        if (j10 < j12) {
            return 0L;
        }
        double d10 = ((j10 - j12) * 256.0d) / this.f670d;
        long[] jArr = this.f669c;
        int iC = j.c(jArr, (long) d10, false);
        int i10 = iC + 1;
        long j13 = this.f668b;
        long j14 = (((long) i10) * j13) / 100;
        long j15 = i10 == 0 ? 0L : jArr[iC];
        long j16 = i10 == 99 ? 256L : jArr[i10];
        long j17 = (j13 * ((long) (iC + 2))) / 100;
        if (j16 == j15) {
            j11 = 0;
        } else {
            j11 = (long) (((d10 - j15) * (j17 - j14)) / (j16 - j15));
        }
        return j14 + j11;
    }

    public final boolean b() {
        return this.f669c != null;
    }
}
