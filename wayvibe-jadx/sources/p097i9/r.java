package p097i9;

import B2.AbstractC0112b;
import com.amazon.a.a.o.c.a.b;
import com.apple.android.music.playback.model.MediaPlayerException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends q {
    public static String a0(byte[] bArr) {
        m.f(bArr, "<this>");
        return new String(bArr, a.f20563a);
    }

    public static boolean b0(String str, String str2, boolean z10) {
        m.f(str, "<this>");
        return !z10 ? str.endsWith(str2) : e0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean c0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final void d0(String str) {
        throw new NumberFormatException(AbstractC0112b.c('\'', "Invalid number format: '", str));
    }

    public static boolean e0(int i10, int i11, int i12, String str, String other, boolean z10) {
        m.f(str, "<this>");
        m.f(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String f0(String str, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + b.f16463a).toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb.toString();
        m.c(string);
        return string;
    }

    public static String g0(String str, char c3, char c9) {
        m.f(str, "<this>");
        String strReplace = str.replace(c3, c9);
        m.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String h0(String str, String str2, String newValue) {
        m.f(str, "<this>");
        m.f(newValue, "newValue");
        int iT0 = k.t0(str, str2, 0, false);
        if (iT0 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb.append((CharSequence) str, i11, iT0);
            sb.append(newValue);
            i11 = iT0 + length;
            if (iT0 >= str.length()) {
                break;
            }
            iT0 = k.t0(str, str2, iT0 + i10, false);
        } while (iT0 > 0);
        sb.append((CharSequence) str, i11, str.length());
        String string = sb.toString();
        m.e(string, "toString(...)");
        return string;
    }

    public static boolean i0(String str, int i10, String str2, boolean z10) {
        m.f(str, "<this>");
        return !z10 ? str.startsWith(str2, i10) : e0(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean j0(String str, String prefix, boolean z10) {
        m.f(str, "<this>");
        m.f(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : e0(0, 0, prefix.length(), str, prefix, z10);
    }

    public static Integer k0(String str) {
        boolean z10;
        int i10;
        int i11;
        m.f(str, "<this>");
        p046da.b.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (m.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i13 = MediaPlayerException.ERROR_UNKNOWN;
                z10 = true;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static Long l0(String str) {
        boolean z10;
        m.f(str, "<this>");
        p046da.b.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (m.g(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i10 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return null;
                }
                j12 = j10 / ((long) 10);
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * ((long) 10);
            long j14 = iDigit;
            if (j13 < j10 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
