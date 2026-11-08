package p241x;

import android.widget.Magnifier;
import p025b9.a;
import p133m0.c;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f28300a;

    public u0(Magnifier magnifier) {
        this.f28300a = magnifier;
    }

    @Override // p241x.s0
    public void a(long j10, long j11) {
        this.f28300a.show(c.d(j10), c.e(j10));
    }

    public final void b() {
        this.f28300a.dismiss();
    }

    public final long c() {
        return a.f(this.f28300a.getWidth(), this.f28300a.getHeight());
    }

    public final void d() {
        this.f28300a.update();
    }
}
