package M0;

import F0.x0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p067g0.q implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z8.c f8016c;

    public c(boolean z10, boolean z11, Z8.c cVar) {
        this.f8014a = z10;
        this.f8015b = z11;
        this.f8016c = cVar;
    }

    @Override // F0.x0
    public final void A(v vVar) {
        this.f8016c.invoke(vVar);
    }

    @Override // F0.x0
    public final boolean l0() {
        return this.f8014a;
    }

    @Override // F0.x0
    public final boolean t() {
        return this.f8015b;
    }
}
