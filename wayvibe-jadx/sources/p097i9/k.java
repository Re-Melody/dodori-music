package p097i9;

import B2.AbstractC0112b;
import D7.W;
import N8.l;
import N8.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p046da.b;
import p064f9.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends r {
    public static int A0(CharSequence charSequence, char c3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = s0(charSequence);
        }
        m.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, i10);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(N8.m.z0(cArr), i10);
        }
        int iS0 = s0(charSequence);
        if (i10 > iS0) {
            i10 = iS0;
        }
        while (-1 < i10) {
            if (b.u(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    public static String B0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        m.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            sb.append((CharSequence) str);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String C0(int i10, String str) {
        CharSequence charSequenceSubSequence;
        m.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean D0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.u(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String E0(String str, String prefix) {
        m.f(prefix, "prefix");
        if (!r.j0(str, prefix, false)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder F0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        m.f(charSequence, "<this>");
        m.f(replacement, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0112b.f("End index (", i11, ") is less than start index (", i10, ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i10);
        sb.append(replacement);
        sb.append(charSequence, i11, charSequence.length());
        return sb;
    }

    public static final void G0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(p134m1.b.j(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List H0(int i10, String str, String str2) {
        G0(i10);
        int iT0 = t0(str, str2, 0, false);
        if (iT0 == -1 || i10 == 1) {
            return W.T(str.toString());
        }
        boolean z10 = i10 > 0;
        int i11 = 10;
        if (z10 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iT0).toString());
            length = str2.length() + iT0;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iT0 = t0(str, str2, length, false);
        } while (iT0 != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static List I0(String str, char[] cArr, int i10) {
        int i11 = (i10 & 4) != 0 ? 0 : 2;
        m.f(str, "<this>");
        if (cArr.length == 1) {
            return H0(i11, str, String.valueOf(cArr[0]));
        }
        G0(i11);
        l lVar = new l(new c(str, i11, new s(cArr, 0)), 2);
        ArrayList arrayList = new ArrayList(o.o0(lVar, 10));
        Iterator it = lVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            g range = (g) bVar.next();
            m.f(range, "range");
            arrayList.add(str.subSequence(range.f19892a, range.f19893b + 1).toString());
        }
    }

    public static List J0(String str, String[] strArr, int i10) {
        int i11 = (i10 & 4) != 0 ? 0 : 2;
        m.f(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return H0(i11, str, str2);
            }
        }
        G0(i11);
        l lVar = new l(new c(str, i11, new s(N8.m.e0(strArr), 1)), 2);
        ArrayList arrayList = new ArrayList(o.o0(lVar, 10));
        Iterator it = lVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            g range = (g) bVar.next();
            m.f(range, "range");
            arrayList.add(str.subSequence(range.f19892a, range.f19893b + 1).toString());
        }
    }

    public static boolean K0(String str, char c3) {
        return str.length() > 0 && b.u(str.charAt(0), c3, false);
    }

    public static String L0(char c3, String str, String str2) {
        int iU0 = u0(str, c3, 0, 6);
        if (iU0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iU0 + 1, str.length());
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String M0(String str, String delimiter, String str2) {
        m.f(delimiter, "delimiter");
        int iV0 = v0(str, delimiter, 0, 6);
        if (iV0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iV0, str.length());
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N0(char c3, String str, String str2) {
        m.f(str, "<this>");
        int iA0 = A0(str, c3, 0, 6);
        if (iA0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA0 + 1, str.length());
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O0(String missingDelimiterValue, char c3) {
        m.f(missingDelimiterValue, "<this>");
        m.f(missingDelimiterValue, "missingDelimiterValue");
        int iU0 = u0(missingDelimiterValue, c3, 0, 6);
        if (iU0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iU0);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String missingDelimiterValue, String str) {
        m.f(missingDelimiterValue, "<this>");
        m.f(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(missingDelimiterValue, str, 0, 6);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iV0);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(String missingDelimiterValue, char c3) {
        m.f(missingDelimiterValue, "<this>");
        m.f(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = A0(missingDelimiterValue, c3, 0, 6);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iA0);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(int i10, String str) {
        m.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence S0(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zO = b.O(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zO) {
                    break;
                }
                length--;
            } else if (zO) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static boolean m0(CharSequence charSequence, char c3) {
        m.f(charSequence, "<this>");
        return u0(charSequence, c3, 0, 2) >= 0;
    }

    public static boolean n0(CharSequence charSequence, String other) {
        m.f(charSequence, "<this>");
        m.f(other, "other");
        return v0(charSequence, other, 0, 2) >= 0;
    }

    public static String o0(int i10, String str) {
        m.f(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0112b.d(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String p0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return R0(length, str);
    }

    public static boolean q0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? r.b0((String) charSequence, str, false) : D0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean r0(String str, char c3) {
        return str.length() > 0 && b.u(str.charAt(s0(str)), c3, false);
    }

    public static final int s0(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int t0(CharSequence charSequence, String string, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        m.f(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        int length = charSequence.length();
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        g gVar = new g(i10, length, 1);
        boolean z11 = charSequence instanceof String;
        int i11 = gVar.f19894c;
        int i12 = gVar.f19893b;
        int i13 = gVar.f19892a;
        if (!z11 || string == null) {
            boolean z12 = z10;
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z13 = z12;
                z12 = z13;
                if (D0(string, 0, charSequence2, i13, string.length(), z13)) {
                    return i13;
                }
                if (i13 == i12) {
                    return -1;
                }
                i13 += i11;
                charSequence = charSequence2;
            }
        } else {
            if ((i11 <= 0 || i13 > i12) && (i11 >= 0 || i12 > i13)) {
                return -1;
            }
            int i14 = i13;
            while (true) {
                String str = string;
                boolean z14 = z10;
                if (r.e0(0, i14, string.length(), str, (String) charSequence, z14)) {
                    return i14;
                }
                if (i14 == i12) {
                    return -1;
                }
                i14 += i11;
                string = str;
                z10 = z14;
            }
        }
    }

    public static int u0(CharSequence charSequence, char c3, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        m.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? w0(charSequence, new char[]{c3}, i10, false) : ((String) charSequence).indexOf(c3, i10);
    }

    public static /* synthetic */ int v0(CharSequence charSequence, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return t0(charSequence, str, i10, false);
    }

    public static final int w0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        m.f(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(N8.m.z0(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iS0 = s0(charSequence);
        if (i10 > iS0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c3 : cArr) {
                if (b.u(c3, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iS0) {
                return -1;
            }
            i10++;
        }
    }

    public static boolean x0(CharSequence charSequence) {
        m.f(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b.O(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static char y0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(s0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int z0(int i10, String str, String string) {
        int iS0 = (i10 & 2) != 0 ? s0(str) : 0;
        m.f(str, "<this>");
        m.f(string, "string");
        return str.lastIndexOf(string, iS0);
    }
}
