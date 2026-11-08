package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f18436f = new h0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f18439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18440d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18441e;

    public h0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f18437a = i10;
        this.f18438b = iArr;
        this.f18439c = objArr;
        this.f18441e = z10;
    }

    public static h0 c() {
        return new h0(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f18438b;
        if (i10 > iArr.length) {
            int i11 = this.f18437a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f18438b = Arrays.copyOf(iArr, i10);
            this.f18439c = Arrays.copyOf(this.f18439c, i10);
        }
    }

    public final int b() {
        int iZ;
        int iB0;
        int iZ2;
        int i10 = this.f18440d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f18437a; i12++) {
            int i13 = this.f18438b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f18439c[i12]).getClass();
                    iZ2 = C1191l.Z(i14) + 8;
                } else if (i15 == 2) {
                    iZ2 = C1191l.V(i14, (AbstractC1188i) this.f18439c[i12]);
                } else if (i15 == 3) {
                    iZ = C1191l.Z(i14) * 2;
                    iB0 = ((h0) this.f18439c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(G.k());
                    }
                    ((Integer) this.f18439c[i12]).getClass();
                    iZ2 = C1191l.Z(i14) + 4;
                }
                i11 = iZ2 + i11;
            } else {
                long jLongValue = ((Long) this.f18439c[i12]).longValue();
                iZ = C1191l.Z(i14);
                iB0 = C1191l.b0(jLongValue);
            }
            i11 = iB0 + iZ + i11;
        }
        this.f18440d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f18441e) {
            throw new UnsupportedOperationException();
        }
        a(this.f18437a + 1);
        int[] iArr = this.f18438b;
        int i11 = this.f18437a;
        iArr[i11] = i10;
        this.f18439c[i11] = obj;
        this.f18437a = i11 + 1;
    }

    public final void e(N n6) {
        if (this.f18437a == 0) {
            return;
        }
        n6.getClass();
        for (int i10 = 0; i10 < this.f18437a; i10++) {
            int i11 = this.f18438b[i10];
            Object obj = this.f18439c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            C1191l c1191l = (C1191l) n6.f18386a;
            if (i13 == 0) {
                c1191l.n0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c1191l.g0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                n6.a(i12, (AbstractC1188i) obj);
            } else if (i13 == 3) {
                c1191l.k0(i12, 3);
                ((h0) obj).e(n6);
                c1191l.k0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(G.k());
                }
                c1191l.e0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i10 = this.f18437a;
        if (i10 == h0Var.f18437a) {
            int[] iArr = this.f18438b;
            int[] iArr2 = h0Var.f18438b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f18439c;
            Object[] objArr2 = h0Var.f18439c;
            int i12 = this.f18437a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f18437a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f18438b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f18439c;
        int i15 = this.f18437a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
