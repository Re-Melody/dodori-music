package U4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.apple.android.music.playback.model.MediaPlayerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import org.maplibre.android.log.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f12217b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f12218c = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f12219a = new StringBuilder();

    public static void a(String str, f fVar) {
        Layout.Alignment alignment;
        Matcher matcher = f12218c.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                boolean zEquals = "line".equals(strGroup);
                int i10 = MediaPlayerException.ERROR_UNKNOWN;
                if (zEquals) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "center":
                            case "middle":
                            case "end":
                            case "start":
                            default:
                                fVar.getClass();
                                strGroup2 = strGroup2.substring(0, iIndexOf);
                                break;
                        }
                    } else {
                        fVar.getClass();
                    }
                    if (strGroup2.endsWith("%")) {
                        fVar.f12205e = l.c(strGroup2);
                    } else {
                        int i11 = Integer.parseInt(strGroup2);
                        if (i11 < 0) {
                            i11--;
                        }
                        fVar.f12205e = i11;
                    }
                } else if ("align".equals(strGroup)) {
                    strGroup2.getClass();
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        default:
                            alignment = null;
                            break;
                    }
                    fVar.f12204d = alignment;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        strSubstring2.getClass();
                        switch (strSubstring2) {
                            case "center":
                            case "middle":
                                i10 = 1;
                                break;
                            case "end":
                                i10 = 2;
                                break;
                            case "start":
                                i10 = 0;
                                break;
                        }
                        fVar.f12207g = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    } else {
                        fVar.f12207g = MediaPlayerException.ERROR_UNKNOWN;
                    }
                    fVar.f12206f = l.c(strGroup2);
                } else if ("size".equals(strGroup)) {
                    l.c(strGroup2);
                    fVar.getClass();
                }
            } catch (NumberFormatException unused) {
                matcher.group();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    public static void b(String str, h hVar, SpannableStringBuilder spannableStringBuilder, List list, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r11;
        int size;
        boolean zIsEmpty;
        int i16 = 0;
        int i17 = hVar.f12212b;
        int length = spannableStringBuilder.length();
        String str2 = hVar.f12211a;
        str2.getClass();
        int i18 = 1;
        switch (str2) {
            case "":
            case "c":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i17, length, 33);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i17, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i17, length, 33);
                break;
            default:
                return;
        }
        arrayList.clear();
        int size2 = list.size();
        int i19 = 0;
        while (i19 < size2) {
            d dVar = (d) list.get(i19);
            if (dVar.f12187a.isEmpty() && dVar.f12188b.isEmpty() && dVar.f12189c.isEmpty() && dVar.f12190d.isEmpty()) {
                zIsEmpty = str2.isEmpty();
                i15 = i18;
            } else {
                i15 = i18;
                int iA = d.a(dVar.f12190d, d.a(dVar.f12188b, d.a(dVar.f12187a, i16, 1073741824, str), 2, str2), 4, hVar.f12213c);
                if (iA == -1 || !Arrays.asList(hVar.f12214d).containsAll(dVar.f12189c)) {
                    r11 = 0;
                } else {
                    size = (dVar.f12189c.size() * 4) + iA;
                }
            }
            if (r11 > 0) {
                r11 = size;
                r11 = zIsEmpty;
                arrayList.add(new i(r11, dVar));
            } else {
                r11 = size;
                r11 = zIsEmpty;
            }
            i19++;
            i18 = i15;
            i16 = 0;
        }
        int i20 = i18;
        Collections.sort(arrayList);
        int size3 = arrayList.size();
        int i21 = 0;
        while (i21 < size3) {
            d dVar2 = ((i) arrayList.get(i21)).f12216b;
            int i22 = dVar2.f12197l;
            if (i22 == -1 && dVar2.f12198m == -1) {
                i10 = -1;
            } else {
                int i23 = i20;
                i10 = (i22 == i23 ? i23 : 0) | (dVar2.f12198m == i23 ? 2 : 0);
            }
            if (i10 != -1) {
                int i24 = dVar2.f12197l;
                if (i24 == -1 && dVar2.f12198m == -1) {
                    i14 = -1;
                    i12 = 1;
                } else {
                    i12 = 1;
                    i14 = (i24 == 1 ? 1 : 0) | (dVar2.f12198m == 1 ? 2 : 0);
                }
                StyleSpan styleSpan = new StyleSpan(i14);
                i11 = 33;
                spannableStringBuilder.setSpan(styleSpan, i17, length, 33);
            } else {
                i11 = 33;
                i12 = 1;
            }
            if (dVar2.f12196j == i12) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i17, length, i11);
            }
            if (dVar2.k == i12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i17, length, i11);
            }
            if (dVar2.f12193g) {
                if (!dVar2.f12193g) {
                    throw new IllegalStateException("Font color not defined");
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar2.f12192f), i17, length, 33);
            }
            if (dVar2.f12195i) {
                if (!dVar2.f12195i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar2.f12194h), i17, length, 33);
            }
            if (dVar2.f12191e != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar2.f12191e), i17, length, 33);
            }
            int i25 = dVar2.f12199n;
            if (i25 != 1) {
                if (i25 == 2 || i25 == 3) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.0f), i17, length, 33);
                }
                i13 = 1;
            } else {
                i13 = 1;
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) 0.0f, true), i17, length, 33);
            }
            i21 += i13;
            i20 = i13;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00e0. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, String str2, f fVar, List list) {
        int i10;
        int i11;
        h hVar;
        int i12 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String strTrim = "";
            if (i14 >= str2.length()) {
                while (!stack.isEmpty()) {
                    b(str, (h) stack.pop(), spannableStringBuilder, list, arrayList);
                }
                b(str, new h("", new String[0], 0, ""), spannableStringBuilder, list, arrayList);
                fVar.f12203c = spannableStringBuilder;
                return;
            }
            char cCharAt = str2.charAt(i14);
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i14 += i12;
                } else {
                    int i15 = i14 + 1;
                    if (i15 >= str2.length()) {
                        i14 = i15;
                    } else {
                        int i16 = str2.charAt(i15) == '/' ? i12 : i13;
                        int iIndexOf = str2.indexOf(62, i15);
                        int length = iIndexOf == -1 ? str2.length() : iIndexOf + i12;
                        int i17 = length - 2;
                        int i18 = i12;
                        int i19 = str2.charAt(i17) == '/' ? i18 : i13;
                        int i20 = i14 + (i16 != 0 ? 2 : i18);
                        if (i19 == 0) {
                            i17 = length - 1;
                        }
                        String strSubstring = str2.substring(i20, i17);
                        String strTrim2 = strSubstring.trim();
                        String str3 = strTrim2.isEmpty() ? null : strTrim2.split("[ \\.]")[i13];
                        if (str3 != null) {
                            switch (str3.hashCode()) {
                                case 98:
                                    i11 = !str3.equals("b") ? -1 : i13;
                                    break;
                                case Logger.NONE /* 99 */:
                                    i11 = !str3.equals("c") ? -1 : i18;
                                    break;
                                case 105:
                                    i11 = !str3.equals("i") ? -1 : 2;
                                    break;
                                case 117:
                                    i11 = !str3.equals("u") ? -1 : 3;
                                    break;
                                case 118:
                                    i11 = !str3.equals("v") ? -1 : 4;
                                    break;
                                case 3314158:
                                    i11 = !str3.equals("lang") ? -1 : 5;
                                    break;
                                default:
                                    i11 = -1;
                                    break;
                            }
                            switch (i11) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    if (i16 != 0) {
                                        while (!stack.isEmpty()) {
                                            h hVar2 = (h) stack.pop();
                                            b(str, hVar2, spannableStringBuilder, list, arrayList);
                                            if (hVar2.f12211a.equals(str3)) {
                                            }
                                        }
                                    } else if (i19 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring.trim();
                                        if (strTrim3.isEmpty()) {
                                            hVar = null;
                                        } else {
                                            int iIndexOf2 = strTrim3.indexOf(StringUtils.SPACE);
                                            if (iIndexOf2 != -1) {
                                                strTrim = strTrim3.substring(iIndexOf2).trim();
                                                strTrim3 = strTrim3.substring(i13, iIndexOf2);
                                            }
                                            String[] strArrSplit = strTrim3.split("\\.");
                                            hVar = new h(strArrSplit[i13], strArrSplit.length > i18 ? (String[]) Arrays.copyOfRange(strArrSplit, i18, strArrSplit.length) : h.f12210e, length2, strTrim);
                                        }
                                        stack.push(hVar);
                                    }
                                    i14 = length;
                                    i10 = 1;
                                    break;
                                default:
                                    break;
                            }
                        }
                        i14 = length;
                        i12 = 1;
                    }
                }
                i10 = i12;
            } else {
                i14++;
                int iIndexOf3 = str2.indexOf(59, i14);
                int iIndexOf4 = str2.indexOf(32, i14);
                if (iIndexOf3 == -1) {
                    iIndexOf3 = iIndexOf4;
                } else if (iIndexOf4 != -1) {
                    iIndexOf3 = Math.min(iIndexOf3, iIndexOf4);
                }
                if (iIndexOf3 != -1) {
                    String strSubstring2 = str2.substring(i14, iIndexOf3);
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                    }
                    if (iIndexOf3 == iIndexOf4) {
                        spannableStringBuilder.append((CharSequence) StringUtils.SPACE);
                    }
                    i10 = 1;
                    i14 = iIndexOf3 + 1;
                } else {
                    i10 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
            }
            i12 = i10;
            i13 = 0;
        }
    }

    public static boolean d(String str, Matcher matcher, X4.f fVar, f fVar2, StringBuilder sb, ArrayList arrayList) {
        try {
            fVar2.f12201a = l.a(matcher.group(1));
            fVar2.f12202b = l.a(matcher.group(2));
            a(matcher.group(3), fVar2);
            sb.setLength(0);
            while (true) {
                String strT = fVar.t();
                if (TextUtils.isEmpty(strT)) {
                    c(str, sb.toString(), fVar2, arrayList);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strT.trim());
            }
        } catch (NumberFormatException unused) {
            matcher.group();
            return false;
        }
    }
}
