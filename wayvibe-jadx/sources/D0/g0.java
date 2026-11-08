package D0;

import C.C0165x;
import F0.C0390h;
import F0.C0391i;
import F0.C0396n;
import F0.InterfaceC0392j;
import U.C0880d;
import U.C0888h;
import U.C0896l;
import U.C0902o;
import U.C0906q;
import U.C0908r0;
import U.InterfaceC0897l0;
import U.InterfaceC0898m;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0184j f1797a = new C0184j(2);

    public static final void a(p067g0.r rVar, c0.b bVar, M m8, InterfaceC0898m interfaceC0898m, int i10) {
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(1949933075);
        int i11 = 2;
        if ((((c0906q.f(rVar) ? 4 : 2) | i10 | (c0906q.f(m8) ? 256 : ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD)) & 147) == 146 && c0906q.z()) {
            c0906q.N();
        } else {
            int i12 = c0906q.f11922P;
            p067g0.r rVarC = p067g0.a.c(c0906q, rVar);
            InterfaceC0897l0 interfaceC0897l0M = c0906q.m();
            C0396n c0396n = C0396n.f3816c;
            c0906q.X();
            if (c0906q.f11921O) {
                c0906q.l(c0396n);
            } else {
                c0906q.g0();
            }
            InterfaceC0392j.f3811S.getClass();
            C0880d.R(c0906q, C0391i.f3806f, m8);
            C0880d.R(c0906q, C0391i.f3805e, interfaceC0897l0M);
            if (c0906q.f11921O) {
                c0906q.b(M8.D.f8402a, new C0888h(i11, 2));
            }
            C0880d.R(c0906q, C0391i.f3803c, rVarC);
            C0390h c0390h = C0391i.f3809i;
            if (c0906q.f11921O || !kotlin.jvm.internal.m.b(c0906q.I(), Integer.valueOf(i12))) {
                p134m1.b.t(i12, c0906q, i12, c0390h);
            }
            bVar.invoke(c0906q, 6);
            c0906q.q(true);
        }
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new C0165x(rVar, bVar, m8, i10);
        }
    }

    public static final long b(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = c0.f1780b;
        return jFloatToRawIntBits;
    }

    public static final void c(j0 j0Var, p067g0.r rVar, Z8.e eVar, InterfaceC0898m interfaceC0898m, int i10) {
        int i11;
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (c0906q.h(j0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0906q.f(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0906q.h(eVar) ? 256 : ColorExtractionConstants.MINIMUM_ALPHA_THRESHOLD;
        }
        if ((i11 & 147) == 146 && c0906q.z()) {
            c0906q.N();
        } else {
            int i12 = c0906q.f11922P;
            C0902o c0902oM = C0880d.M(c0906q);
            p067g0.r rVarC = p067g0.a.c(c0906q, rVar);
            InterfaceC0897l0 interfaceC0897l0M = c0906q.m();
            C0396n c0396n = C0396n.f3816c;
            c0906q.X();
            if (c0906q.f11921O) {
                c0906q.l(c0396n);
            } else {
                c0906q.g0();
            }
            C0880d.R(c0906q, j0Var.f1810c, j0Var);
            C0880d.R(c0906q, j0Var.f1811d, c0902oM);
            C0880d.R(c0906q, j0Var.f1812e, eVar);
            InterfaceC0392j.f3811S.getClass();
            C0880d.R(c0906q, C0391i.f3805e, interfaceC0897l0M);
            C0880d.R(c0906q, C0391i.f3803c, rVarC);
            C0390h c0390h = C0391i.f3809i;
            if (c0906q.f11921O || !kotlin.jvm.internal.m.b(c0906q.I(), Integer.valueOf(i12))) {
                p134m1.b.t(i12, c0906q, i12, c0390h);
            }
            c0906q.q(true);
            if (c0906q.z()) {
                c0906q.T(-26502501);
                c0906q.q(false);
            } else {
                c0906q.T(-26580342);
                boolean zH = c0906q.h(j0Var);
                Object objI = c0906q.I();
                if (zH || objI == C0896l.f11886a) {
                    objI = new e0(j0Var, 0);
                    c0906q.d0(objI);
                }
                C0880d.i((Z8.a) objI, c0906q);
                c0906q.q(false);
            }
        }
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new f0(i10, 0, j0Var, rVar, eVar);
        }
    }

    public static final void d(p067g0.r rVar, Z8.e eVar, InterfaceC0898m interfaceC0898m, int i10, int i11) {
        int i12;
        C0906q c0906q = (C0906q) interfaceC0898m;
        c0906q.V(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0906q.f(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0906q.h(eVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c0906q.z()) {
            c0906q.N();
        } else {
            if (i13 != 0) {
                rVar = p067g0.o.f19964a;
            }
            Object objI = c0906q.I();
            if (objI == C0896l.f11886a) {
                objI = new j0(C0184j.f1806f);
                c0906q.d0(objI);
            }
            c((j0) objI, rVar, eVar, c0906q, (i12 << 3) & 1008);
        }
        C0908r0 c0908r0S = c0906q.s();
        if (c0908r0S != null) {
            c0908r0S.f11954d = new d0(rVar, eVar, i10, i11);
        }
    }

    public static final p133m0.d e(InterfaceC0195v interfaceC0195v) {
        InterfaceC0195v interfaceC0195vL = interfaceC0195v.L();
        return interfaceC0195vL != null ? interfaceC0195vL.t(interfaceC0195v, true) : new p133m0.d(0.0f, 0.0f, (int) (interfaceC0195v.v() >> 32), (int) (interfaceC0195v.v() & 4294967295L));
    }

    public static final p133m0.d f(InterfaceC0195v interfaceC0195v) {
        InterfaceC0195v interfaceC0195vG = g(interfaceC0195v);
        float fV = (int) (interfaceC0195vG.v() >> 32);
        float fV2 = (int) (interfaceC0195vG.v() & 4294967295L);
        p133m0.d dVarT = g(interfaceC0195v).t(interfaceC0195v, true);
        float f10 = dVarT.f22184a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fV) {
            f10 = fV;
        }
        float f11 = dVarT.f22185b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fV2) {
            f11 = fV2;
        }
        float f12 = dVarT.f22186c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fV) {
            fV = f12;
        }
        float f13 = dVarT.f22187d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fV2) {
            fV2 = f14;
        }
        if (f10 == fV || f11 == fV2) {
            return p133m0.d.f22183e;
        }
        long jG = interfaceC0195vG.g(D7.W.c(f10, f11));
        long jG2 = interfaceC0195vG.g(D7.W.c(fV, f11));
        long jG3 = interfaceC0195vG.g(D7.W.c(fV, fV2));
        long jG4 = interfaceC0195vG.g(D7.W.c(f10, fV2));
        float fD = p133m0.c.d(jG);
        float fD2 = p133m0.c.d(jG2);
        float fD3 = p133m0.c.d(jG4);
        float fD4 = p133m0.c.d(jG3);
        float fMin = Math.min(fD, Math.min(fD2, Math.min(fD3, fD4)));
        float fMax = Math.max(fD, Math.max(fD2, Math.max(fD3, fD4)));
        float fE = p133m0.c.e(jG);
        float fE2 = p133m0.c.e(jG2);
        float fE3 = p133m0.c.e(jG4);
        float fE4 = p133m0.c.e(jG3);
        return new p133m0.d(fMin, Math.min(fE, Math.min(fE2, Math.min(fE3, fE4))), fMax, Math.max(fE, Math.max(fE2, Math.max(fE3, fE4))));
    }

    public static final InterfaceC0195v g(InterfaceC0195v interfaceC0195v) {
        InterfaceC0195v interfaceC0195v2;
        InterfaceC0195v interfaceC0195vL = interfaceC0195v.L();
        while (true) {
            InterfaceC0195v interfaceC0195v3 = interfaceC0195vL;
            interfaceC0195v2 = interfaceC0195v;
            interfaceC0195v = interfaceC0195v3;
            if (interfaceC0195v == null) {
                break;
            }
            interfaceC0195vL = interfaceC0195v.L();
        }
        F0.h0 h0Var = interfaceC0195v2 instanceof F0.h0 ? (F0.h0) interfaceC0195v2 : null;
        if (h0Var == null) {
            return interfaceC0195v2;
        }
        F0.h0 h0Var2 = h0Var.f3789n;
        while (true) {
            F0.h0 h0Var3 = h0Var2;
            F0.h0 h0Var4 = h0Var;
            h0Var = h0Var3;
            if (h0Var == null) {
                return h0Var4;
            }
            h0Var2 = h0Var.f3789n;
        }
    }

    public static final F0.W h(F0.W w10) {
        F0.H h10 = w10.f3706l.f3787l;
        while (true) {
            F0.H hT = h10.t();
            F0.H h11 = null;
            if ((hT != null ? hT.f3589c : null) == null) {
                F0.W wM0 = ((F0.h0) h10.f3609y.f777d).M0();
                kotlin.jvm.internal.m.c(wM0);
                return wM0;
            }
            F0.H hT2 = h10.t();
            if (hT2 != null) {
                h11 = hT2.f3589c;
            }
            kotlin.jvm.internal.m.c(h11);
            F0.H hT3 = h10.t();
            kotlin.jvm.internal.m.c(hT3);
            h10 = hT3.f3589c;
            kotlin.jvm.internal.m.c(h10);
        }
    }

    public static final long i(long j10, long j11) {
        float fD = p133m0.f.d(j10);
        long j12 = c0.f1779a;
        if (j11 == j12) {
            p206t6.b.g0("ScaleFactor is unspecified");
            throw null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * fD;
        float fB = p133m0.f.b(j10);
        if (j11 != j12) {
            return S5.d.i(fIntBitsToFloat, Float.intBitsToFloat((int) (j11 & 4294967295L)) * fB);
        }
        p206t6.b.g0("ScaleFactor is unspecified");
        throw null;
    }
}
