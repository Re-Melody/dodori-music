package K1;

import G0.T0;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f7311c;

    public j0() {
        this.f7311c = T0.e();
    }

    @Override // K1.n0
    public z0 b() {
        a();
        z0 z0VarG = z0.g(null, this.f7311c.build());
        z0VarG.f7354a.q(this.f7324b);
        return z0VarG;
    }

    @Override // K1.n0
    public void d(B1.c cVar) {
        this.f7311c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // K1.n0
    public void e(B1.c cVar) {
        this.f7311c.setStableInsets(cVar.d());
    }

    @Override // K1.n0
    public void f(B1.c cVar) {
        this.f7311c.setSystemGestureInsets(cVar.d());
    }

    @Override // K1.n0
    public void g(B1.c cVar) {
        this.f7311c.setSystemWindowInsets(cVar.d());
    }

    @Override // K1.n0
    public void h(B1.c cVar) {
        this.f7311c.setTappableElementInsets(cVar.d());
    }

    public j0(z0 z0Var) {
        WindowInsets.Builder builderE;
        super(z0Var);
        WindowInsets windowInsetsF = z0Var.f();
        if (windowInsetsF != null) {
            builderE = T0.f(windowInsetsF);
        } else {
            builderE = T0.e();
        }
        this.f7311c = builderE;
    }
}
