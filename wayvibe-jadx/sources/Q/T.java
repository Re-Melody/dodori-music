package Q;

import F0.AbstractC0388f;
import F0.AbstractC0395m;
import F0.InterfaceC0393k;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0395m implements InterfaceC0393k, F0.l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B.l f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q f9969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P.w f9970g;

    public T(B.l lVar, boolean z10, float f10, Q q5) {
        this.f9966c = lVar;
        this.f9967d = z10;
        this.f9968e = f10;
        this.f9969f = q5;
    }

    @Override // F0.l0
    public final void U() {
        AbstractC0388f.o(this, new S(this, 1));
    }

    @Override // p067g0.q
    public final void onAttach() {
        AbstractC0388f.o(this, new S(this, 1));
    }
}
