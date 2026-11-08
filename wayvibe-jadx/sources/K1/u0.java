package K1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends t0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z0 f7344s = z0.g(null, WindowInsets.CONSUMED);

    public u0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // K1.s0, K1.o0, K1.v0
    public B1.c f(int i10) {
        return B1.c.c(this.f7329c.getInsets(y0.a(i10)));
    }

    @Override // K1.s0, K1.o0, K1.v0
    public B1.c g(int i10) {
        return B1.c.c(this.f7329c.getInsetsIgnoringVisibility(y0.a(i10)));
    }

    @Override // K1.s0, K1.o0, K1.v0
    public boolean p(int i10) {
        return this.f7329c.isVisible(y0.a(i10));
    }
}
