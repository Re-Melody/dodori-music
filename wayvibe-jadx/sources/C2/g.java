package C2;

import B2.AbstractC0111a;
import B2.AbstractC0112b;
import B2.t;
import java.util.Arrays;
import p255y2.C2332h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f1161a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f1162b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1163c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f1164d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        AbstractC0111a.h(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static d c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iG;
        t tVar = new t(i10 + 2, bArr, i11, 1);
        int i16 = 4;
        tVar.H(4);
        int iW = tVar.w(3);
        tVar.G();
        int iW2 = tVar.w(2);
        boolean zV = tVar.v();
        int iW3 = tVar.w(5);
        int i17 = 0;
        for (int i18 = 0; i18 < 32; i18++) {
            if (tVar.v()) {
                i17 |= 1 << i18;
            }
        }
        int[] iArr = new int[6];
        for (int i19 = 0; i19 < 6; i19++) {
            iArr[i19] = tVar.w(8);
        }
        int iW4 = tVar.w(8);
        int i20 = 0;
        for (int i21 = 0; i21 < iW; i21++) {
            if (tVar.v()) {
                i20 += 89;
            }
            if (tVar.v()) {
                i20 += 8;
            }
        }
        tVar.H(i20);
        if (iW > 0) {
            tVar.H((8 - iW) * 2);
        }
        tVar.A();
        int iA = tVar.A();
        if (iA == 3) {
            tVar.G();
        }
        int iA2 = tVar.A();
        int iA3 = tVar.A();
        if (tVar.v()) {
            int iA4 = tVar.A();
            int iA5 = tVar.A();
            int iA6 = tVar.A();
            int iA7 = tVar.A();
            iA2 -= (iA4 + iA5) * ((iA == 1 || iA == 2) ? 2 : 1);
            iA3 -= (iA6 + iA7) * (iA == 1 ? 2 : 1);
        }
        int iA8 = tVar.A();
        int i22 = iA2;
        int i23 = i17;
        int iA9 = tVar.A();
        int iA10 = tVar.A();
        int iF = -1;
        int iMax = -1;
        for (int i24 = tVar.v() ? 0 : iW; i24 <= iW; i24++) {
            tVar.A();
            iMax = Math.max(tVar.A(), iMax);
            tVar.A();
        }
        tVar.A();
        tVar.A();
        tVar.A();
        tVar.A();
        tVar.A();
        tVar.A();
        if (tVar.v() && tVar.v()) {
            int i25 = 0;
            while (i25 < i16) {
                int i26 = 0;
                while (i26 < 6) {
                    if (tVar.v()) {
                        int iMin = Math.min(64, 1 << ((i25 << 1) + i16));
                        if (i25 > 1) {
                            tVar.B();
                        }
                        for (int i27 = 0; i27 < iMin; i27++) {
                            tVar.B();
                        }
                    } else {
                        tVar.A();
                    }
                    i26 += i25 == 3 ? 3 : 1;
                    i16 = 4;
                }
                i25++;
                i16 = 4;
            }
        }
        tVar.H(2);
        if (tVar.v()) {
            tVar.H(8);
            tVar.A();
            tVar.A();
            tVar.G();
        }
        int iA11 = tVar.A();
        int[] iArrCopyOf = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i28 = 0;
        int i29 = -1;
        int i30 = -1;
        while (i28 < iA11) {
            if (i28 == 0 || !tVar.v()) {
                int iA12 = tVar.A();
                int iA13 = tVar.A();
                int[] iArr2 = new int[iA12];
                int i31 = 0;
                while (i31 < iA12) {
                    iArr2[i31] = (i31 > 0 ? iArr2[i31 - 1] : 0) - (tVar.A() + 1);
                    tVar.G();
                    i31++;
                }
                int[] iArr3 = new int[iA13];
                int i32 = 0;
                while (i32 < iA13) {
                    iArr3[i32] = tVar.A() + 1 + (i32 > 0 ? iArr3[i32 - 1] : 0);
                    tVar.G();
                    i32++;
                }
                i30 = iA13;
                iArrCopyOf2 = iArr3;
                iArrCopyOf = iArr2;
                i29 = iA12;
            } else {
                int i33 = i29 + i30;
                int iA14 = (1 - ((tVar.v() ? 1 : 0) * 2)) * (tVar.A() + 1);
                int i34 = i33 + 1;
                int[] iArr4 = iArrCopyOf;
                boolean[] zArr = new boolean[i34];
                for (int i35 = 0; i35 <= i33; i35++) {
                    if (tVar.v()) {
                        zArr[i35] = true;
                    } else {
                        zArr[i35] = tVar.v();
                    }
                }
                int[] iArr5 = new int[i34];
                int[] iArr6 = new int[i34];
                int i36 = 0;
                for (int i37 = i30 - 1; i37 >= 0; i37--) {
                    int i38 = iArrCopyOf2[i37] + iA14;
                    if (i38 < 0 && zArr[i29 + i37]) {
                        iArr5[i36] = i38;
                        i36++;
                    }
                }
                if (iA14 < 0 && zArr[i33]) {
                    iArr5[i36] = iA14;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < i29; i40++) {
                    int i41 = iArr4[i40] + iA14;
                    if (i41 < 0 && zArr[i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i39);
                int i42 = 0;
                for (int i43 = i29 - 1; i43 >= 0; i43--) {
                    int i44 = iArr4[i43] + iA14;
                    if (i44 > 0 && zArr[i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                if (iA14 > 0 && zArr[i33]) {
                    iArr6[i42] = iA14;
                    i42++;
                }
                int i45 = i39;
                int i46 = i42;
                for (int i47 = 0; i47 < i30; i47++) {
                    int i48 = iArrCopyOf2[i47] + iA14;
                    if (i48 > 0 && zArr[i29 + i47]) {
                        iArr6[i46] = i48;
                        i46++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr6, i46);
                i30 = i46;
                i29 = i45;
            }
            i28++;
            iMax = iMax;
            iA11 = iA11;
            iA8 = iA8;
        }
        int i49 = iMax;
        int i50 = iA8;
        if (tVar.v()) {
            int iA15 = tVar.A();
            for (int i51 = 0; i51 < iA15; i51++) {
                tVar.H(iA10 + 5);
            }
        }
        tVar.H(2);
        float f10 = 1.0f;
        if (tVar.v()) {
            if (tVar.v()) {
                int iW5 = tVar.w(8);
                if (iW5 == 255) {
                    int iW6 = tVar.w(16);
                    int iW7 = tVar.w(16);
                    if (iW6 != 0 && iW7 != 0) {
                        f10 = iW6 / iW7;
                    }
                } else if (iW5 < 17) {
                    f10 = f1162b[iW5];
                } else {
                    AbstractC0112b.r(iW5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (tVar.v()) {
                tVar.G();
            }
            if (tVar.v()) {
                tVar.H(3);
                i15 = tVar.v() ? 1 : 2;
                if (tVar.v()) {
                    int iW8 = tVar.w(8);
                    int iW9 = tVar.w(8);
                    tVar.H(8);
                    iF = C2332h.f(iW8);
                    iG = C2332h.g(iW9);
                } else {
                    iG = -1;
                }
            } else {
                i15 = -1;
                iG = -1;
            }
            if (tVar.v()) {
                tVar.A();
                tVar.A();
            }
            tVar.G();
            if (tVar.v()) {
                iA3 *= 2;
            }
            i14 = i15;
            i12 = iA3;
            i13 = iF;
            iF = iG;
        } else {
            i12 = iA3;
            i13 = -1;
            i14 = -1;
        }
        return new d(iW2, zV, iW3, i23, i50, iA9, iArr, iW4, i22, i12, f10, i49, i13, i14, iF);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01db  */
    /* JADX WARN: Code duplicated, block: B:115:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0201  */
    /* JADX WARN: Code duplicated, block: B:120:0x0204  */
    /* JADX WARN: Code duplicated, block: B:123:0x020d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0219  */
    /* JADX WARN: Code duplicated, block: B:129:0x0224  */
    /* JADX WARN: Code duplicated, block: B:132:0x022d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0234  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:140:0x026a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x019f  */
    public static f d(byte[] bArr, int i10, int i11) {
        int iA;
        boolean zV;
        int i12;
        int i13;
        int i14;
        int iA2;
        boolean z10;
        boolean zV2;
        int i15;
        int i16;
        int i17;
        int iA3;
        int i18;
        float f10;
        int i19;
        int i20;
        int i21;
        float f11;
        int i22;
        int i23;
        int i24;
        boolean zV3;
        boolean zV4;
        int iW;
        int iW2;
        int iW3;
        int i25;
        int i26;
        int i27 = 1;
        t tVar = new t(i10 + 1, bArr, i11, 1);
        int iW4 = tVar.w(8);
        int iW5 = tVar.w(8);
        int iW6 = tVar.w(8);
        int iA4 = tVar.A();
        if (iW4 == 100 || iW4 == 110 || iW4 == 122 || iW4 == 244 || iW4 == 44 || iW4 == 83 || iW4 == 86 || iW4 == 118 || iW4 == 128 || iW4 == 138) {
            iA = tVar.A();
            zV = iA == 3 ? tVar.v() : false;
            int iA5 = tVar.A();
            int iA6 = tVar.A();
            tVar.G();
            if (tVar.v()) {
                int i28 = iA != 3 ? 8 : 12;
                i12 = 16;
                int i29 = 0;
                while (i29 < i28) {
                    if (tVar.v()) {
                        int i30 = i29 < 6 ? 16 : 64;
                        int iB = 8;
                        int i31 = 8;
                        for (int i32 = 0; i32 < i30; i32++) {
                            if (iB != 0) {
                                iB = ((tVar.B() + i31) + 256) % 256;
                            }
                            if (iB != 0) {
                                i31 = iB;
                            }
                        }
                    }
                    i29++;
                }
            } else {
                i12 = 16;
            }
            i13 = iA5;
            i14 = iA6;
        } else {
            iA = 1;
            i12 = 16;
            i13 = 0;
            i14 = 0;
            zV = false;
        }
        int iA7 = tVar.A() + 4;
        int iA8 = tVar.A();
        if (iA8 != 0) {
            if (iA8 == 1) {
                boolean zV5 = tVar.v();
                tVar.B();
                tVar.B();
                long jA = tVar.A();
                i27 = 1;
                iA7 = iA7;
                for (int i33 = 0; i33 < jA; i33++) {
                    tVar.A();
                }
                z10 = zV5;
                iA2 = 0;
            } else {
                iA2 = 0;
            }
            tVar.A();
            tVar.G();
            int iA9 = tVar.A() + 1;
            int iA10 = tVar.A() + 1;
            zV2 = tVar.v();
            i15 = 2 - (zV2 ? 1 : 0);
            int i34 = iA10 * i15;
            if (!zV2) {
                tVar.G();
            }
            tVar.G();
            i16 = iA9 * 16;
            i17 = i34 * 16;
            if (tVar.v()) {
                int iA11 = tVar.A();
                int iA12 = tVar.A();
                int iA13 = tVar.A();
                int iA14 = tVar.A();
                if (iA == 0) {
                    i25 = i27;
                    if (iA != 3) {
                        i27 = 2;
                    }
                    if (iA == i25) {
                        i26 = 2;
                    } else {
                        i26 = i25;
                    }
                    i15 *= i26;
                }
                i16 -= (iA11 + iA12) * i27;
                i17 -= (iA13 + iA14) * i15;
            }
            int i35 = i17;
            int i36 = i16;
            iA3 = ((iW4 != 44 || iW4 == 86 || iW4 == 100 || iW4 == 110 || iW4 == 122 || iW4 == 244) && (iW5 & 16) != 0) ? 0 : i12;
            i18 = -1;
            f10 = 1.0f;
            if (tVar.v()) {
                if (tVar.v()) {
                    iW = tVar.w(8);
                    if (iW == 255) {
                        int i37 = i12;
                        iW2 = tVar.w(i37);
                        iW3 = tVar.w(i37);
                        if (iW2 != 0 && iW3 != 0) {
                            f10 = iW2 / iW3;
                        }
                    } else if (iW < 17) {
                        f10 = f1162b[iW];
                    } else {
                        AbstractC0112b.r(iW, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (tVar.v()) {
                    tVar.G();
                }
                if (tVar.v()) {
                    tVar.H(3);
                    if (tVar.v()) {
                        i23 = 1;
                    } else {
                        i23 = 2;
                    }
                    if (tVar.v()) {
                        int iW7 = tVar.w(8);
                        int iW8 = tVar.w(8);
                        tVar.H(8);
                        int iF = C2332h.f(iW7);
                        int iG = C2332h.g(iW8);
                        i18 = iF;
                        i24 = iG;
                    } else {
                        i24 = -1;
                    }
                } else {
                    i23 = -1;
                    i24 = -1;
                }
                if (tVar.v()) {
                    tVar.A();
                    tVar.A();
                }
                if (tVar.v()) {
                    tVar.H(65);
                }
                zV3 = tVar.v();
                if (zV3) {
                    e(tVar);
                }
                zV4 = tVar.v();
                if (zV4) {
                    e(tVar);
                }
                if (zV3 || zV4) {
                    tVar.G();
                }
                tVar.G();
                if (tVar.v()) {
                    tVar.G();
                    tVar.A();
                    tVar.A();
                    tVar.A();
                    tVar.A();
                    iA3 = tVar.A();
                    tVar.A();
                }
                f11 = f10;
                i22 = i18;
                i20 = i23;
                i21 = i24;
                i19 = iA3;
            } else {
                i19 = iA3;
                i20 = -1;
                i21 = -1;
                f11 = 1.0f;
                i22 = -1;
            }
            return new f(iW4, iW5, iW6, iA4, i36, i35, f11, i13, i14, zV, zV2 ? 1 : 0, iA7, iA8, iA2, z10, i22, i20, i21, i19);
        }
        iA2 = tVar.A() + 4;
        z10 = false;
        tVar.A();
        tVar.G();
        int iA15 = tVar.A() + 1;
        int iA16 = tVar.A() + 1;
        zV2 = tVar.v();
        i15 = 2 - (zV2 ? 1 : 0);
        int i38 = iA16 * i15;
        if (!zV2) {
            tVar.G();
        }
        tVar.G();
        i16 = iA15 * 16;
        i17 = i38 * 16;
        if (tVar.v()) {
            int iA17 = tVar.A();
            int iA18 = tVar.A();
            int iA19 = tVar.A();
            int iA110 = tVar.A();
            if (iA == 0) {
                i25 = i27;
                if (iA != 3) {
                    i27 = 2;
                }
                if (iA == i25) {
                    i26 = 2;
                } else {
                    i26 = i25;
                }
                i15 *= i26;
            }
            i16 -= (iA17 + iA18) * i27;
            i17 -= (iA19 + iA110) * i15;
        }
        int i39 = i17;
        int i310 = i16;
        if (iW4 != 44) {
        }
        i18 = -1;
        f10 = 1.0f;
        if (tVar.v()) {
            if (tVar.v()) {
                iW = tVar.w(8);
                if (iW == 255) {
                    int i311 = i12;
                    iW2 = tVar.w(i311);
                    iW3 = tVar.w(i311);
                    if (iW2 != 0) {
                        f10 = iW2 / iW3;
                    }
                } else if (iW < 17) {
                    f10 = f1162b[iW];
                } else {
                    AbstractC0112b.r(iW, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (tVar.v()) {
                tVar.G();
            }
            if (tVar.v()) {
                tVar.H(3);
                if (tVar.v()) {
                    i23 = 1;
                } else {
                    i23 = 2;
                }
                if (tVar.v()) {
                    int iW9 = tVar.w(8);
                    int iW10 = tVar.w(8);
                    tVar.H(8);
                    int iF2 = C2332h.f(iW9);
                    int iG2 = C2332h.g(iW10);
                    i18 = iF2;
                    i24 = iG2;
                } else {
                    i24 = -1;
                }
            } else {
                i23 = -1;
                i24 = -1;
            }
            if (tVar.v()) {
                tVar.A();
                tVar.A();
            }
            if (tVar.v()) {
                tVar.H(65);
            }
            zV3 = tVar.v();
            if (zV3) {
                e(tVar);
            }
            zV4 = tVar.v();
            if (zV4) {
                e(tVar);
            }
            if (zV3) {
                tVar.G();
            } else {
                tVar.G();
            }
            tVar.G();
            if (tVar.v()) {
                tVar.G();
                tVar.A();
                tVar.A();
                tVar.A();
                tVar.A();
                iA3 = tVar.A();
                tVar.A();
            }
            f11 = f10;
            i22 = i18;
            i20 = i23;
            i21 = i24;
            i19 = iA3;
        } else {
            i19 = iA3;
            i20 = -1;
            i21 = -1;
            f11 = 1.0f;
            i22 = -1;
        }
        return new f(iW4, iW5, iW6, iA4, i310, i39, f11, i13, i14, zV, zV2 ? 1 : 0, iA7, iA8, iA2, z10, i22, i20, i21, i19);
    }

    public static void e(t tVar) {
        int iA = tVar.A() + 1;
        tVar.H(8);
        for (int i10 = 0; i10 < iA; i10++) {
            tVar.A();
            tVar.A();
            tVar.G();
        }
        tVar.H(20);
    }

    public static int f(byte[] bArr, int i10) {
        int i11;
        synchronized (f1163c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f1164d;
                    if (iArr.length <= i13) {
                        f1164d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f1164d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f1164d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
