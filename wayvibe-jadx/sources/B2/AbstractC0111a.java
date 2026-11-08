package B2;

import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: B2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f575a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f576b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f577c = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f577c) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbT = V0.p.t(str, "\n  ");
        sbT.append(strReplace.replace("\n", "\n  "));
        sbT.append('\n');
        return sbT.toString();
    }

    public static String b(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f576b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = C.f560a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb.toString();
    }

    public static void c(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, boolean z10) throws g {
        if (!z10) {
            throw new g(str);
        }
    }

    public static void f(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void h(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void k(String str, String str2) {
        synchronized (f577c) {
            Log.d(str, a(str2, null));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f577c) {
            Log.e(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th) {
        synchronized (f577c) {
            Log.e(str, a(str2, th));
        }
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static int[] o(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void p(String str, String str2) {
        synchronized (f577c) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void s(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String t(StringBuilder sb, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb.toString();
        }
        if (sb.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb.charAt(i14) == '.') {
                sb.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb.charAt(i14) == '.' && sb.charAt(i15) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb.toString();
    }

    public static String u(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrO = o(str2);
        if (iArrO[0] != -1) {
            sb.append(str2);
            t(sb, iArrO[1], iArrO[2]);
            return sb.toString();
        }
        int[] iArrO2 = o(str);
        if (iArrO[3] == 0) {
            sb.append((CharSequence) str, 0, iArrO2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrO[2] == 0) {
            sb.append((CharSequence) str, 0, iArrO2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i10 = iArrO[1];
        if (i10 != 0) {
            int i11 = iArrO2[0] + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return t(sb, iArrO[1] + i11, i11 + iArrO[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb.append((CharSequence) str, 0, iArrO2[1]);
            sb.append(str2);
            int i12 = iArrO2[1];
            return t(sb, i12, iArrO[2] + i12);
        }
        int i13 = iArrO2[0] + 2;
        int i14 = iArrO2[1];
        if (i13 >= i14 || i14 != iArrO2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrO2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrO2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i15);
            sb.append(str2);
            return t(sb, iArrO2[1], i15 + iArrO[2]);
        }
        sb.append((CharSequence) str, 0, i14);
        sb.append('/');
        sb.append(str2);
        int i16 = iArrO2[1];
        return t(sb, i16, iArrO[2] + i16 + 1);
    }

    public static Uri v(String str, String str2) {
        return Uri.parse(u(str, str2));
    }

    public static void w(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(p134m1.b.j(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void x(String str, String str2) {
        synchronized (f577c) {
            Log.w(str, a(str2, null));
        }
    }

    public static void y(String str, String str2, Throwable th) {
        synchronized (f577c) {
            Log.w(str, a(str2, th));
        }
    }
}
