package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final P0 f18694f = new P0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f18697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18698d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18699e;

    public P0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f18695a = i10;
        this.f18696b = iArr;
        this.f18697c = objArr;
        this.f18699e = z10;
    }

    public static P0 c() {
        return new P0(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f18696b;
        if (i10 > iArr.length) {
            int i11 = this.f18695a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f18696b = Arrays.copyOf(iArr, i10);
            this.f18697c = Arrays.copyOf(this.f18697c, i10);
        }
    }

    public final int b() {
        int iC;
        int iE;
        int iC2;
        int i10 = this.f18698d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f18695a; i12++) {
            int i13 = this.f18696b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f18697c[i12]).getClass();
                    iC2 = AbstractC1267t.C(i14) + 8;
                } else if (i15 == 2) {
                    iC2 = AbstractC1267t.y(i14, (AbstractC1252l) this.f18697c[i12]);
                } else if (i15 == 3) {
                    iC = AbstractC1267t.C(i14) * 2;
                    iE = ((P0) this.f18697c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(X.l());
                    }
                    ((Integer) this.f18697c[i12]).getClass();
                    iC2 = AbstractC1267t.C(i14) + 4;
                }
                i11 = iC2 + i11;
            } else {
                long jLongValue = ((Long) this.f18697c[i12]).longValue();
                iC = AbstractC1267t.C(i14);
                iE = AbstractC1267t.E(jLongValue);
            }
            i11 = iE + iC + i11;
        }
        this.f18698d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f18699e) {
            throw new UnsupportedOperationException();
        }
        a(this.f18695a + 1);
        int[] iArr = this.f18696b;
        int i11 = this.f18695a;
        iArr[i11] = i10;
        this.f18697c[i11] = obj;
        this.f18695a = i11 + 1;
    }

    public final void e(C1247i0 c1247i0) {
        if (this.f18695a == 0) {
            return;
        }
        c1247i0.getClass();
        for (int i10 = 0; i10 < this.f18695a; i10++) {
            int i11 = this.f18696b[i10];
            Object obj = this.f18697c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            AbstractC1267t abstractC1267t = (AbstractC1267t) c1247i0.f18743a;
            if (i13 == 0) {
                abstractC1267t.Y(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                abstractC1267t.N(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c1247i0.b(i12, (AbstractC1252l) obj);
            } else if (i13 == 3) {
                abstractC1267t.V(i12, 3);
                ((P0) obj).e(c1247i0);
                abstractC1267t.V(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(X.l());
                }
                abstractC1267t.L(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof P0)) {
            return false;
        }
        P0 p10 = (P0) obj;
        int i10 = this.f18695a;
        if (i10 == p10.f18695a) {
            int[] iArr = this.f18696b;
            int[] iArr2 = p10.f18696b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f18697c;
            Object[] objArr2 = p10.f18697c;
            int i12 = this.f18695a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f18695a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f18696b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f18697c;
        int i15 = this.f18695a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
