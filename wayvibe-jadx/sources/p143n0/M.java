package p143n0;

import D7.W;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p097i9.l;
import p133m0.b;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f22714a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j10, float[] fArr) {
        float fD = c.d(j10);
        float fE = c.e(j10);
        float f10 = 1 / (((fArr[7] * fE) + (fArr[3] * fD)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return W.c(((fArr[4] * fE) + (fArr[0] * fD) + fArr[12]) * f10, ((fArr[5] * fE) + (fArr[1] * fD) + fArr[13]) * f10);
    }

    public static final void c(float[] fArr, b bVar) {
        long jB = b(W.c(bVar.f22178a, bVar.f22179b), fArr);
        long jB2 = b(W.c(bVar.f22178a, bVar.f22181d), fArr);
        long jB3 = b(W.c(bVar.f22180c, bVar.f22179b), fArr);
        long jB4 = b(W.c(bVar.f22180c, bVar.f22181d), fArr);
        bVar.f22178a = Math.min(Math.min(c.d(jB), c.d(jB2)), Math.min(c.d(jB3), c.d(jB4)));
        bVar.f22179b = Math.min(Math.min(c.e(jB), c.e(jB2)), Math.min(c.e(jB3), c.e(jB4)));
        bVar.f22180c = Math.max(Math.max(c.d(jB), c.d(jB2)), Math.max(c.d(jB3), c.d(jB4)));
        bVar.f22181d = Math.max(Math.max(c.e(jB), c.e(jB2)), Math.max(c.e(jB3), c.e(jB4)));
    }

    public static final void d(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    public static final void e(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = -fSin;
        float f15 = (f12 * fCos) + (f11 * f14);
        float f16 = fArr[1];
        float f17 = fArr[5];
        float f18 = (fSin * f17) + (fCos * f16);
        float f19 = (f17 * fCos) + (f16 * f14);
        float f20 = fArr[2];
        float f21 = fArr[6];
        float f22 = (fSin * f21) + (fCos * f20);
        float f23 = (f21 * fCos) + (f20 * f14);
        float f24 = fArr[3];
        float f25 = fArr[7];
        float f26 = (fSin * f25) + (fCos * f24);
        fArr[0] = f13;
        fArr[1] = f18;
        fArr[2] = f22;
        fArr[3] = f26;
        fArr[4] = f15;
        fArr[5] = f19;
        fArr[6] = f23;
        fArr[7] = (fCos * f25) + (f14 * f24);
    }

    public static final void f(float[] fArr, float f10, float f11) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void g(float[] fArr, float[] fArr2) {
        float fL = W.l(fArr, 0, fArr2, 0);
        float fL2 = W.l(fArr, 0, fArr2, 1);
        float fL3 = W.l(fArr, 0, fArr2, 2);
        float fL4 = W.l(fArr, 0, fArr2, 3);
        float fL5 = W.l(fArr, 1, fArr2, 0);
        float fL6 = W.l(fArr, 1, fArr2, 1);
        float fL7 = W.l(fArr, 1, fArr2, 2);
        float fL8 = W.l(fArr, 1, fArr2, 3);
        float fL9 = W.l(fArr, 2, fArr2, 0);
        float fL10 = W.l(fArr, 2, fArr2, 1);
        float fL11 = W.l(fArr, 2, fArr2, 2);
        float fL12 = W.l(fArr, 2, fArr2, 3);
        float fL13 = W.l(fArr, 3, fArr2, 0);
        float fL14 = W.l(fArr, 3, fArr2, 1);
        float fL15 = W.l(fArr, 3, fArr2, 2);
        float fL16 = W.l(fArr, 3, fArr2, 3);
        fArr[0] = fL;
        fArr[1] = fL2;
        fArr[2] = fL3;
        fArr[3] = fL4;
        fArr[4] = fL5;
        fArr[5] = fL6;
        fArr[6] = fL7;
        fArr[7] = fL8;
        fArr[8] = fL9;
        fArr[9] = fL10;
        fArr[10] = fL11;
        fArr[11] = fL12;
        fArr[12] = fL13;
        fArr[13] = fL14;
        fArr[14] = fL15;
        fArr[15] = fL16;
    }

    public static final void h(float[] fArr, float f10, float f11) {
        float f12 = (fArr[8] * 0.0f) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * 0.0f) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * 0.0f) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * 0.0f) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M) {
            return m.b(this.f22714a, ((M) obj).f22714a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22714a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f22714a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return l.W(sb.toString());
    }
}
