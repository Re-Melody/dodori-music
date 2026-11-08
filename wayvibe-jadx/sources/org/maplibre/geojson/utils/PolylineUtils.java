package org.maplibre.geojson.utils;

import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    public static List<Point> decode(String str, int i10) {
        int i11;
        int i12;
        int length = str.length();
        double dPow = Math.pow(10.0d, i10);
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = 1;
            int i17 = 0;
            int i18 = 1;
            while (true) {
                i11 = i13 + 1;
                int iCharAt = str.charAt(i13) - '@';
                i18 += iCharAt << i17;
                i17 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i13 = i11;
            }
            int i19 = ((i18 & 1) != 0 ? ~(i18 >> 1) : i18 >> 1) + i14;
            int i20 = 0;
            while (true) {
                i12 = i11 + 1;
                int iCharAt2 = str.charAt(i11) - '@';
                i16 += iCharAt2 << i20;
                i20 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i11 = i12;
            }
            i15 += (i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1;
            arrayList.add(Point.fromLngLat(((double) i15) / dPow, ((double) i19) / dPow));
            i14 = i19;
            i13 = i12;
        }
        return arrayList;
    }

    public static String encode(List<Point> list, int i10) {
        StringBuilder sb = new StringBuilder();
        double dPow = Math.pow(10.0d, i10);
        long j10 = 0;
        long j11 = 0;
        for (Point point : list) {
            long jRound = Math.round(point.latitude() * dPow);
            long jRound2 = Math.round(point.longitude() * dPow);
            encode(jRound - j10, sb);
            encode(jRound2 - j11, sb);
            j10 = jRound;
            j11 = jRound2;
        }
        return sb.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double dLongitude = point.longitude() - point2.longitude();
        double dLatitude = point.latitude() - point2.latitude();
        return (dLatitude * dLatitude) + (dLongitude * dLongitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double dLongitude = point2.longitude();
        double dLatitude = point2.latitude();
        double dLongitude2 = point3.longitude() - dLongitude;
        double dLatitude2 = point3.latitude() - dLatitude;
        if (dLongitude2 != 0.0d || dLatitude2 != 0.0d) {
            double dLatitude3 = (((point.latitude() - dLatitude) * dLatitude2) + ((point.longitude() - dLongitude) * dLongitude2)) / ((dLatitude2 * dLatitude2) + (dLongitude2 * dLongitude2));
            if (dLatitude3 > SIMPLIFY_DEFAULT_TOLERANCE) {
                dLongitude = point3.longitude();
                dLatitude = point3.latitude();
            } else if (dLatitude3 > 0.0d) {
                dLongitude += dLongitude2 * dLatitude3;
                dLatitude += dLatitude2 * dLatitude3;
            }
        }
        double dLongitude3 = point.longitude() - dLongitude;
        double dLatitude4 = point.latitude() - dLatitude;
        return (dLatitude4 * dLatitude4) + (dLongitude3 * dLongitude3);
    }

    public static List<Point> simplify(List<Point> list) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, false);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d10) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d10, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i10, int i11, double d10, List<Point> list2) {
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        double d11 = d10;
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            double sqSegDist = getSqSegDist(list.get(i13), list.get(i10), list.get(i11));
            if (sqSegDist > d11) {
                i12 = i13;
                d11 = sqSegDist;
            }
        }
        if (d11 > d10) {
            if (i12 - i10 > 1) {
                arrayList.addAll(simplifyDpStep(list, i10, i12, d10, list2));
            }
            arrayList.add(list.get(i12));
            if (i11 - i12 > 1) {
                arrayList.addAll(simplifyDpStep(list, i12, i11, d10, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d10) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i10 = 1; i10 < size; i10++) {
            point2 = list.get(i10);
            if (getSqDist(point2, point) > d10) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    public static List<Point> simplify(List<Point> list, double d10) {
        return simplify(list, d10, false);
    }

    public static List<Point> simplify(List<Point> list, boolean z10) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, z10);
    }

    public static List<Point> simplify(List<Point> list, double d10, boolean z10) {
        if (list.size() <= 2) {
            return list;
        }
        double d11 = d10 * d10;
        if (!z10) {
            list = simplifyRadialDist(list, d11);
        }
        return simplifyDouglasPeucker(list, d11);
    }

    private static void encode(long j10, StringBuilder sb) {
        long j11 = j10 << 1;
        if (j10 < 0) {
            j11 = ~j11;
        }
        while (j11 >= 32) {
            sb.append(Character.toChars((int) ((32 | (31 & j11)) + 63)));
            j11 >>= 5;
        }
        sb.append(Character.toChars((int) (j11 + 63)));
    }
}
