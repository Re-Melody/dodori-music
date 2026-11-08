package Da;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2873a;

    static {
        HashMap map = new HashMap();
        f2873a = map;
        map.put("miles", Double.valueOf(3960.0d));
        map.put("nauticalmiles", Double.valueOf(3441.145d));
        map.put("degrees", Double.valueOf(57.2957795d));
        map.put("radians", Double.valueOf(1.0d));
        map.put("inches", Double.valueOf(2.509056E8d));
        map.put("yards", Double.valueOf(6969600.0d));
        Double dValueOf = Double.valueOf(6373000.0d);
        map.put("meters", dValueOf);
        Double dValueOf2 = Double.valueOf(6.373E8d);
        map.put("centimeters", dValueOf2);
        Double dValueOf3 = Double.valueOf(6373.0d);
        map.put("kilometers", dValueOf3);
        map.put("feet", Double.valueOf(2.090879265E7d));
        map.put("centimetres", dValueOf2);
        map.put("metres", dValueOf);
        map.put("kilometres", dValueOf3);
    }

    public static double a(double d10) {
        return ((d10 % 360.0d) * 3.141592653589793d) / 180.0d;
    }
}
