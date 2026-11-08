package p241x;

import M8.D;
import R8.a;
import U.C0914u0;
import p119k9.F;
import p261z.C2397d0;
import p261z.L0;
import p261z.Q;
import p261z.b1;
import p262z0.u;

/* JADX INFO: renamed from: x.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2322z extends AbstractC2307j {
    @Override // p241x.AbstractC2307j
    public final Object s0(u uVar, C2306i c2306i) throws Throwable {
        C2321y c2321y = new C2321y(this, null, 0);
        C0914u0 c0914u0 = new C0914u0(this, 16);
        Q q5 = b1.f29550a;
        Object objH = F.h(new L0(uVar, c2321y, c0914u0, new C2397d0(uVar), null), c2306i);
        a aVar = a.COROUTINE_SUSPENDED;
        D d10 = D.f8402a;
        if (objH != aVar) {
            objH = d10;
        }
        return objH == aVar ? objH : d10;
    }
}
