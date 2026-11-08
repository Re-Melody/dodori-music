package p153o0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f23564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f23568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f23569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f23570g;

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f23564a, rVar.f23564a) == 0 && Double.compare(this.f23565b, rVar.f23565b) == 0 && Double.compare(this.f23566c, rVar.f23566c) == 0 && Double.compare(this.f23567d, rVar.f23567d) == 0 && Double.compare(this.f23568e, rVar.f23568e) == 0 && Double.compare(this.f23569f, rVar.f23569f) == 0 && Double.compare(this.f23570g, rVar.f23570g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f23570g) + ((Double.hashCode(this.f23569f) + ((Double.hashCode(this.f23568e) + ((Double.hashCode(this.f23567d) + ((Double.hashCode(this.f23566c) + ((Double.hashCode(this.f23565b) + (Double.hashCode(this.f23564a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f23564a + ", a=" + this.f23565b + ", b=" + this.f23566c + ", c=" + this.f23567d + ", d=" + this.f23568e + ", e=" + this.f23569f + ", f=" + this.f23570g + ')';
    }

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f23564a = d10;
        this.f23565b = d11;
        this.f23566c = d12;
        this.f23567d = d13;
        this.f23568e = d14;
        this.f23569f = d15;
        this.f23570g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
