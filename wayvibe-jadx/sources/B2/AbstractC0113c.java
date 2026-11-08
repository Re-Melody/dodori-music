package B2;

import android.graphics.Color;
import android.text.TextUtils;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: B2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0113c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f578a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f579b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f580c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f581d;

    static {
        HashMap map = new HashMap();
        f581d = map;
        AbstractC0112b.s(-984833, map, "aliceblue", -332841, "antiquewhite");
        AbstractC0112b.x(map, "aqua", -16711681, -8388652, "aquamarine");
        AbstractC0112b.s(-983041, map, "azure", -657956, "beige");
        AbstractC0112b.s(-6972, map, "bisque", -16777216, "black");
        AbstractC0112b.s(-5171, map, "blanchedalmond", -16776961, "blue");
        AbstractC0112b.s(-7722014, map, "blueviolet", -5952982, "brown");
        AbstractC0112b.s(-2180985, map, "burlywood", -10510688, "cadetblue");
        AbstractC0112b.s(-8388864, map, "chartreuse", -2987746, "chocolate");
        AbstractC0112b.s(-32944, map, "coral", -10185235, "cornflowerblue");
        AbstractC0112b.s(-1828, map, "cornsilk", -2354116, "crimson");
        AbstractC0112b.x(map, "cyan", -16711681, -16777077, "darkblue");
        AbstractC0112b.s(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        AbstractC0112b.x(map, "darkgray", -5658199, -16751616, "darkgreen");
        AbstractC0112b.x(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        AbstractC0112b.s(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        AbstractC0112b.s(-29696, map, "darkorange", -6737204, "darkorchid");
        AbstractC0112b.s(-7667712, map, "darkred", -1468806, "darksalmon");
        AbstractC0112b.s(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        AbstractC0112b.x(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        AbstractC0112b.s(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        AbstractC0112b.x(map, "dodgerblue", -14774017, -5103070, "firebrick");
        AbstractC0112b.s(-1296, map, "floralwhite", -14513374, "forestgreen");
        AbstractC0112b.x(map, "fuchsia", -65281, -2302756, "gainsboro");
        AbstractC0112b.s(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        AbstractC0112b.s(-16744448, map, "green", -5374161, "greenyellow");
        AbstractC0112b.x(map, "grey", -8355712, -983056, "honeydew");
        AbstractC0112b.s(-38476, map, "hotpink", -3318692, "indianred");
        AbstractC0112b.s(-11861886, map, "indigo", -16, "ivory");
        AbstractC0112b.s(-989556, map, "khaki", -1644806, "lavender");
        AbstractC0112b.s(-3851, map, "lavenderblush", -8586240, "lawngreen");
        AbstractC0112b.s(-1331, map, "lemonchiffon", -5383962, "lightblue");
        AbstractC0112b.s(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        AbstractC0112b.s(-18751, map, "lightpink", -24454, "lightsalmon");
        AbstractC0112b.s(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        AbstractC0112b.x(map, "lightsteelblue", -5192482, -32, "lightyellow");
        AbstractC0112b.s(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        AbstractC0112b.s(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        AbstractC0112b.s(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        AbstractC0112b.s(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        AbstractC0112b.s(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        AbstractC0112b.s(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        AbstractC0112b.s(-15132304, map, "midnightblue", -655366, "mintcream");
        AbstractC0112b.s(-6943, map, "mistyrose", -6987, "moccasin");
        AbstractC0112b.s(-8531, map, "navajowhite", -16777088, "navy");
        AbstractC0112b.s(-133658, map, "oldlace", -8355840, "olive");
        AbstractC0112b.s(-9728477, map, "olivedrab", -23296, "orange");
        AbstractC0112b.s(-47872, map, "orangered", -2461482, "orchid");
        AbstractC0112b.s(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        AbstractC0112b.s(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        AbstractC0112b.s(-4139, map, "papayawhip", -9543, "peachpuff");
        AbstractC0112b.s(-3308225, map, "peru", -16181, "pink");
        AbstractC0112b.s(-2252579, map, "plum", -5185306, "powderblue");
        AbstractC0112b.s(-8388480, map, "purple", -10079335, "rebeccapurple");
        AbstractC0112b.s(-65536, map, "red", -4419697, "rosybrown");
        AbstractC0112b.s(-12490271, map, "royalblue", -7650029, "saddlebrown");
        AbstractC0112b.s(-360334, map, "salmon", -744352, "sandybrown");
        AbstractC0112b.s(-13726889, map, "seagreen", -2578, "seashell");
        AbstractC0112b.s(-6270419, map, "sienna", -4144960, "silver");
        AbstractC0112b.s(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        AbstractC0112b.x(map, "snow", -1286, -16711809, "springgreen");
        AbstractC0112b.s(-12156236, map, "steelblue", -2968436, "tan");
        AbstractC0112b.s(-16744320, map, "teal", -2572328, "thistle");
        AbstractC0112b.s(-40121, map, "tomato", 0, "transparent");
        AbstractC0112b.s(-12525360, map, "turquoise", -1146130, "violet");
        AbstractC0112b.s(-663885, map, "wheat", -1, "white");
        AbstractC0112b.s(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        int i10;
        AbstractC0111a.d(!TextUtils.isEmpty(str));
        String strReplace = str.replace(StringUtils.SPACE, "");
        if (strReplace.charAt(0) == '#') {
            int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i11;
            }
            if (strReplace.length() == 9) {
                return ((i11 & ColorExtractionConstants.COLOR_COMPONENT_MASK) << 24) | (i11 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z10 ? f580c : f579b).matcher(strReplace);
            if (matcher.matches()) {
                if (z10) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i10 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i12 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i13 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f578a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i14 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i15 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f581d.get(p224v4.i.e(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
