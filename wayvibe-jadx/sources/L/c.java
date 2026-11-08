package L;

import D0.L;
import D0.N;
import D0.O;
import D0.X;
import D7.W;
import F0.AbstractC0395m;
import F0.InterfaceC0406y;
import F0.u0;
import N8.t;
import p122l0.InterfaceC2047d;
import p122l0.w;
import p262z0.G;
import p262z0.i;
import p262z0.j;
import p262z0.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0395m implements InterfaceC0406y, u0, InterfaceC2047d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z8.a f7421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f7423e;

    public c(Z8.a aVar) {
        this.f7421c = aVar;
        b bVar = new b(this, null);
        i iVar = z.f29799a;
        G g3 = new G(null, null, bVar);
        o0(g3);
        this.f7423e = g3;
    }

    @Override // F0.u0
    public final void L(i iVar, j jVar, long j10) {
        this.f7423e.L(iVar, jVar, j10);
    }

    @Override // F0.InterfaceC0406y
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final N mo2measure3p2s80s(O o10, L l10, long j10) {
        int iY = o10.Y(androidx.compose.foundation.text.handwriting.a.f14763a);
        int iY2 = o10.Y(androidx.compose.foundation.text.handwriting.a.f14764b);
        int i10 = iY2 * 2;
        int i11 = iY * 2;
        X xE = l10.E(W.X(j10, i10, i11));
        int i12 = xE.f1763b - i11;
        return o10.S(xE.f1762a - i10, i12, t.f8651a, new C.O(xE, iY2, iY, 1));
    }

    @Override // p122l0.InterfaceC2047d
    public final void n(w wVar) {
        this.f7422d = wVar.g();
    }

    @Override // F0.u0
    public final void s() {
        this.f7423e.s();
    }
}
