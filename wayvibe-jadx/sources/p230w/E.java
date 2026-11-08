package p230w;

/* JADX INFO: loaded from: classes.dex */
public final class E implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f27551b;

    public E(float f10, float f11, float f12) {
        this.f27550a = f12;
        U u10 = new U();
        u10.f27594a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        u10.f27595b = dSqrt;
        u10.f27600g = 1.0f;
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        u10.f27600g = f10;
        u10.f27596c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        u10.f27595b = Math.sqrt(f11);
        u10.f27596c = false;
        this.f27551b = u10;
    }

    @Override // p230w.D
    public final float b(long j10, float f10, float f11, float f12) {
        U u10 = this.f27551b;
        u10.f27594a = f11;
        return Float.intBitsToFloat((int) (u10.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // p230w.D
    public final long c(float f10, float f11, float f12) {
        double dLog;
        long j10;
        U u10 = this.f27551b;
        double d10 = u10.f27595b;
        float f13 = (float) (d10 * d10);
        float f14 = u10.f27600g;
        float f15 = this.f27550a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j10 = 9223372036854L;
        } else {
            double d11 = f13;
            double d12 = f14;
            double d13 = f17;
            double d14 = f16;
            double d15 = 1.0f;
            double dSqrt = d12 * 2.0d * Math.sqrt(d11);
            double d16 = (dSqrt * dSqrt) - (d11 * 4.0d);
            double d17 = -dSqrt;
            C2288v c2288v = d16 < 0.0d ? new C2288v(0.0d, Math.sqrt(Math.abs(d16))) : new C2288v(Math.sqrt(d16), 0.0d);
            c2288v.f27806a = (c2288v.f27806a + d17) * 0.5d;
            c2288v.f27807b *= 0.5d;
            C2288v c2288v2 = d16 < 0.0d ? new C2288v(0.0d, Math.sqrt(Math.abs(d16))) : new C2288v(Math.sqrt(d16), 0.0d);
            double d18 = -1;
            double d19 = c2288v2.f27806a * d18;
            double d20 = c2288v2.f27807b * d18;
            c2288v2.f27806a = (d19 + d17) * 0.5d;
            c2288v2.f27807b = d20 * 0.5d;
            if (d14 == 0.0d && d13 == 0.0d) {
                j10 = 0;
            } else {
                if (d14 < 0.0d) {
                    d13 = -d13;
                }
                double dAbs = Math.abs(d14);
                double dAbs2 = Double.MAX_VALUE;
                if (d12 > 1.0d) {
                    double d21 = c2288v.f27806a;
                    double d22 = c2288v2.f27806a;
                    double d23 = (d21 * dAbs) - d13;
                    double d24 = d21 - d22;
                    double d25 = d23 / d24;
                    double d26 = dAbs - d25;
                    dLog = Math.log(Math.abs(d15 / d26)) / d21;
                    double dLog2 = Math.log(Math.abs(d15 / d25)) / d22;
                    if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                        dLog = dLog2;
                    } else if (!Double.isInfinite(dLog2) && !Double.isNaN(dLog2)) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d27 = d26 * d21;
                    double dLog3 = Math.log(d27 / ((-d25) * d22)) / (d22 - d21);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d15 = -d15;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d22) * d25) + (Math.exp(d21 * dLog3) * d26))) < d15) {
                                if (d25 > 0.0d && d26 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d15 = -d15;
                            }
                        }
                        dLog = Math.log((-((d25 * d22) * d22)) / (d27 * d21)) / d24;
                    }
                    double d28 = d25 * d22;
                    if (Math.abs((Math.exp(d22 * dLog) * d28) + (Math.exp(d21 * dLog) * d27)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d29 = d21 * dLog;
                            double d30 = d22 * dLog;
                            double dExp = dLog - ((((Math.exp(d30) * d25) + (Math.exp(d29) * d26)) + d15) / ((Math.exp(d30) * d28) + (Math.exp(d29) * d27)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d12 < 1.0d) {
                    double d31 = c2288v.f27806a;
                    double d32 = (d13 - (d31 * dAbs)) / c2288v.f27807b;
                    dLog = Math.log(d15 / Math.sqrt((d32 * d32) + (dAbs * dAbs))) / d31;
                } else {
                    double d33 = c2288v.f27806a;
                    double d34 = d33 * dAbs;
                    double d35 = d13 - d34;
                    double dLog4 = Math.log(Math.abs(d15 / dAbs)) / d33;
                    double dLog5 = Math.log(Math.abs(d15 / d35));
                    double dLog6 = dLog5;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d33));
                    }
                    double d36 = dLog6 / d33;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        dLog4 = d36;
                    } else if (!Double.isInfinite(d36) && !Double.isNaN(d36)) {
                        dLog4 = Math.max(dLog4, d36);
                    }
                    double d37 = (-(d34 + d35)) / (d33 * d35);
                    double d38 = d33 * d37;
                    double dExp2 = (Math.exp(d38) * d35 * d37) + (Math.exp(d38) * dAbs);
                    if (Double.isNaN(d37) || d37 <= 0.0d) {
                        d15 = -d15;
                    } else if (d37 <= 0.0d || (-dExp2) >= d15) {
                        dLog4 = (-(2.0d / d33)) - (dAbs / d35);
                    } else {
                        d15 = -d15;
                        dLog4 = (d35 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                    }
                    int i12 = 0;
                    while (dAbs2 > 0.001d && i12 < 100) {
                        i12++;
                        double d39 = d33 * dLog4;
                        double dExp3 = dLog4 - (((Math.exp(d39) * ((d35 * dLog4) + dAbs)) + d15) / (Math.exp(d39) * (((((double) 1) + d39) * d35) + d34)));
                        dAbs2 = Math.abs(dLog4 - dExp3);
                        dLog4 = dExp3;
                    }
                    dLog = dLog4;
                }
                j10 = (long) (dLog * 1000.0d);
            }
        }
        return j10 * 1000000;
    }

    @Override // p230w.D
    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // p230w.D
    public final float e(long j10, float f10, float f11, float f12) {
        U u10 = this.f27551b;
        u10.f27594a = f11;
        return Float.intBitsToFloat((int) (u10.a(f10, f12, j10 / 1000000) >> 32));
    }
}
