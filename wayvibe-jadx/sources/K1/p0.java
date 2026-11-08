package K1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends o0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B1.c f7335n;

    public p0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f7335n = null;
    }

    @Override // K1.v0
    public z0 b() {
        return z0.g(null, this.f7329c.consumeStableInsets());
    }

    @Override // K1.v0
    public z0 c() {
        return z0.g(null, this.f7329c.consumeSystemWindowInsets());
    }

    @Override // K1.v0
    public final B1.c i() {
        if (this.f7335n == null) {
            WindowInsets windowInsets = this.f7329c;
            this.f7335n = B1.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f7335n;
    }

    @Override // K1.v0
    public boolean n() {
        return this.f7329c.isConsumed();
    }

    @Override // K1.v0
    public void s(B1.c cVar) {
        this.f7335n = cVar;
    }
}
