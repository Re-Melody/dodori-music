package F;

import U.C0880d;
import U.C0885f0;
import U.C0891i0;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f3457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0885f0 f3458c = C0880d.J(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0885f0 f3459d = C0880d.J(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891i0 f3460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0891i0 f3461f;

    public G(Object obj, H h10) {
        this.f3456a = obj;
        this.f3457b = h10;
        U.U u10 = U.U.f11815f;
        this.f3460e = C0880d.K(null, u10);
        this.f3461f = C0880d.K(null, u10);
    }

    public final G a() {
        C0885f0 c0885f0 = this.f3459d;
        if (c0885f0.m() == 0) {
            this.f3457b.f3462a.add(this);
            G g3 = (G) this.f3461f.getValue();
            if (g3 != null) {
                g3.a();
            } else {
                g3 = null;
            }
            this.f3460e.setValue(g3);
        }
        c0885f0.r(c0885f0.m() + 1);
        return this;
    }

    public final void b() {
        C0885f0 c0885f0 = this.f3459d;
        if (c0885f0.m() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0885f0.r(c0885f0.m() - 1);
        if (c0885f0.m() == 0) {
            this.f3457b.f3462a.remove(this);
            C0891i0 c0891i0 = this.f3460e;
            G g3 = (G) c0891i0.getValue();
            if (g3 != null) {
                g3.b();
            }
            c0891i0.setValue(null);
        }
    }
}
