package p230w;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f27594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f27595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f27597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f27598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f27599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f27600g;

    public final long a(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        if (!this.f27596c) {
            if (this.f27594a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f12 = this.f27600g;
            double d10 = f12;
            double d11 = d10 * d10;
            if (f12 > 1.0f) {
                double d12 = this.f27595b;
                double d13 = d11 - ((double) 1);
                this.f27597d = (Math.sqrt(d13) * d12) + (((double) (-f12)) * d12);
                double d14 = -this.f27600g;
                double d15 = this.f27595b;
                this.f27598e = (d14 * d15) - (Math.sqrt(d13) * d15);
            } else if (f12 >= 0.0f && f12 < 1.0f) {
                this.f27599f = Math.sqrt(((double) 1) - d11) * this.f27595b;
            }
            this.f27596c = true;
        }
        float f13 = f10 - this.f27594a;
        double d16 = j10 / 1000.0d;
        float f14 = this.f27600g;
        if (f14 > 1.0f) {
            double d17 = f13;
            double d18 = this.f27598e;
            double d19 = ((d18 * d17) - ((double) f11)) / (d18 - this.f27597d);
            double d20 = d17 - d19;
            dExp = (Math.exp(this.f27597d * d16) * d19) + (Math.exp(d18 * d16) * d20);
            double d21 = this.f27598e;
            double dExp2 = Math.exp(d21 * d16) * d20 * d21;
            double d22 = this.f27597d;
            dCos = (Math.exp(d22 * d16) * d19 * d22) + dExp2;
        } else if (f14 == 1.0f) {
            double d23 = this.f27595b;
            double d24 = f13;
            double d25 = (d23 * d24) + ((double) f11);
            double d26 = (d25 * d16) + d24;
            dExp = Math.exp((-d23) * d16) * d26;
            double dExp3 = Math.exp((-this.f27595b) * d16) * d26;
            double d27 = -this.f27595b;
            dCos = (dExp3 * d27) + (Math.exp(d27 * d16) * d25);
        } else {
            double d28 = ((double) 1) / this.f27599f;
            double d29 = this.f27595b;
            double d30 = f13;
            double d31 = ((((double) f14) * d29 * d30) + ((double) f11)) * d28;
            double dExp4 = Math.exp(((double) (-f14)) * d29 * d16) * ((Math.sin(this.f27599f * d16) * d31) + (Math.cos(this.f27599f * d16) * d30));
            double d32 = this.f27595b;
            float f15 = this.f27600g;
            double d33 = (-d32) * dExp4 * ((double) f15);
            double dExp5 = Math.exp(((double) (-f15)) * d32 * d16);
            double d34 = this.f27599f;
            double dSin = Math.sin(d34 * d16) * (-d34) * d30;
            double d35 = this.f27599f;
            dCos = (((Math.cos(d35 * d16) * d31 * d35) + dSin) * dExp5) + d33;
            dExp = dExp4;
        }
        return (((long) Float.floatToRawIntBits((float) (dExp + ((double) this.f27594a)))) << 32) | (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L);
    }
}
