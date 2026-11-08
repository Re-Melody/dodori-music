package J1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6461a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f6462b = new char[24];

    public static void a(long j10, String str) {
        if (j10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j10 <= Long.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(long j10, StringBuilder sb) {
        synchronized (f6461a) {
            sb.append(f6462b, 0, d(j10));
        }
    }

    public static int d(long j10) {
        char c3;
        int i10;
        int i11;
        int i12;
        if (f6462b.length < 0) {
            f6462b = new char[0];
        }
        char[] cArr = f6462b;
        if (j10 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j10 > 0) {
            c3 = '+';
        } else {
            j10 = -j10;
            c3 = '-';
        }
        int i13 = (int) (j10 % 1000);
        int iFloor = (int) Math.floor(j10 / 1000);
        if (iFloor > 86400) {
            i10 = iFloor / 86400;
            iFloor -= 86400 * i10;
        } else {
            i10 = 0;
        }
        if (iFloor > 3600) {
            i11 = iFloor / 3600;
            iFloor -= i11 * 3600;
        } else {
            i11 = 0;
        }
        if (iFloor > 60) {
            int i14 = iFloor / 60;
            iFloor -= i14 * 60;
            i12 = i14;
        } else {
            i12 = 0;
        }
        cArr[0] = c3;
        int iE = e(cArr, i10, 'd', 1, false, 0);
        int iE2 = e(cArr, i11, 'h', iE, iE != 1, 0);
        int iE3 = e(cArr, i12, 'm', iE2, iE2 != 1, 0);
        int iE4 = e(cArr, i13, 'm', e(cArr, iFloor, 's', iE3, iE3 != 1, 0), true, 0);
        cArr[iE4] = 's';
        return iE4 + 1;
    }

    public static int e(char[] cArr, int i10, char c3, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        cArr[i13 + 1] = c3;
        return i13 + 2;
    }
}
