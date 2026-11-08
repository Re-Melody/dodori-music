package M;

import F0.InterfaceC0393k;
import F0.InterfaceC0394l;
import F0.InterfaceC0398p;
import F0.h0;
import K.C0559d0;
import O.P;
import U.C0880d;
import U.C0891i0;
import U.U;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p067g0.q implements InterfaceC0393k, InterfaceC0398p, InterfaceC0394l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f7975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0559d0 f7976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P f7977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0891i0 f7978d = C0880d.K(null, U.f11815f);

    public u(f fVar, C0559d0 c0559d0, P p10) {
        this.f7975a = fVar;
        this.f7976b = c0559d0;
        this.f7977c = p10;
    }

    @Override // F0.InterfaceC0398p
    public final void e0(h0 h0Var) {
        this.f7978d.setValue(h0Var);
    }

    @Override // p067g0.q
    public final void onAttach() {
        f fVar = this.f7975a;
        if (fVar.f7953a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        fVar.f7953a = this;
    }

    @Override // p067g0.q
    public final void onDetach() {
        this.f7975a.k(this);
    }
}
