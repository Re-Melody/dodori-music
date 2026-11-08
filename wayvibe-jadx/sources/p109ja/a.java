package p109ja;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static void a(double d10, double d11, double d12, double d13) {
        if (Double.isNaN(d10) || Double.isNaN(d12)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        }
        if (Double.isNaN(d11) || Double.isNaN(d13)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        }
        if (Double.isInfinite(d11) || Double.isInfinite(d13)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
        if (d10 > 90.0d || d10 < -90.0d || d12 > 90.0d || d12 < -90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        if (d10 < d12) {
            throw new IllegalArgumentException("latNorth cannot be less than latSouth");
        }
        if (d11 < d13) {
            throw new IllegalArgumentException("lonEast cannot be less than lonWest");
        }
    }

    public static double b(int i10, int i11) {
        double dPow = 3.141592653589793d - ((((double) i11) * 6.283185307179586d) / Math.pow(2.0d, i10));
        return Math.toDegrees(Math.atan((Math.exp(dPow) - Math.exp(-dPow)) * 0.5d));
    }
}
