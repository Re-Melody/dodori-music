package D8;

import B8.AbstractC0120g;
import B8.C0114a;

/* JADX INFO: loaded from: classes2.dex */
public final class j2 extends AbstractC0120g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0114a f2668g = new C0114a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0120g f2669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0293m f2670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B8.x0 f2671f;

    public j2(C0261b0 c0261b0, C0293m c0293m, B8.x0 x0Var) {
        this.f2669d = c0261b0;
        this.f2670e = c0293m;
        this.f2671f = x0Var;
    }

    @Override // B8.AbstractC0120g
    public String k() {
        return this.f2669d.k();
    }

    @Override // B8.AbstractC0120g
    public final void p() {
        this.f2669d.p();
    }

    @Override // B8.AbstractC0120g
    public final void r() {
        this.f2669d.r();
        C0293m c0293m = this.f2670e;
        B8.x0 x0Var = c0293m.f2705b;
        x0Var.d();
        x0Var.execute(new RunnableC0290l(c0293m, 0));
    }

    @Override // B8.AbstractC0120g
    public final void s(B8.A a10) {
        this.f2669d.s(new i2(this, a10));
    }

    public final String toString() {
        U.P pF = p228v8.a.f(this);
        pF.c(this.f2669d, "delegate");
        return pF.toString();
    }
}
