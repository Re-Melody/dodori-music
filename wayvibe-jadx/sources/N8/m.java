package N8;

import D7.W;
import G0.C0480j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends p242x0.c {
    public static List A0(long[] jArr) {
        kotlin.jvm.internal.m.f(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return s.f8650a;
        }
        if (length == 1) {
            return W.T(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static List B0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new j(objArr, false)) : W.T(objArr[0]);
        }
        return s.f8650a;
    }

    public static List e0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.m.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static p085h9.h f0(Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return objArr.length == 0 ? p085h9.d.f20344a : new C0480j1(objArr, 1);
    }

    public static boolean g0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        return v0(obj, objArr) >= 0;
    }

    public static void h0(int i10, int i11, int i12, int[] iArr, int[] destination) {
        kotlin.jvm.internal.m.f(iArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    public static void i0(int i10, byte[] bArr, int i11, byte[] destination, int i12) {
        kotlin.jvm.internal.m.f(bArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    public static void j0(char[] cArr, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m.f(cArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
    }

    public static void k0(Object[] objArr, int i10, Object[] destination, int i11, int i12) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        kotlin.jvm.internal.m.f(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    public static /* synthetic */ void l0(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        h0(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void m0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        k0(objArr, 0, objArr2, i10, i11);
    }

    public static byte[] n0(byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.m.f(bArr, "<this>");
        p242x0.c.h(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        kotlin.jvm.internal.m.e(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] o0(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        p242x0.c.h(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        kotlin.jvm.internal.m.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void p0(Object[] objArr, int i10, int i11) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }

    public static void q0(long[] jArr) {
        int length = jArr.length;
        kotlin.jvm.internal.m.f(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static List s0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static p064f9.g t0(int[] iArr) {
        return new p064f9.g(0, iArr.length - 1, 1);
    }

    public static Object u0(int i10, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static int v0(Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String w0(int i10, Object[] objArr) {
        String str = (i10 & 1) != 0 ? ", " : com.amazon.a.a.o.b.f.f16451a;
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        kotlin.jvm.internal.m.f(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            org.slf4j.helpers.i.k(sb, obj, null);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String x0(byte[] bArr, String str, Z8.c cVar, int i10) {
        String str2 = (i10 & 2) != 0 ? "" : "[";
        String str3 = (i10 & 4) == 0 ? "]" : "";
        if ((i10 & 32) != 0) {
            cVar = null;
        }
        kotlin.jvm.internal.m.f(bArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) str);
            }
            if (cVar != null) {
                sb.append((CharSequence) cVar.invoke(Byte.valueOf(b10)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b10));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static byte[] y0(byte[] bArr, byte[] elements) {
        kotlin.jvm.internal.m.f(bArr, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        kotlin.jvm.internal.m.c(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char z0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
