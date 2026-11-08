package p019b3;

import B2.AbstractC0111a;
import B2.C;
import Z2.A;
import Z2.F;
import Z2.y;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f15740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15749j;
    public long[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f15750l;

    public e(int i10, int i11, long j10, int i12, F f10) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        AbstractC0111a.d(z10);
        this.f15743d = j10;
        this.f15744e = i12;
        this.f15740a = f10;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f15741b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f15742c = i11 == 2 ? i13 | 1650720768 : -1;
        this.k = new long[512];
        this.f15750l = new int[512];
    }

    public final A a(int i10) {
        return new A(((this.f15743d * ((long) 1)) / ((long) this.f15744e)) * ((long) this.f15750l[i10]), this.k[i10]);
    }

    public final y b(long j10) {
        int i10 = (int) (j10 / ((this.f15743d * ((long) 1)) / ((long) this.f15744e)));
        int iE = C.e(this.f15750l, i10, true, true);
        if (this.f15750l[iE] == i10) {
            A a10 = a(iE);
            return new y(a10, a10);
        }
        A a11 = a(iE);
        int i11 = iE + 1;
        return i11 < this.k.length ? new y(a11, a(i11)) : new y(a11, a11);
    }
}
