package p009a5;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f14158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f14161d;

    public l(double d10, double d11, double d12, double d13) {
        this.f14158a = d10;
        this.f14159b = d11;
        this.f14160c = d12;
        this.f14161d = d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Double.compare(this.f14158a, lVar.f14158a) == 0 && Double.compare(this.f14159b, lVar.f14159b) == 0 && Double.compare(this.f14160c, lVar.f14160c) == 0 && Double.compare(this.f14161d, lVar.f14161d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f14161d) + ((Double.hashCode(this.f14160c) + ((Double.hashCode(this.f14159b) + (Double.hashCode(this.f14158a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GeographicBounds(lowerLeftLatitude=" + this.f14158a + ", lowerLeftLongitude=" + this.f14159b + ", upperRightLatitude=" + this.f14160c + ", upperRightLongitude=" + this.f14161d + ")";
    }
}
