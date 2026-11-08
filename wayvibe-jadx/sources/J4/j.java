package J4;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f6612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f6613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f6614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f6615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A4.f[] f6616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p235w4.n[] f6617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6619j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p235w4.n f6625q;
    public int r;

    public final int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.f6615f[i10] <= j10; i13++) {
            if (!z10 || (this.f6614e[i10] & 1) != 0) {
                i12 = i13;
            }
            i10++;
            if (i10 == this.f6610a) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final void b(int i10) {
        int i11 = this.f6619j;
        int i12 = this.f6618i;
        int i13 = (i11 + i12) - i10;
        X4.a.k(i13 >= 0 && i13 <= i12 - this.f6620l);
        int i14 = this.f6618i - i13;
        this.f6618i = i14;
        this.f6622n = Math.max(this.f6621m, d(i14));
        int i15 = this.f6618i;
        if (i15 == 0) {
            return;
        }
        int iF = f(i15 - 1);
        long j10 = this.f6612c[iF];
        int i16 = this.f6613d[iF];
    }

    public final long c(int i10) {
        this.f6621m = Math.max(this.f6621m, d(i10));
        int i11 = this.f6618i - i10;
        this.f6618i = i11;
        this.f6619j += i10;
        int i12 = this.k + i10;
        this.k = i12;
        int i13 = this.f6610a;
        if (i12 >= i13) {
            this.k = i12 - i13;
        }
        int i14 = this.f6620l - i10;
        this.f6620l = i14;
        if (i14 < 0) {
            this.f6620l = 0;
        }
        if (i11 != 0) {
            return this.f6612c[this.k];
        }
        int i15 = this.k;
        if (i15 != 0) {
            i13 = i15;
        }
        int i16 = i13 - 1;
        return this.f6612c[i16] + ((long) this.f6613d[i16]);
    }

    public final long d(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f6615f[iF]);
            if ((this.f6614e[iF] & 1) != 0) {
                return jMax;
            }
            iF--;
            if (iF == -1) {
                iF = this.f6610a - 1;
            }
        }
        return jMax;
    }

    public final synchronized boolean e() {
        return this.f6620l != this.f6618i;
    }

    public final int f(int i10) {
        int i11 = this.k + i10;
        int i12 = this.f6610a;
        return i11 < i12 ? i11 : i11 - i12;
    }
}
