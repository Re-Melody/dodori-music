package okhttp3.internal;

import E9.AbstractC0341b;
import E9.C0348i;
import E9.C0351l;
import E9.InterfaceC0350k;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.m;
import org.apache.tika.fork.ForkServer;
import p097i9.k;
import p217u7.d;

/* JADX INFO: loaded from: classes2.dex */
public final class _UtilCommonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f24159a = new byte[0];

    static {
        C0351l c0351l = C0351l.f3388d;
        AbstractC0341b.f(d.k("efbbbf"), d.k("feff"), d.k("fffe0000"), d.k("fffe"), d.k("0000feff"));
    }

    public static final void a(Closeable closeable) {
        m.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final int b(String str, char c3, int i10, int i11) {
        m.f(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int c(String str, int i10, int i11, String str2) {
        m.f(str, "<this>");
        while (i10 < i11) {
            if (k.m0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean d(String[] strArr, String[] strArr2, Comparator comparator) {
        m.f(strArr, "<this>");
        m.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int e(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (m.g(cCharAt, 31) <= 0 || m.g(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int f(int i10, int i11, String str) {
        m.f(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int g(int i10, int i11, String str) {
        m.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] h(String[] strArr, String[] other, Comparator comparator) {
        m.f(strArr, "<this>");
        m.f(other, "other");
        m.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String name) {
        m.f(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int j(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' > c3 || c3 >= 'G') {
            return -1;
        }
        return c3 - '7';
    }

    public static final int k(InterfaceC0350k interfaceC0350k) {
        m.f(interfaceC0350k, "<this>");
        return (interfaceC0350k.readByte() & ForkServer.ERROR) | ((interfaceC0350k.readByte() & ForkServer.ERROR) << 16) | ((interfaceC0350k.readByte() & ForkServer.ERROR) << 8);
    }

    public static final int l(C0348i c0348i) throws EOFException {
        int i10 = 0;
        while (!c0348i.g() && c0348i.l(0L) == 61) {
            i10++;
            c0348i.readByte();
        }
        return i10;
    }

    public static final int m(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return f.API_PRIORITY_OTHER;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String n(int i10, int i11, String str) {
        int iF = f(i10, i11, str);
        String strSubstring = str.substring(iF, g(iF, i11, str));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
