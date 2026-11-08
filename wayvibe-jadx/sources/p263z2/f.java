package p263z2;

import B2.AbstractC0111a;
import V0.p;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f29825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f29826j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f29827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29828m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f29829n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29830o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29832q;
    public int r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29836v;

    public f(float f10, float f11, int i10, int i11, int i12) {
        this.f29817a = i10;
        this.f29818b = i11;
        this.f29819c = f10;
        this.f29820d = f11;
        this.f29821e = i10 / i12;
        this.f29822f = i10 / RCHTTPStatusCodes.BAD_REQUEST;
        int i13 = i10 / 65;
        this.f29823g = i13;
        int i14 = i13 * 2;
        this.f29824h = i14;
        this.f29825i = new short[i14];
        this.f29826j = new short[i14 * i11];
        this.f29827l = new short[i14 * i11];
        this.f29829n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f29827l, this.f29828m, i11);
        this.f29827l = sArrC;
        int i12 = this.f29818b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f29828m * i12, i12 * i11);
        this.f29828m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f29824h / i11;
        int i13 = this.f29818b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[p.A(i16, i14, i15, i18)];
            }
            this.f29825i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f29818b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f29818b;
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
        this.f29835u = i15 / i16;
        this.f29836v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d10;
        int iD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f29828m;
        float f13 = this.f29819c;
        float f14 = this.f29820d;
        float f15 = f13 / f14;
        float f16 = this.f29821e * f14;
        double d11 = f15;
        int i18 = this.f29817a;
        int i19 = this.f29818b;
        int i20 = 1;
        if (d11 > 1.00001d || d11 < 0.99999d) {
            int i21 = this.k;
            int i22 = this.f29824h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.f29826j, i23, iMin);
                        this.r -= iMin;
                        i23 += iMin;
                        f11 = f15;
                        f12 = f16;
                        d10 = d11;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f29826j;
                        int i25 = i18 > 4000 ? i18 / 4000 : i20;
                        f10 = 1.0f;
                        int i26 = this.f29823g;
                        int i27 = this.f29822f;
                        if (i19 == i20 && i25 == i20) {
                            iD = d(sArr, i23, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d10 = d11;
                        } else {
                            b(sArr, i23, i25);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f29825i;
                            d10 = d11;
                            int iD2 = d(sArr2, 0, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = iD2 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f29835u;
                        int i33 = this.f29836v;
                        if (i32 == 0 || (i10 = this.f29833s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f29834t * 3) {
                            i10 = iD;
                        }
                        this.f29834t = i32;
                        this.f29833s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f29826j;
                            if (f11 >= 2.0f) {
                                i12 = (int) (i10 / (f11 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                i12 = i10;
                            }
                            short[] sArrC = c(this.f29827l, this.f29828m, i12);
                            this.f29827l = sArrC;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.f29818b, sArrC, this.f29828m, sArr3, i35, sArr3, i34);
                            this.f29828m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.f29826j;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i10 * f11) / (1.0f - f11));
                            } else {
                                this.r = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] sArrC2 = c(this.f29827l, this.f29828m, i38);
                            this.f29827l = sArrC2;
                            System.arraycopy(sArr4, i37 * i19, sArrC2, this.f29828m * i19, i10 * i19);
                            e(i11, this.f29818b, this.f29827l, this.f29828m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f29828m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    i20 = 1;
                    f15 = f11;
                    f16 = f12;
                    d11 = d10;
                }
                int i39 = this.k - i23;
                short[] sArr5 = this.f29826j;
                System.arraycopy(sArr5, i23 * i19, sArr5, 0, i39 * i19);
                this.k = i39;
            }
            if (f12 != f10 || this.f29828m == i17) {
            }
            int i40 = (int) (i18 / f12);
            while (true) {
                if (i40 <= 16384 && i18 <= 16384) {
                    break;
                }
                i40 /= 2;
                i18 /= 2;
            }
            int i41 = this.f29828m - i17;
            short[] sArrC3 = c(this.f29829n, this.f29830o, i41);
            this.f29829n = sArrC3;
            System.arraycopy(this.f29827l, i17 * i19, sArrC3, this.f29830o * i19, i41 * i19);
            this.f29828m = i17;
            this.f29830o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f29830o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f29831p + 1;
                    int i43 = i15 * i40;
                    i16 = this.f29832q;
                    if (i43 <= i16 * i18) {
                        break;
                    }
                    this.f29827l = c(this.f29827l, this.f29828m, 1);
                    for (int i44 = 0; i44 < i19; i44++) {
                        short[] sArr6 = this.f29827l;
                        int i45 = (this.f29828m * i19) + i44;
                        short[] sArr7 = this.f29829n;
                        int i46 = (i42 * i19) + i44;
                        short s8 = sArr7[i46];
                        short s10 = sArr7[i46 + i19];
                        int i47 = this.f29832q * i18;
                        int i48 = this.f29831p;
                        int i49 = i48 * i40;
                        int i50 = (i48 + 1) * i40;
                        int i51 = i50 - i47;
                        int i52 = i50 - i49;
                        sArr6[i45] = (short) ((((i52 - i51) * s10) + (s8 * i51)) / i52);
                    }
                    this.f29832q++;
                    this.f29828m++;
                }
                this.f29831p = i15;
                if (i15 == i18) {
                    this.f29831p = 0;
                    AbstractC0111a.h(i16 == i40);
                    this.f29832q = 0;
                }
                i42++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f29829n;
            System.arraycopy(sArr8, i14 * i19, sArr8, 0, (i13 - i14) * i19);
            this.f29830o -= i14;
            return;
        }
        a(this.f29826j, 0, this.k);
        this.k = 0;
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }
}
