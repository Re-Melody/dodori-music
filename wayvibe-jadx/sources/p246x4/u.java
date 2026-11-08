package p246x4;

import V0.p;
import X4.a;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f28545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f28546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f28549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f28550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28551j;
    public short[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f28552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public short[] f28553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f28554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short[] f28555o;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f28560u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f28563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f28564y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28556p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f28557q = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f28561v = 0;

    public u(float f10, float f11, int i10, int i11, int i12) {
        this.f28542a = i10;
        this.f28543b = i11;
        this.f28547f = i10 / RCHTTPStatusCodes.BAD_REQUEST;
        int i13 = i10 / 65;
        this.f28548g = i13;
        int i14 = i13 * 2;
        this.f28549h = i14;
        this.f28550i = new short[i14];
        this.f28551j = i14;
        this.k = new short[i14 * i11];
        this.f28552l = i14;
        this.f28553m = new short[i14 * i11];
        this.f28554n = i14;
        this.f28555o = new short[i14 * i11];
        this.f28544c = f10;
        this.f28545d = f11;
        this.f28546e = i10 / i12;
    }

    public static void c(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f28543b;
        int i14 = ColorExtractionConstants.COLOR_COMPONENT_MASK;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f28563x = i15 / i16;
        this.f28564y = i17 / i14;
        return i16;
    }

    public final void b(int i10) {
        int i11 = this.f28558s + i10;
        int i12 = this.f28552l;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f28552l = i13;
            this.f28553m = Arrays.copyOf(this.f28553m, i13 * this.f28543b);
        }
    }

    public final void d(int i10) {
        int i11 = this.r + i10;
        int i12 = this.f28551j;
        if (i11 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f28551j = i13;
            this.k = Arrays.copyOf(this.k, i13 * this.f28543b);
        }
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f28549h / i11;
        int i13 = this.f28543b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[p.A(i16, i14, i15, i18)];
            }
            this.f28550i[i16] = (short) (i17 / i14);
        }
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d10;
        int iA;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f28558s;
        float f13 = this.f28544c;
        float f14 = this.f28545d;
        float f15 = f13 / f14;
        float f16 = this.f28546e * f14;
        double d11 = f15;
        int i18 = this.f28542a;
        int i19 = this.f28543b;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i20 = this.r;
            int i21 = this.f28549h;
            if (i20 >= i21) {
                int i22 = 0;
                while (true) {
                    int i23 = this.f28560u;
                    if (i23 > 0) {
                        int iMin = Math.min(i21, i23);
                        short[] sArr = this.k;
                        b(iMin);
                        f11 = 1.0f;
                        f10 = f15;
                        System.arraycopy(sArr, i22 * i19, this.f28553m, this.f28558s * i19, iMin * i19);
                        this.f28558s += iMin;
                        this.f28560u -= iMin;
                        i22 += iMin;
                        f12 = f16;
                        d10 = d11;
                    } else {
                        f10 = f15;
                        f11 = 1.0f;
                        short[] sArr2 = this.k;
                        int i24 = i18 > 4000 ? i18 / 4000 : 1;
                        int i25 = this.f28548g;
                        int i26 = this.f28547f;
                        if (i19 == 1 && i24 == 1) {
                            iA = a(sArr2, i22, i26, i25);
                            f12 = f16;
                            d10 = d11;
                        } else {
                            e(sArr2, i22, i24);
                            f12 = f16;
                            short[] sArr3 = this.f28550i;
                            d10 = d11;
                            int iA2 = a(sArr3, 0, i26 / i24, i25 / i24);
                            if (i24 != 1) {
                                int i27 = iA2 * i24;
                                int i28 = i24 * 4;
                                int i29 = i27 - i28;
                                int i30 = i27 + i28;
                                if (i29 >= i26) {
                                    i26 = i29;
                                }
                                if (i30 <= i25) {
                                    i25 = i30;
                                }
                                if (i19 == 1) {
                                    iA = a(sArr2, i22, i26, i25);
                                } else {
                                    e(sArr2, i22, 1);
                                    iA = a(sArr3, 0, i26, i25);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i31 = this.f28563x;
                        int i32 = this.f28564y;
                        if (i31 == 0 || (i10 = this.f28561v) == 0 || i32 > i31 * 3 || i31 * 2 <= this.f28562w * 3) {
                            i10 = iA;
                        }
                        this.f28562w = i31;
                        this.f28561v = iA;
                        if (d10 > 1.0d) {
                            short[] sArr4 = this.k;
                            if (f10 >= 2.0f) {
                                i12 = (int) (i10 / (f10 - 1.0f));
                            } else {
                                this.f28560u = (int) (((2.0f - f10) * i10) / (f10 - 1.0f));
                                i12 = i10;
                            }
                            b(i12);
                            int i33 = i22 + i10;
                            int i34 = i22;
                            int i35 = i12;
                            c(i35, this.f28543b, this.f28553m, this.f28558s, sArr4, i34, sArr4, i33);
                            this.f28558s += i35;
                            i22 = i10 + i35 + i34;
                        } else {
                            int i36 = i22;
                            short[] sArr5 = this.k;
                            if (f10 < 0.5f) {
                                i11 = (int) ((i10 * f10) / (1.0f - f10));
                            } else {
                                this.f28560u = (int) ((((2.0f * f10) - 1.0f) * i10) / (1.0f - f10));
                                i11 = i10;
                            }
                            int i37 = i10 + i11;
                            b(i37);
                            System.arraycopy(sArr5, i36 * i19, this.f28553m, this.f28558s * i19, i10 * i19);
                            c(i11, this.f28543b, this.f28553m, this.f28558s + i10, sArr5, i36 + i10, sArr5, i36);
                            this.f28558s += i37;
                            i22 = i36 + i11;
                        }
                    }
                    if (i22 + i21 > i20) {
                        break;
                    }
                    f15 = f10;
                    f16 = f12;
                    d11 = d10;
                }
                int i38 = this.r - i22;
                short[] sArr6 = this.k;
                System.arraycopy(sArr6, i22 * i19, sArr6, 0, i38 * i19);
                this.r = i38;
            }
            if (f12 != f11 || this.f28558s == i17) {
            }
            int i39 = (int) (i18 / f12);
            while (true) {
                if (i39 <= 16384 && i18 <= 16384) {
                    break;
                }
                i39 /= 2;
                i18 /= 2;
            }
            int i40 = this.f28558s - i17;
            int i41 = this.f28559t + i40;
            int i42 = this.f28554n;
            if (i41 > i42) {
                int i43 = (i42 / 2) + i40 + i42;
                this.f28554n = i43;
                this.f28555o = Arrays.copyOf(this.f28555o, i43 * i19);
            }
            System.arraycopy(this.f28553m, i17 * i19, this.f28555o, this.f28559t * i19, i40 * i19);
            this.f28558s = i17;
            this.f28559t += i40;
            int i44 = 0;
            while (true) {
                i13 = this.f28559t;
                i14 = i13 - 1;
                if (i44 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f28556p + 1;
                    int i45 = i15 * i39;
                    i16 = this.f28557q;
                    if (i45 <= i16 * i18) {
                        break;
                    }
                    b(1);
                    for (int i46 = 0; i46 < i19; i46++) {
                        short[] sArr7 = this.f28553m;
                        int i47 = (this.f28558s * i19) + i46;
                        short[] sArr8 = this.f28555o;
                        int i48 = (i44 * i19) + i46;
                        short s8 = sArr8[i48];
                        short s10 = sArr8[i48 + i19];
                        int i49 = this.f28557q * i18;
                        int i50 = this.f28556p;
                        int i51 = i50 * i39;
                        int i52 = (i50 + 1) * i39;
                        int i53 = i52 - i49;
                        int i54 = i52 - i51;
                        sArr7[i47] = (short) ((((i54 - i53) * s10) + (s8 * i53)) / i54);
                    }
                    this.f28557q++;
                    this.f28558s++;
                }
                this.f28556p = i15;
                if (i15 == i18) {
                    this.f28556p = 0;
                    a.q(i16 == i39);
                    this.f28557q = 0;
                }
                i44++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr9 = this.f28555o;
            System.arraycopy(sArr9, i14 * i19, sArr9, 0, (i13 - i14) * i19);
            this.f28559t -= i14;
            return;
        }
        short[] sArr10 = this.k;
        int i55 = this.r;
        b(i55);
        System.arraycopy(sArr10, 0, this.f28553m, this.f28558s * i19, i55 * i19);
        this.f28558s += i55;
        this.r = 0;
        f12 = f16;
        f11 = 1.0f;
        if (f12 != f11) {
        }
    }
}
