package K1;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f7304a;

    public h0(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7304a = new f0(B2.p.k(i10, interpolator, j10));
        } else {
            this.f7304a = new C0602d0(interpolator, j10);
        }
    }
}
