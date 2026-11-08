package p230w;

import java.util.Arrays;
import p090i2.c;
import p134m1.b;

/* JADX INFO: renamed from: w.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2287u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static float[] f27777s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f27783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f27784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f27787j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f27788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f27789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f27790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f27792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f27793q;
    public final boolean r;

    public C2287u(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16 = f12;
        this.f27778a = f10;
        this.f27779b = f11;
        this.f27780c = f16;
        this.f27781d = f13;
        this.f27782e = f14;
        this.f27783f = f15;
        float f17 = f14 - f16;
        float f18 = f15 - f13;
        int i11 = 1;
        float f19 = 0.0f;
        boolean z11 = i10 == 1 || (i10 == 4 ? f18 > 0.0f : !(i10 != 5 || f18 >= 0.0f));
        this.f27793q = z11;
        float f20 = f11 - f10;
        float f21 = 1 / f20;
        this.k = f21;
        boolean z12 = 3 == i10;
        if (z12 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f27784g = fHypot;
            this.f27792p = fHypot * f21;
            this.f27790n = f17 / f20;
            this.f27791o = f18 / f20;
            this.f27787j = new float[101];
            this.f27788l = Float.NaN;
            this.f27789m = Float.NaN;
            z10 = true;
        } else {
            this.f27787j = new float[101];
            this.f27788l = (z11 ? -1 : 1) * f17;
            this.f27789m = f18 * (z11 ? 1 : -1);
            this.f27790n = z11 ? f14 : f16;
            this.f27791o = z11 ? f13 : f15;
            float f22 = f13 - f15;
            int length = c.b().length;
            float fHypot2 = 0.0f;
            float f23 = 0.0f;
            float f24 = 0.0f;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i11;
                float f25 = f19;
                double radians = (float) Math.toRadians((((double) i12) * 90.0d) / ((double) (c.b().length - i13)));
                float fSin = ((float) Math.sin(radians)) * f17;
                float fCos = ((float) Math.cos(radians)) * f22;
                if (i12 > 0) {
                    fHypot2 += (float) Math.hypot(fSin - f23, fCos - f24);
                    c.b()[i12] = fHypot2;
                }
                i12++;
                f22 = f22;
                f23 = fSin;
                f24 = fCos;
                i11 = i13;
                f19 = f25;
            }
            int i14 = i11;
            float f26 = f19;
            this.f27784g = fHypot2;
            int length2 = c.b().length;
            for (int i15 = 0; i15 < length2; i15++) {
                float[] fArrB = c.b();
                fArrB[i15] = fArrB[i15] / fHypot2;
            }
            float[] fArr = this.f27787j;
            int length3 = fArr.length;
            for (int i16 = 0; i16 < length3; i16++) {
                float length4 = i16 / (fArr.length - i14);
                float[] fArrB2 = c.b();
                int iBinarySearch = Arrays.binarySearch(fArrB2, 0, fArrB2.length, length4);
                if (iBinarySearch >= 0) {
                    fArr[i16] = iBinarySearch / (c.b().length - i14);
                } else if (iBinarySearch == -1) {
                    fArr[i16] = f26;
                } else {
                    int i17 = -iBinarySearch;
                    int i18 = i17 - 2;
                    fArr[i16] = (((length4 - c.b()[i18]) / (c.b()[i17 - i14] - c.b()[i18])) + i18) / (c.b().length - i14);
                }
            }
            this.f27792p = this.f27784g * this.k;
            z10 = z12;
        }
        this.r = z10;
    }

    public final float a() {
        float f10 = this.f27788l * this.f27786i;
        float fHypot = this.f27792p / ((float) Math.hypot(f10, (-this.f27789m) * this.f27785h));
        return this.f27793q ? (-f10) * fHypot : f10 * fHypot;
    }

    public final float b() {
        float f10 = this.f27788l * this.f27786i;
        float f11 = (-this.f27789m) * this.f27785h;
        float fHypot = this.f27792p / ((float) Math.hypot(f10, f11));
        return this.f27793q ? (-f11) * fHypot : f11 * fHypot;
    }

    public final void c(float f10) {
        float f11 = (this.f27793q ? this.f27779b - f10 : f10 - this.f27778a) * this.k;
        float fA = 0.0f;
        if (f11 > 0.0f) {
            fA = 1.0f;
            if (f11 < 1.0f) {
                float[] fArr = this.f27787j;
                float length = f11 * (fArr.length - 1);
                int i10 = (int) length;
                float f12 = fArr[i10];
                fA = b.a(fArr[i10 + 1], f12, length - i10, f12);
            }
        }
        double d10 = fA * 1.5707964f;
        this.f27785h = (float) Math.sin(d10);
        this.f27786i = (float) Math.cos(d10);
    }
}
