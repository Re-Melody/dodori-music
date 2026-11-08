package D0;

import F0.InterfaceC0384b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1761a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(W w10, X x10) {
        w10.getClass();
        if (x10 instanceof InterfaceC0384b0) {
            ((InterfaceC0384b0) x10).Z(w10.f1761a);
        }
    }

    public static void d(W w10, X x10, int i10, int i11) {
        w10.getClass();
        long jA = S9.b.a(i10, i11);
        a(w10, x10);
        x10.o0(p028c1.h.c(jA, x10.f1766e), 0.0f, null);
    }

    public static void e(W w10, X x10, long j10) {
        w10.getClass();
        a(w10, x10);
        x10.o0(p028c1.h.c(j10, x10.f1766e), 0.0f, null);
    }

    public static void f(W w10, X x10, int i10, int i11) {
        long jA = S9.b.a(i10, i11);
        if (w10.b() == p028c1.k.Ltr || w10.c() == 0) {
            a(w10, x10);
            x10.o0(p028c1.h.c(jA, x10.f1766e), 0.0f, null);
        } else {
            long jA2 = S9.b.a((w10.c() - x10.f1762a) - ((int) (jA >> 32)), (int) (jA & 4294967295L));
            a(w10, x10);
            x10.o0(p028c1.h.c(jA2, x10.f1766e), 0.0f, null);
        }
    }

    public static void g(W w10, X x10, int i10, int i11) {
        int i12 = Z.f1771b;
        Y y6 = Y.f1767b;
        long jA = S9.b.a(i10, i11);
        if (w10.b() == p028c1.k.Ltr || w10.c() == 0) {
            a(w10, x10);
            x10.o0(p028c1.h.c(jA, x10.f1766e), 0.0f, y6);
        } else {
            long jA2 = S9.b.a((w10.c() - x10.f1762a) - ((int) (jA >> 32)), (int) (jA & 4294967295L));
            a(w10, x10);
            x10.o0(p028c1.h.c(jA2, x10.f1766e), 0.0f, y6);
        }
    }

    public static void h(W w10, X x10, Z8.c cVar) {
        w10.getClass();
        long jA = S9.b.a(0, 0);
        a(w10, x10);
        x10.o0(p028c1.h.c(jA, x10.f1766e), 0.0f, cVar);
    }

    public static void i(W w10, X x10, long j10) {
        int i10 = Z.f1771b;
        Y y6 = Y.f1767b;
        w10.getClass();
        a(w10, x10);
        x10.o0(p028c1.h.c(j10, x10.f1766e), 0.0f, y6);
    }

    public abstract p028c1.k b();

    public abstract int c();
}
