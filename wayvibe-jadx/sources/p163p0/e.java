package p163p0;

import F0.J;
import S5.d;
import p028c1.b;
import p028c1.k;
import p133m0.c;
import p133m0.f;
import p143n0.AbstractC2091s;
import p143n0.AbstractC2097y;
import p143n0.C2081h;
import p143n0.C2083j;
import p143n0.U;
import p150n8.a;

/* JADX INFO: loaded from: classes.dex */
public interface e extends b {
    static void C(J j10, AbstractC2091s abstractC2091s, long j11, long j12, long j13, f fVar, int i10) {
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        long j14 = j11;
        j10.I(abstractC2091s, j14, (i10 & 4) != 0 ? D(j10.f3621a.c(), j14) : j12, j13, 1.0f, (i10 & 32) != 0 ? h.f25151a : fVar);
    }

    static long D(long j10, long j11) {
        return d.i(f.d(j10) - c.d(j11), f.b(j10) - c.e(j11));
    }

    static /* synthetic */ void T(e eVar, long j10, long j11, int i10) {
        if ((i10 & 4) != 0) {
            j11 = D(eVar.c(), 0L);
        }
        eVar.V(j10, 0L, j11, (i10 & 64) != 0 ? 3 : 0);
    }

    static void a0(e eVar, C2081h c2081h, long j10, long j11, float f10, AbstractC2097y abstractC2097y, int i10, int i11) {
        eVar.b0(c2081h, 0L, j10, (i11 & 16) != 0 ? j10 : j11, (i11 & 32) != 0 ? 1.0f : f10, abstractC2097y, (i11 & 512) != 0 ? 1 : i10);
    }

    static /* synthetic */ void e(e eVar, U u10, AbstractC2091s abstractC2091s, float f10, i iVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        f fVar = iVar;
        if ((i10 & 8) != 0) {
            fVar = h.f25151a;
        }
        eVar.r(u10, abstractC2091s, f11, fVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void j0(e eVar, AbstractC2091s abstractC2091s, long j10, long j11, float f10, f fVar, int i10) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = D(eVar.c(), j12);
        }
        eVar.X(abstractC2091s, j12, j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? h.f25151a : fVar);
    }

    static /* synthetic */ void k(e eVar, long j10, float f10, long j11, int i10) {
        if ((i10 & 4) != 0) {
            j11 = eVar.c0();
        }
        eVar.f(j10, j11, f10);
    }

    void I(AbstractC2091s abstractC2091s, long j10, long j11, long j12, float f10, f fVar);

    void N(long j10, long j11, long j12, long j13);

    a Q();

    void R(long j10, long j11, long j12);

    void V(long j10, long j11, long j12, int i10);

    void X(AbstractC2091s abstractC2091s, long j10, long j11, float f10, f fVar);

    void b0(C2081h c2081h, long j10, long j11, long j12, float f10, AbstractC2097y abstractC2097y, int i10);

    default long c() {
        return Q().k0();
    }

    default long c0() {
        return d.A(Q().k0());
    }

    void f(long j10, long j11, float f10);

    void f0(C2083j c2083j, long j10, f fVar);

    k getLayoutDirection();

    void n0(long j10, float f10, float f11, long j11, long j12, f fVar);

    void r(U u10, AbstractC2091s abstractC2091s, float f10, f fVar, int i10);
}
