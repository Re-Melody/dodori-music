package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f15119f = new j0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15123d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15124e;

    public j0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f15120a = i10;
        this.f15121b = iArr;
        this.f15122c = objArr;
        this.f15124e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f15121b;
        if (i10 > iArr.length) {
            int i11 = this.f15120a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f15121b = Arrays.copyOf(iArr, i10);
            this.f15122c = Arrays.copyOf(this.f15122c, i10);
        }
    }

    public final int b() {
        int iU0;
        int iW0;
        int iU1;
        int i10 = this.f15123d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15120a; i12++) {
            int i13 = this.f15121b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f15122c[i12]).getClass();
                    iU1 = C1053k.u0(i14) + 8;
                } else if (i15 == 2) {
                    iU1 = C1053k.s0(i14, (C1049g) this.f15122c[i12]);
                } else if (i15 == 3) {
                    iU0 = C1053k.u0(i14) * 2;
                    iW0 = ((j0) this.f15122c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(C.g());
                    }
                    ((Integer) this.f15122c[i12]).getClass();
                    iU1 = C1053k.u0(i14) + 4;
                }
                i11 = iU1 + i11;
            } else {
                long jLongValue = ((Long) this.f15122c[i12]).longValue();
                iU0 = C1053k.u0(i14);
                iW0 = C1053k.w0(jLongValue);
            }
            i11 = iW0 + iU0 + i11;
        }
        this.f15123d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f15124e) {
            throw new UnsupportedOperationException();
        }
        a(this.f15120a + 1);
        int[] iArr = this.f15121b;
        int i11 = this.f15120a;
        iArr[i11] = i10;
        this.f15122c[i11] = obj;
        this.f15120a = i11 + 1;
    }

    public final void d(J j10) {
        if (this.f15120a == 0) {
            return;
        }
        j10.getClass();
        for (int i10 = 0; i10 < this.f15120a; i10++) {
            int i11 = this.f15121b[i10];
            Object obj = this.f15122c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            C1053k c1053k = (C1053k) j10.f15031a;
            if (i13 == 0) {
                c1053k.Q0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c1053k.G0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                j10.a(i12, (C1049g) obj);
            } else if (i13 == 3) {
                c1053k.N0(i12, 3);
                ((j0) obj).d(j10);
                c1053k.N0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(C.g());
                }
                c1053k.E0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i10 = this.f15120a;
        if (i10 == j0Var.f15120a) {
            int[] iArr = this.f15121b;
            int[] iArr2 = j0Var.f15121b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f15122c;
            Object[] objArr2 = j0Var.f15122c;
            int i12 = this.f15120a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15120a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f15121b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f15122c;
        int i15 = this.f15120a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
