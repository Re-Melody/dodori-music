package p229v9;

import U.C0896l;
import U.C0906q;
import U.InterfaceC0898m;
import androidx.compose.foundation.e;
import kotlin.jvm.internal.m;
import p067g0.r;
import p134m1.b;
import p234w3.c;
import p241x.B0;
import p241x.C2300c0;
import p260y9.C2367c;
import p260y9.G;
import p260y9.N;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final C2367c a(p219u9.a elementSerializer) {
        m.f(elementSerializer, "elementSerializer");
        return new C2367c(elementSerializer);
    }

    public static final G b(p219u9.a keySerializer, p219u9.a valueSerializer) {
        m.f(keySerializer, "keySerializer");
        m.f(valueSerializer, "valueSerializer");
        return new G(keySerializer, valueSerializer);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p229v9.a.c(int, int, int, boolean):int");
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return c.c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return c.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(b.j(i11, "negative size: "));
    }

    public static void e(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(c.c(str, Integer.valueOf(i10)));
        }
    }

    public static void f(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(c.c(str, obj));
        }
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(c.c(str, Long.valueOf(j10)));
        }
    }

    public static void j(int i10, int i11) {
        String strC;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strC = c.c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(b.j(i11, "negative size: "));
                }
                strC = c.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void l(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(d(i10, i11, "index"));
        }
    }

    public static void m(int i10, int i11, int i12) {
        String strD;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strD = d(i10, i12, "start index");
            } else {
                strD = (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : c.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void n(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(c.c(str, obj));
        }
    }

    public static void o(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void p(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static final p219u9.a q(p219u9.a aVar) {
        m.f(aVar, "<this>");
        return aVar.getDescriptor().c() ? aVar : new N(aVar);
    }

    public static r r(r rVar, B0 b10) {
        return p067g0.a.a(rVar, new e(b10, false));
    }

    public static final B0 s(InterfaceC0898m interfaceC0898m) {
        int i10 = 0;
        Object[] objArr = new Object[0];
        W4.m mVar = B0.f28093i;
        boolean zD = ((C0906q) interfaceC0898m).d(0);
        C0906q c0906q = (C0906q) interfaceC0898m;
        Object objI = c0906q.I();
        if (zD || objI == C0896l.f11886a) {
            objI = new C2300c0(i10, 2);
            c0906q.d0(objI);
        }
        return (B0) p242x0.c.K(objArr, mVar, null, (Z8.a) objI, c0906q, 0, 4);
    }

    public static r t(r rVar, B0 b10) {
        return p067g0.a.a(rVar, new e(b10, true));
    }
}
