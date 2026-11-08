package K1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Interpolator f7301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7302c;

    public g0(Interpolator interpolator, long j10) {
        this.f7301b = interpolator;
        this.f7302c = j10;
    }

    public long a() {
        return this.f7302c;
    }

    public float b() {
        Interpolator interpolator = this.f7301b;
        return interpolator != null ? interpolator.getInterpolation(this.f7300a) : this.f7300a;
    }

    public void c(float f10) {
        this.f7300a = f10;
    }
}
