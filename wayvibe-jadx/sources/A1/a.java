package A1;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f106f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f101a = f10;
        this.f102b = f11;
        this.f103c = f12;
        this.f104d = f13;
        this.f105e = f14;
        this.f106f = f15;
    }

    public static a a(int i10) {
        o oVar = o.k;
        float f10 = b.f(Color.red(i10));
        float f11 = b.f(Color.green(i10));
        float f12 = b.f(Color.blue(i10));
        float[][] fArr = b.f110d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        float f15 = (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]);
        float[][] fArr5 = b.f107a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = oVar.f149g;
        float f19 = fArr9[0] * f16;
        float f20 = fArr9[1] * f17;
        float f21 = fArr9[2] * f18;
        float fAbs = Math.abs(f19);
        float f22 = oVar.f150h;
        float fPow = (float) Math.pow(((double) (fAbs * f22)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f20) * f22)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f21) * f22)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f20) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f21) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f23 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f24 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f25)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = fAtan2;
        float f29 = (3.1415927f * f28) / 180.0f;
        float f30 = f27 * oVar.f144b;
        float f31 = oVar.f143a;
        float f32 = oVar.f146d;
        float fPow4 = ((float) Math.pow(f30 / f31, oVar.f152j * f32)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f33 = f31 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f148f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f28) < 20.14d ? f28 + 360.0f : f28)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f147e) * oVar.f145c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f34 = oVar.f151i * fSqrt;
        Math.sqrt((fPow5 * f32) / f33);
        float f35 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f34 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f29;
        return new a(f28, fSqrt, fPow4, f35, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        o oVar = o.k;
        float f13 = oVar.f146d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        float f14 = oVar.f143a + 4.0f;
        float f15 = oVar.f151i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * oVar.f146d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f16, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(o oVar) {
        float fSqrt;
        float f10 = this.f102b;
        double d10 = f10;
        float f11 = this.f103c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d11 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, oVar.f148f), 0.73d), 1.1111111111111112d);
        double d12 = (this.f101a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
        float fPow2 = oVar.f143a * ((float) Math.pow(((double) f11) / 100.0d, (1.0d / ((double) oVar.f146d)) / ((double) oVar.f152j)));
        float f12 = fCos * 3846.1538f * oVar.f147e * oVar.f145c;
        float f13 = fPow2 / oVar.f144b;
        float fSin = (float) Math.sin(d12);
        float fCos2 = (float) Math.cos(d12);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
        float fSignum = Math.signum(f18);
        float f21 = 100.0f / oVar.f150h;
        float fPow3 = fSignum * f21 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float[] fArr = oVar.f149g;
        float f22 = fPow3 / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f108b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return B1.a.a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}
