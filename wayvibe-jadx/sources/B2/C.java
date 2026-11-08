package B2;

import A6.E;
import D7.p1;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.XMLReaderUtils;
import p255y2.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f569j;
    public static HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f574p;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f560a = i10;
        String str = Build.DEVICE;
        f561b = str;
        String str2 = Build.MANUFACTURER;
        f562c = str2;
        String str3 = Build.MODEL;
        f563d = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        f564e = AbstractC0112b.k(sb, ", ", i10);
        f565f = new byte[0];
        f566g = new long[0];
        f567h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f568i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f569j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f570l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", DiagnosticsEntry.ID_KEY, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f571m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f572n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f573o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f574p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, SensibleDefaults.X_OFFSET, 179, 186, 189, 199, 192, RCHTTPStatusCodes.CREATED, 206, 219, 220, 213, 210, ColorExtractionConstants.COLOR_COMPONENT_MASK, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, RCHTTPStatusCodes.NO_CONTENT, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(float f10, long j10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName(com.amazon.a.a.o.b.at);
            return (String) cls.getMethod(com.amazon.a.a.o.b.au, String.class).invoke(cls, str);
        } catch (Exception e2) {
            AbstractC0111a.m("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String C(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return ExternalParsersConfigReaderMetKeys.METADATA_TAG;
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? AbstractC0112b.d(i10, "custom (", ")") : "?";
        }
    }

    public static void D(int i10) {
        Integer.toString(i10, 36);
    }

    public static boolean E(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean F(Context context) {
        int i10 = f560a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 != 30) {
            return false;
        }
        String str = f563d;
        return p224v4.i.d(str, "moto g(20)") || p224v4.i.d(str, "rmx3231");
    }

    public static boolean G(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean H(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long I(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String J(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = p224v4.i.e(str);
        int i10 = 0;
        String str2 = strE.split("-", 2)[0];
        if (k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f570l;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            k = map;
        }
        String str4 = (String) k.get(str2);
        if (str4 != null) {
            StringBuilder sbO = AbstractC0112b.o(str4);
            sbO.append(strE.substring(str2.length()));
            strE = sbO.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strE;
        }
        while (true) {
            String[] strArr2 = f571m;
            if (i10 >= strArr2.length) {
                return strE;
            }
            if (strE.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + strE.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static Object[] K(int i10, Object[] objArr) {
        AbstractC0111a.d(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static long L(String str) throws D {
        Matcher matcher = f567h.matcher(str);
        if (!matcher.matches()) {
            throw D.a(null, "Invalid date/time format: " + str);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (((long) i10) * 60000) : timeInMillis;
    }

    public static void M(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void N(ArrayList arrayList, int i10, int i11) {
        if (i10 < 0 || i11 > arrayList.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            arrayList.subList(i10, i11).clear();
        }
    }

    public static long O(int i10, long j10) {
        return Q(j10, 1000000L, i10, RoundingMode.FLOOR);
    }

    public static void P(long[] jArr, long j10) {
        long j11;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i10 = 0;
        if (j10 >= 1000000 && j10 % 1000000 == 0) {
            long jG = R3.a.G(j10, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = R3.a.G(jArr[i10], jG, roundingMode);
                i10++;
            }
            return;
        }
        if (j10 < 1000000 && 1000000 % j10 == 0) {
            long jG2 = R3.a.G(1000000L, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = R3.a.Z(jArr[i10], jG2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j10 >= j12 && j10 % j12 == 0) {
                    jArr[i11] = R3.a.G(1000000L, R3.a.G(j10, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j10 >= j12 || j12 % j10 != 0) {
                    j11 = j10;
                    jArr[i11] = R(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = R3.a.Z(1000000L, R3.a.G(j12, j10, RoundingMode.UNNECESSARY));
                }
                j11 = j10;
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public static long Q(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return R3.a.G(j10, R3.a.G(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return R3.a.Z(j10, R3.a.G(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? R(j10, j11, j12, roundingMode) : R3.a.Z(j11, R3.a.G(j10, j12, RoundingMode.UNNECESSARY));
        }
        return R3.a.G(j11, R3.a.G(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0100, please report this as an issue */
    public static long R(long j10, long j11, long j12, RoundingMode roundingMode) {
        double dRint;
        long j13;
        boolean z10;
        long jZ = R3.a.Z(j10, j11);
        if (jZ != Long.MAX_VALUE && jZ != Long.MIN_VALUE) {
            return R3.a.G(jZ, j12, roundingMode);
        }
        long jK = R3.a.K(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jG = R3.a.G(j11, jK, roundingMode2);
        long jG2 = R3.a.G(j12, jK, roundingMode2);
        long jK2 = R3.a.K(Math.abs(j10), Math.abs(jG2));
        long jG3 = R3.a.G(j10, jK2, roundingMode2);
        long jG4 = R3.a.G(jG2, jK2, roundingMode2);
        long jZ2 = R3.a.Z(jG3, jG);
        if (jZ2 != Long.MAX_VALUE && jZ2 != Long.MIN_VALUE) {
            return R3.a.G(jZ2, jG4, roundingMode);
        }
        double d10 = jG3 * (jG / jG4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i10 = C6.c.f1481a;
        if (Math.getExponent(d10) > 1023) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C6.b.f1480a[roundingMode.ordinal()]) {
            case 1:
                if (!C6.c.a(d10)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 2:
                if (d10 >= 0.0d || C6.c.a(d10)) {
                    dRint = d10;
                } else {
                    j13 = ((long) d10) - 1;
                    dRint = j13;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 3:
                if (d10 <= 0.0d || C6.c.a(d10)) {
                    dRint = d10;
                } else {
                    j13 = ((long) d10) + 1;
                    dRint = j13;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 4:
                dRint = d10;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 5:
                if (C6.c.a(d10)) {
                    dRint = d10;
                } else {
                    dRint = ((long) d10) + ((long) (d10 > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d10);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d10) + d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d10);
                if (Math.abs(d10 - dRint) == 0.5d) {
                    dRint = d10;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d10 + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }

    public static String[] S(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long T(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        return z10 ? iBinarySearch : i10;
    }

    public static int c(A0.b bVar, long j10) {
        int i10 = bVar.f88a - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            if (bVar.d(i12) < j10) {
                i11 = i12 + 1;
            } else {
                i10 = i12 - 1;
            }
        }
        int i13 = i10 + 1;
        if (i13 < bVar.f88a && bVar.d(i13) == j10) {
            return i13;
        }
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    public static int d(E e2, Long l10, boolean z10) {
        int i10;
        int iBinarySearch = Collections.binarySearch(e2, l10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || ((Comparable) e2.get(i11)).compareTo(l10) != 0) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int e(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static int f(long[] jArr, long j10, boolean z10) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        return z10 ? Math.max(0, i10) : i10;
    }

    public static int g(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static float i(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int j(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long k(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean l(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i10, byte[] bArr, int i11, int i12) {
        while (i10 < i11) {
            i12 = f572n[((i12 >>> 24) ^ (bArr[i10] & ColorExtractionConstants.COLOR_COMPONENT_MASK)) & ColorExtractionConstants.COLOR_COMPONENT_MASK] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static Handler n(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0111a.i(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, p267z6.h.f29879c);
    }

    public static int p(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return 28;
                    default:
                        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
        }
    }

    public static AudioFormat q(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static int r(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return RCHTTPStatusCodes.NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f560a >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int s(int i10, String str) {
        int i11 = 0;
        for (String str2 : S(str)) {
            if (i10 == p255y2.C.g(p255y2.C.c(str2))) {
                i11++;
            }
        }
        return i11;
    }

    public static String t(int i10, String str) {
        String[] strArrS = S(str);
        if (strArrS.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrS) {
            if (i10 == p255y2.C.g(p255y2.C.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(com.amazon.a.a.o.b.f.f16451a);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int u(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return 6005;
            case 17:
            case 19:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int v(String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static long w(float f10, long j10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long x(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static int y(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int z(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i11 * 3;
            }
            return i11 * 4;
        }
        return i11 * 2;
    }
}
