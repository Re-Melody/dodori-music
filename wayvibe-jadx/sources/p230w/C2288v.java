package p230w;

/* JADX INFO: renamed from: w.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2288v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f27806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f27807b;

    public C2288v(double d10, double d11) {
        this.f27806a = d10;
        this.f27807b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2288v)) {
            return false;
        }
        C2288v c2288v = (C2288v) obj;
        return Double.compare(this.f27806a, c2288v.f27806a) == 0 && Double.compare(this.f27807b, c2288v.f27807b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f27807b) + (Double.hashCode(this.f27806a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f27806a + ", _imaginary=" + this.f27807b + ')';
    }
}
