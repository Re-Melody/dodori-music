package F9;

import E9.C0348i;
import E9.H;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f4617b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(p097i9.a.f20563a);
        kotlin.jvm.internal.m.e(bytes, "getBytes(...)");
        f4616a = bytes;
        f4617b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean a(H h10, int i10, byte[] bArr, int i11, int i12) {
        int i13 = h10.f3350c;
        byte[] bArr2 = h10.f3348a;
        while (i11 < i12) {
            if (i10 == i13) {
                h10 = h10.f3353f;
                kotlin.jvm.internal.m.c(h10);
                i10 = h10.f3349b;
                i13 = h10.f3350c;
                bArr2 = h10.f3348a;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String b(long j10, C0348i c0348i) throws EOFException {
        kotlin.jvm.internal.m.f(c0348i, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c0348i.l(j11) == 13) {
                String strC = c0348i.C(j11, p097i9.a.f20563a);
                c0348i.skip(2L);
                return strC;
            }
        }
        String strC2 = c0348i.C(j10, p097i9.a.f20563a);
        c0348i.skip(1L);
        return strC2;
    }
}
