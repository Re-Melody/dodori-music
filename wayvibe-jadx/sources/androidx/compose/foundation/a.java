package androidx.compose.foundation;

import B.m;
import K.F0;
import M0.g;
import p067g0.o;
import p067g0.r;
import p143n0.AbstractC2091s;
import p143n0.W;
import p143n0.c0;
import p241x.InterfaceC2296a0;
import p241x.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(r rVar, AbstractC2091s abstractC2091s, c0 c0Var) {
        return rVar.then(new BackgroundElement(0L, abstractC2091s, c0Var, 1));
    }

    public static /* synthetic */ r b(r rVar, AbstractC2091s abstractC2091s, c0 c0Var, int i10) {
        if ((i10 & 2) != 0) {
            c0Var = W.f22719a;
        }
        return a(rVar, abstractC2091s, c0Var);
    }

    public static final r c(r rVar, long j10, c0 c0Var) {
        return rVar.then(new BackgroundElement(j10, null, c0Var, 2));
    }

    public static final r d(r rVar, m mVar, InterfaceC2296a0 interfaceC2296a0, boolean z10, String str, g gVar, Z8.a aVar) {
        r rVarThen;
        if (interfaceC2296a0 instanceof f0) {
            rVarThen = new ClickableElement(mVar, (f0) interfaceC2296a0, z10, str, gVar, aVar);
        } else if (interfaceC2296a0 == null) {
            rVarThen = new ClickableElement(mVar, null, z10, str, gVar, aVar);
        } else {
            o oVar = o.f19964a;
            rVarThen = mVar != null ? d.a(oVar, mVar, interfaceC2296a0).then(new ClickableElement(mVar, null, z10, str, gVar, aVar)) : p067g0.a.a(oVar, new b(interfaceC2296a0, z10, str, gVar, aVar));
        }
        return rVar.then(rVarThen);
    }

    public static /* synthetic */ r e(r rVar, m mVar, InterfaceC2296a0 interfaceC2296a0, boolean z10, g gVar, Z8.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return d(rVar, mVar, interfaceC2296a0, z11, null, gVar, aVar);
    }

    public static r f(r rVar, boolean z10, String str, Z8.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return p067g0.a.a(rVar, new F0(aVar, str, z10));
    }

    public static r g(r rVar, m mVar, Z8.a aVar) {
        return rVar.then(new CombinedClickableElement(mVar, aVar));
    }

    public static r h(r rVar, m mVar) {
        return rVar.then(new HoverableElement(mVar));
    }
}
