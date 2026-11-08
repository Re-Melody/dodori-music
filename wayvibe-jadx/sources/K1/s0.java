package K1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends r0 {
    public static final z0 r = z0.g(null, WindowInsets.CONSUMED);

    public s0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
    }

    @Override // K1.o0, K1.v0
    public B1.c f(int i10) {
        return B1.c.c(this.f7329c.getInsets(x0.a(i10)));
    }

    @Override // K1.o0, K1.v0
    public B1.c g(int i10) {
        return B1.c.c(this.f7329c.getInsetsIgnoringVisibility(x0.a(i10)));
    }

    @Override // K1.o0, K1.v0
    public boolean p(int i10) {
        return this.f7329c.isVisible(x0.a(i10));
    }

    @Override // K1.o0, K1.v0
    public final void d(View view) {
    }
}
