package p122l0;

import p067g0.q;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f21918a;

    @Override // p067g0.q
    public final void onAttach() {
        super.onAttach();
        this.f21918a.f21917a.b(this);
    }

    @Override // p067g0.q
    public final void onDetach() {
        this.f21918a.f21917a.n(this);
        super.onDetach();
    }
}
