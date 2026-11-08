package K1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends q0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public B1.c f7341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public B1.c f7342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B1.c f7343q;

    public r0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f7341o = null;
        this.f7342p = null;
        this.f7343q = null;
    }

    @Override // K1.v0
    public B1.c h() {
        if (this.f7342p == null) {
            this.f7342p = B1.c.c(this.f7329c.getMandatorySystemGestureInsets());
        }
        return this.f7342p;
    }

    @Override // K1.v0
    public B1.c j() {
        if (this.f7341o == null) {
            this.f7341o = B1.c.c(this.f7329c.getSystemGestureInsets());
        }
        return this.f7341o;
    }

    @Override // K1.v0
    public B1.c l() {
        if (this.f7343q == null) {
            this.f7343q = B1.c.c(this.f7329c.getTappableElementInsets());
        }
        return this.f7343q;
    }

    @Override // K1.o0, K1.v0
    public z0 m(int i10, int i11, int i12, int i13) {
        return z0.g(null, this.f7329c.inset(i10, i11, i12, i13));
    }

    @Override // K1.p0, K1.v0
    public void s(B1.c cVar) {
    }
}
