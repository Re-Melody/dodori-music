package K1;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsAnimation f7291d;

    public f0(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f7291d = windowInsetsAnimation;
    }

    @Override // K1.g0
    public final long a() {
        return this.f7291d.getDurationMillis();
    }

    @Override // K1.g0
    public final float b() {
        return this.f7291d.getInterpolatedFraction();
    }

    @Override // K1.g0
    public final void c(float f10) {
        this.f7291d.setFraction(f10);
    }
}
