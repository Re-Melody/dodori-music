package p153o0;

import io.flutter.plugins.firebase.firestore.s;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import p143n0.W;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c {
    public static final s r = new s(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f23551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f23554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f23555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f23556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f23557j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f23558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f23559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f23560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f23561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f23562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f23563q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:42:0x0210  */
    /* JADX WARN: Code duplicated, block: B:45:0x0215  */
    /* JADX WARN: Code duplicated, block: B:47:0x0219  */
    /* JADX WARN: Code duplicated, block: B:53:0x0237  */
    /* JADX WARN: Code duplicated, block: B:56:0x0240  */
    /* JADX WARN: Code duplicated, block: B:63:0x0254  */
    /* JADX WARN: Code duplicated, block: B:65:0x026c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0286  */
    /* JADX WARN: Code duplicated, block: B:77:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0289 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f10, float f11, r rVar, int i10) {
        int i11;
        char c3;
        float f12;
        float f13;
        boolean z10;
        float[] fArr3;
        q qVar;
        double d10;
        int i12;
        super(str, b.f23498a, i10);
        int i13 = 0;
        int i14 = 1;
        this.f23551d = sVar;
        this.f23552e = f10;
        this.f23553f = f11;
        this.f23554g = rVar;
        this.k = iVar;
        this.f23558l = new p(this, i14);
        this.f23559m = new m(this, i13);
        this.f23560n = iVar2;
        this.f23561o = new p(this, i13);
        this.f23562p = new m(this, i14);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = f14 + f15 + fArr[2];
            fArr4[0] = f14 / f16;
            fArr4[1] = f15 / f16;
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = f17 + f18 + fArr[5];
            fArr4[2] = f17 / f19;
            fArr4[3] = f18 / f19;
            float f20 = fArr[6];
            float f21 = fArr[7];
            float f22 = f20 + f21 + fArr[8];
            fArr4[4] = f20 / f22;
            fArr4[5] = f21 / f22;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.f23555h = fArr4;
        if (fArr2 == null) {
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            float f25 = fArr4[2];
            float f26 = fArr4[3];
            float f27 = fArr4[4];
            float f28 = fArr4[5];
            f12 = 1.0f;
            float f29 = 1;
            float f30 = (f29 - f23) / f24;
            float f31 = (f29 - f25) / f26;
            float f32 = (f29 - f27) / f28;
            i11 = 0;
            float f33 = sVar.f23571a;
            c3 = 1;
            float f34 = sVar.f23572b;
            float f35 = (f29 - f33) / f34;
            float f36 = f23 / f24;
            float f37 = (f25 / f26) - f36;
            float f38 = (f33 / f34) - f36;
            float f39 = f31 - f30;
            float f40 = (f27 / f28) - f36;
            float f41 = (((f35 - f30) * f37) - (f38 * f39)) / (((f32 - f30) * f37) - (f39 * f40));
            float f42 = (f38 - (f40 * f41)) / f37;
            float f43 = (1.0f - f42) - f41;
            float f44 = f43 / f24;
            float f45 = f42 / f26;
            float f46 = f41 / f28;
            this.f23556i = new float[]{f44 * f23, f43, ((1.0f - f23) - f24) * f44, f45 * f25, f42, ((1.0f - f25) - f26) * f45, f46 * f27, f41, ((1.0f - f27) - f28) * f46};
        } else {
            i11 = 0;
            c3 = 1;
            f12 = 1.0f;
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f23556i = fArr2;
        }
        this.f23557j = j.g(this.f23556i);
        float fB = j.b(fArr4);
        float[] fArr5 = d.f23506a;
        if (fB / j.b(d.f23507b) > 0.9f) {
            float[] fArr6 = d.f23506a;
            float f47 = fArr4[i11];
            float f48 = fArr6[i11];
            float f49 = fArr4[c3];
            float f50 = fArr6[c3];
            float f51 = fArr4[2] - fArr6[2];
            float f52 = fArr4[3] - fArr6[3];
            float f53 = fArr4[4];
            float f54 = fArr6[4];
            float f55 = fArr4[5];
            float f56 = fArr6[5];
            f13 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[i11] = f47 - f48;
            fArr7[c3] = f49 - f50;
            fArr7[2] = f51;
            fArr7[3] = f52;
            fArr7[4] = f53 - f54;
            fArr7[5] = f55 - f56;
            if (j.f(fArr7[i11], fArr7[c3], f48 - f54, f50 - f56) < 0.0f || j.f(fArr6[i11] - fArr6[2], fArr6[c3] - fArr6[3], fArr7[i11], fArr7[c3]) < 0.0f || j.f(fArr7[2], fArr7[3], fArr6[2] - fArr6[i11], fArr6[3] - fArr6[c3]) < 0.0f || j.f(fArr6[2] - fArr6[4], fArr6[3] - fArr6[5], fArr7[2], fArr7[3]) < 0.0f || j.f(fArr7[4], fArr7[5], fArr6[4] - fArr6[2], fArr6[5] - fArr6[3]) < 0.0f || j.f(fArr6[4] - fArr6[i11], fArr6[5] - fArr6[c3], fArr7[4], fArr7[5]) < 0.0f) {
            }
            if (i10 != 0) {
                fArr3 = d.f23506a;
                if (fArr4 == fArr3) {
                    i12 = i11;
                    while (true) {
                        if (i12 < 6) {
                            if (Float.compare(fArr4[i12], fArr3[i12]) != 0 || Math.abs(fArr4[i12] - fArr3[i12]) <= 0.001f) {
                                i12++;
                            }
                        } else if (j.d(sVar, j.f23536d)) {
                            float[] fArr8 = d.f23506a;
                            qVar = d.f23508c;
                            d10 = 0.0d;
                            while (true) {
                                if (d10 <= 1.0d) {
                                    z10 = c3;
                                } else if (Math.abs(iVar.c(d10) - qVar.k.c(d10)) > 0.001d) {
                                }
                                d10 += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (j.d(sVar, j.f23536d) && f10 == f13 && f11 == f12) {
                    float[] fArr9 = d.f23506a;
                    qVar = d.f23508c;
                    d10 = 0.0d;
                    while (true) {
                        if (d10 <= 1.0d) {
                            z10 = c3;
                        } else if (Math.abs(iVar.c(d10) - qVar.k.c(d10)) > 0.001d && Math.abs(iVar2.c(d10) - qVar.f23560n.c(d10)) <= 0.001d) {
                            d10 += 0.00392156862745098d;
                        }
                    }
                }
                z10 = i11;
            } else {
                z10 = c3;
            }
            this.f23563q = z10;
        }
        f13 = 0.0f;
        int i15 = (f10 > f13 ? 1 : (f10 == f13 ? 0 : -1));
        if (i10 != 0) {
            fArr3 = d.f23506a;
            if (fArr4 == fArr3) {
                i12 = i11;
                while (true) {
                    if (i12 < 6) {
                        if (Float.compare(fArr4[i12], fArr3[i12]) != 0) {
                        }
                        i12++;
                    } else if (j.d(sVar, j.f23536d)) {
                        float[] fArr10 = d.f23506a;
                        qVar = d.f23508c;
                        d10 = 0.0d;
                        while (true) {
                            if (d10 <= 1.0d) {
                                z10 = c3;
                            } else if (Math.abs(iVar.c(d10) - qVar.k.c(d10)) > 0.001d) {
                            }
                            d10 += 0.00392156862745098d;
                        }
                    }
                }
            } else if (j.d(sVar, j.f23536d)) {
                float[] fArr11 = d.f23506a;
                qVar = d.f23508c;
                d10 = 0.0d;
                while (true) {
                    if (d10 <= 1.0d) {
                        z10 = c3;
                    } else if (Math.abs(iVar.c(d10) - qVar.k.c(d10)) > 0.001d) {
                    }
                    d10 += 0.00392156862745098d;
                }
            }
            z10 = i11;
        } else {
            z10 = c3;
        }
        this.f23563q = z10;
    }

    @Override // p153o0.c
    public final float a(int i10) {
        return this.f23553f;
    }

    @Override // p153o0.c
    public final float b(int i10) {
        return this.f23552e;
    }

    @Override // p153o0.c
    public final boolean c() {
        return this.f23563q;
    }

    @Override // p153o0.c
    public final long d(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f23562p;
        float fC = (float) mVar.c(d10);
        float fC2 = (float) mVar.c(f11);
        float fC3 = (float) mVar.c(f12);
        float[] fArr = this.f23556i;
        float f13 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        return (((long) Float.floatToRawIntBits((fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // p153o0.c
    public final float e(float f10, float f11, float f12) {
        double d10 = f10;
        m mVar = this.f23562p;
        float fC = (float) mVar.c(d10);
        float fC2 = (float) mVar.c(f11);
        float fC3 = (float) mVar.c(f12);
        float[] fArr = this.f23556i;
        return (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
    }

    @Override // p153o0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f23552e, this.f23552e) != 0 || Float.compare(qVar.f23553f, this.f23553f) != 0 || !m.b(this.f23551d, qVar.f23551d) || !Arrays.equals(this.f23555h, qVar.f23555h)) {
            return false;
        }
        r rVar = qVar.f23554g;
        r rVar2 = this.f23554g;
        if (rVar2 != null) {
            return m.b(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (m.b(this.k, qVar.k)) {
            return m.b(this.f23560n, qVar.f23560n);
        }
        return false;
    }

    @Override // p153o0.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.f23557j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        m mVar = this.f23559m;
        return W.b((float) mVar.c(f14), (float) mVar.c(f15), (float) mVar.c(f16), f13, cVar);
    }

    @Override // p153o0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f23555h) + ((this.f23551d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f23552e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f23553f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        r rVar = this.f23554g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f23560n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public q(String str, float[] fArr, s sVar, final r rVar, int i10) {
        i iVar;
        i iVar2;
        double d10 = rVar.f23569f;
        double d11 = rVar.f23570g;
        if (d10 == 0.0d && d11 == 0.0d) {
            final int i11 = 0;
            iVar = new i() { // from class: o0.o
                @Override // p153o0.i
                public final double c(double d12) {
                    switch (i11) {
                        case 0:
                            r rVar2 = rVar;
                            double d13 = rVar2.f23568e;
                            double d14 = rVar2.f23567d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / rVar2.f23564a) - rVar2.f23566c) / rVar2.f23565b : d12 / d14;
                        case 1:
                            r rVar3 = rVar;
                            double d15 = rVar3.f23565b;
                            double d16 = rVar3.f23568e;
                            double d17 = rVar3.f23567d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - rVar3.f23569f, 1.0d / rVar3.f23564a) - rVar3.f23566c) / d15 : (d12 - rVar3.f23570g) / d17;
                        case 2:
                            r rVar4 = rVar;
                            return d12 >= rVar4.f23568e ? Math.pow((rVar4.f23565b * d12) + rVar4.f23566c, rVar4.f23564a) : d12 * rVar4.f23567d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f23565b;
                            if (d12 >= rVar5.f23568e) {
                                return Math.pow((d18 * d12) + rVar5.f23566c, rVar5.f23564a) + rVar5.f23569f;
                            }
                            return rVar5.f23570g + (rVar5.f23567d * d12);
                    }
                }
            };
        } else {
            final int i12 = 1;
            iVar = new i() { // from class: o0.o
                @Override // p153o0.i
                public final double c(double d12) {
                    switch (i12) {
                        case 0:
                            r rVar2 = rVar;
                            double d13 = rVar2.f23568e;
                            double d14 = rVar2.f23567d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / rVar2.f23564a) - rVar2.f23566c) / rVar2.f23565b : d12 / d14;
                        case 1:
                            r rVar3 = rVar;
                            double d15 = rVar3.f23565b;
                            double d16 = rVar3.f23568e;
                            double d17 = rVar3.f23567d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - rVar3.f23569f, 1.0d / rVar3.f23564a) - rVar3.f23566c) / d15 : (d12 - rVar3.f23570g) / d17;
                        case 2:
                            r rVar4 = rVar;
                            return d12 >= rVar4.f23568e ? Math.pow((rVar4.f23565b * d12) + rVar4.f23566c, rVar4.f23564a) : d12 * rVar4.f23567d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f23565b;
                            if (d12 >= rVar5.f23568e) {
                                return Math.pow((d18 * d12) + rVar5.f23566c, rVar5.f23564a) + rVar5.f23569f;
                            }
                            return rVar5.f23570g + (rVar5.f23567d * d12);
                    }
                }
            };
        }
        if (d10 == 0.0d && d11 == 0.0d) {
            final int i13 = 2;
            iVar2 = new i() { // from class: o0.o
                @Override // p153o0.i
                public final double c(double d12) {
                    switch (i13) {
                        case 0:
                            r rVar2 = rVar;
                            double d13 = rVar2.f23568e;
                            double d14 = rVar2.f23567d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / rVar2.f23564a) - rVar2.f23566c) / rVar2.f23565b : d12 / d14;
                        case 1:
                            r rVar3 = rVar;
                            double d15 = rVar3.f23565b;
                            double d16 = rVar3.f23568e;
                            double d17 = rVar3.f23567d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - rVar3.f23569f, 1.0d / rVar3.f23564a) - rVar3.f23566c) / d15 : (d12 - rVar3.f23570g) / d17;
                        case 2:
                            r rVar4 = rVar;
                            return d12 >= rVar4.f23568e ? Math.pow((rVar4.f23565b * d12) + rVar4.f23566c, rVar4.f23564a) : d12 * rVar4.f23567d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f23565b;
                            if (d12 >= rVar5.f23568e) {
                                return Math.pow((d18 * d12) + rVar5.f23566c, rVar5.f23564a) + rVar5.f23569f;
                            }
                            return rVar5.f23570g + (rVar5.f23567d * d12);
                    }
                }
            };
        } else {
            final int i14 = 3;
            iVar2 = new i() { // from class: o0.o
                @Override // p153o0.i
                public final double c(double d12) {
                    switch (i14) {
                        case 0:
                            r rVar2 = rVar;
                            double d13 = rVar2.f23568e;
                            double d14 = rVar2.f23567d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / rVar2.f23564a) - rVar2.f23566c) / rVar2.f23565b : d12 / d14;
                        case 1:
                            r rVar3 = rVar;
                            double d15 = rVar3.f23565b;
                            double d16 = rVar3.f23568e;
                            double d17 = rVar3.f23567d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - rVar3.f23569f, 1.0d / rVar3.f23564a) - rVar3.f23566c) / d15 : (d12 - rVar3.f23570g) / d17;
                        case 2:
                            r rVar4 = rVar;
                            return d12 >= rVar4.f23568e ? Math.pow((rVar4.f23565b * d12) + rVar4.f23566c, rVar4.f23564a) : d12 * rVar4.f23567d;
                        default:
                            r rVar5 = rVar;
                            double d18 = rVar5.f23565b;
                            if (d12 >= rVar5.f23568e) {
                                return Math.pow((d18 * d12) + rVar5.f23566c, rVar5.f23564a) + rVar5.f23569f;
                            }
                            return rVar5.f23570g + (rVar5.f23567d * d12);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d10, float f10, float f11, int i10) {
        i iVar;
        i iVar2 = r;
        if (d10 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i11 = 0;
            iVar = new i() { // from class: o0.n
                @Override // p153o0.i
                public final double c(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: o0.n
                @Override // p153o0.i
                public final double c(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f10, f11, new r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
