package p230w;

import com.amazon.a.a.o.c.a.b;
import p143n0.W;

/* JADX INFO: renamed from: w.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2289w implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f27814f;

    public C2289w(float f10, float f11, float f12, float f13) {
        int iL;
        this.f27809a = f10;
        this.f27810b = f11;
        this.f27811c = f12;
        this.f27812d = f13;
        if (Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + b.f16463a);
        }
        float[] fArr = new float[5];
        float f14 = (f11 - 0.0f) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d10 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iL = d11 == d12 ? 0 : W.L((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iL2 = W.L((float) ((-(d15 + d16)) / d14), fArr, 0);
            iL = W.L((float) ((d15 - d16) / d14), fArr, iL2) + iL2;
            if (iL > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iL--;
                }
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iL3 = W.L((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, iL) + iL;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iL3; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - 0.0f) * f20) + (((f13 - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f20) + f14) * f20) + 0.0f;
            fMin = Math.min(fMin, f21);
            fMax = Math.max(fMax, f21);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f27813e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f27814f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[PHI: r4
  0x00bc: PHI (r4v25 float) = (r4v15 float), (r4v20 float), (r4v34 float) binds: [B:67:0x014b, B:81:0x017a, B:35:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    @Override // p230w.A
    public final float a(float f10) {
        float fV;
        float fCos;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float f11 = 0.0f - f10;
        float f12 = this.f27809a;
        float f13 = f12 - f10;
        float f14 = this.f27811c;
        float f15 = f14 - f10;
        double d10 = f11;
        double d11 = ((d10 - (((double) f13) * 2.0d)) + ((double) f15)) * 3.0d;
        double d12 = ((double) (f13 - f11)) * 3.0d;
        double d13 = (((double) (f13 - f15)) * 3.0d) + ((double) (-f11)) + ((double) (1.0f - f10));
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = d10 / d13;
            double d17 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d18 = ((d16 * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d19 = d17 * d17 * d17;
            double d20 = (d18 * d18) + d19;
            double d21 = d14 / 3.0d;
            if (d20 < 0.0d) {
                double dSqrt = Math.sqrt(-d19);
                double d22 = (-d18) / dSqrt;
                if (d22 < -1.0d) {
                    d22 = -1.0d;
                }
                if (d22 > 1.0d) {
                    d22 = 1.0d;
                }
                double dAcos = Math.acos(d22);
                double dV = p046da.b.v((float) dSqrt) * 2.0f;
                fCos = (float) ((Math.cos(dAcos / 3.0d) * dV) - d21);
                if (fCos < 0.0f) {
                    if (fCos >= -8.34465E-7f) {
                        fCos = 0.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                } else if (fCos > 1.0f) {
                    if (fCos <= 1.0000008f) {
                        fCos = 1.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                }
                if (Float.isNaN(fCos)) {
                    fCos = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dV) - d21);
                    if (fCos < 0.0f) {
                        if (fCos >= -8.34465E-7f) {
                            fCos = 0.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    } else if (fCos > 1.0f) {
                        if (fCos <= 1.0000008f) {
                            fCos = 1.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    }
                    if (Float.isNaN(fCos)) {
                        fV = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dV) - d21);
                        if (fV < 0.0f) {
                            if (fV >= -8.34465E-7f) {
                                fV = 0.0f;
                            }
                        } else if (fV > 1.0f) {
                            if (fV <= 1.0000008f) {
                                fV = 1.0f;
                            }
                        }
                        fV = Float.NaN;
                    } else {
                        fV = fCos;
                    }
                } else {
                    fV = fCos;
                }
            } else if (d20 == 0.0d) {
                float f16 = -p046da.b.v((float) d18);
                float f17 = (float) d21;
                float f18 = (f16 * 2.0f) - f17;
                if (f18 < 0.0f) {
                    if (f18 >= -8.34465E-7f) {
                        f18 = 0.0f;
                    } else {
                        f18 = Float.NaN;
                    }
                } else if (f18 > 1.0f) {
                    if (f18 <= 1.0000008f) {
                        f18 = 1.0f;
                    } else {
                        f18 = Float.NaN;
                    }
                }
                if (Float.isNaN(f18)) {
                    fV = (-f16) - f17;
                    if (fV < 0.0f) {
                        if (fV >= -8.34465E-7f) {
                            fV = 0.0f;
                        }
                    } else if (fV > 1.0f) {
                        if (fV <= 1.0000008f) {
                            fV = 1.0f;
                        }
                    }
                    fV = Float.NaN;
                } else {
                    fV = f18;
                }
            } else {
                double dSqrt2 = Math.sqrt(d20);
                fV = (float) (((double) (p046da.b.v((float) ((-d18) + dSqrt2)) - p046da.b.v((float) (d18 + dSqrt2)))) - d21);
                if (fV < 0.0f) {
                    if (fV >= -8.34465E-7f) {
                        fV = 0.0f;
                    }
                } else if (fV > 1.0f) {
                    if (fV <= 1.0000008f) {
                        fV = 1.0f;
                    }
                }
                fV = Float.NaN;
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d23 = d11 * 2.0d;
            fCos = (float) ((dSqrt3 - d12) / d23);
            if (fCos < 0.0f) {
                if (fCos >= -8.34465E-7f) {
                    fCos = 0.0f;
                } else {
                    fCos = Float.NaN;
                }
            } else if (fCos > 1.0f) {
                if (fCos <= 1.0000008f) {
                    fCos = 1.0f;
                } else {
                    fCos = Float.NaN;
                }
            }
            if (Float.isNaN(fCos)) {
                fV = (float) (((-d12) - dSqrt3) / d23);
                if (fV < 0.0f) {
                    if (fV >= -8.34465E-7f) {
                        fV = 0.0f;
                    }
                } else if (fV > 1.0f) {
                    if (fV <= 1.0000008f) {
                        fV = 1.0f;
                    }
                }
                fV = Float.NaN;
            } else {
                fV = fCos;
            }
        } else if (Math.abs(d12 - 0.0d) < 1.0E-7d) {
            fV = Float.NaN;
        } else {
            fV = (float) ((-d10) / d12);
            if (fV < 0.0f) {
                if (fV >= -8.34465E-7f) {
                    fV = 0.0f;
                }
            } else if (fV > 1.0f) {
                if (fV <= 1.0000008f) {
                    fV = 1.0f;
                }
            }
            fV = Float.NaN;
        }
        boolean zIsNaN = Float.isNaN(fV);
        float f19 = this.f27812d;
        float f20 = this.f27810b;
        if (!zIsNaN) {
            float f21 = ((((((f20 - f19) + 0.33333334f) * fV) + (f19 - (2.0f * f20))) * fV) + f20) * 3.0f * fV;
            float f22 = this.f27813e;
            if (f21 < f22) {
                f21 = f22;
            }
            float f23 = this.f27814f;
            return f21 > f23 ? f23 : f21;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", " + f20 + ", " + f14 + ", " + f19 + ") has no solution at " + f10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2289w)) {
            return false;
        }
        C2289w c2289w = (C2289w) obj;
        return this.f27809a == c2289w.f27809a && this.f27810b == c2289w.f27810b && this.f27811c == c2289w.f27811c && this.f27812d == c2289w.f27812d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27812d) + p134m1.b.b(this.f27811c, p134m1.b.b(this.f27810b, Float.hashCode(this.f27809a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f27809a);
        sb.append(", b=");
        sb.append(this.f27810b);
        sb.append(", c=");
        sb.append(this.f27811c);
        sb.append(", d=");
        return p134m1.b.l(sb, this.f27812d, ')');
    }
}
