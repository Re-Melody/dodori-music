package okhttp3.internal.url;

import E9.C0348i;
import java.io.EOFException;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilCommonKt;
import org.apache.tika.fork.ForkServer;
import p097i9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class _UrlKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24596a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i10, int i11, String str2, int i12) throws EOFException {
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z10 = (i12 & 8) == 0;
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        boolean z13 = (i12 & 64) == 0;
        m.f(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || k.m0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !b(iCharCount, length, str)))) || (iCodePointAt == 43 && z12)))) {
                C0348i c0348i = new C0348i();
                c0348i.Q(i13, iCharCount, str);
                C0348i c0348i2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i14 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c0348i.R("+");
                        } else if (iCodePointAt2 == 43 && z12) {
                            c0348i.R(z10 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i14 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z13) && !k.m0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z10 && (!z11 || b(iCharCount, length, str))))) {
                                    c0348i.S(iCodePointAt2);
                                }
                            }
                            if (c0348i2 == null) {
                                c0348i2 = new C0348i();
                            }
                            c0348i2.S(iCodePointAt2);
                            while (!c0348i2.g()) {
                                byte b10 = c0348i2.readByte();
                                int i15 = b10 & ForkServer.ERROR;
                                c0348i.K(37);
                                char[] cArr = f24596a;
                                c0348i.K(cArr[(i15 >> 4) & 15]);
                                c0348i.K(cArr[b10 & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i14 = 32;
                }
                return c0348i.D();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i13, length);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean b(int i10, int i11, String str) {
        m.f(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && _UtilCommonKt.j(str.charAt(i10 + 1)) != -1 && _UtilCommonKt.j(str.charAt(i12)) != -1;
    }

    public static String c(int i10, int i11, int i12, String str) {
        int i13;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        boolean z10 = (i12 & 4) == 0;
        m.f(str, "<this>");
        int iCharCount = i10;
        while (iCharCount < i11) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                C0348i c0348i = new C0348i();
                c0348i.Q(i10, iCharCount, str);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iJ = _UtilCommonKt.j(str.charAt(iCharCount + 1));
                        int iJ2 = _UtilCommonKt.j(str.charAt(i13));
                        if (iJ == -1 || iJ2 == -1) {
                            c0348i.S(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0348i.K((iJ << 4) + iJ2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        c0348i.K(32);
                        iCharCount++;
                    } else {
                        c0348i.S(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0348i.D();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i10, i11);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
