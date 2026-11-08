package K1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f7353b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f7354a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f7353b = u0.f7344s;
        } else if (i10 >= 30) {
            f7353b = s0.r;
        } else {
            f7353b = v0.f7348b;
        }
    }

    public z0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f7354a = new u0(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f7354a = new t0(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f7354a = new s0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f7354a = new r0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f7354a = new q0(this, windowInsets);
        } else {
            this.f7354a = new p0(this, windowInsets);
        }
    }

    public static B1.c e(B1.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f532a - i10);
        int iMax2 = Math.max(0, cVar.f533b - i11);
        int iMax3 = Math.max(0, cVar.f534c - i12);
        int iMax4 = Math.max(0, cVar.f535d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : B1.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static z0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        z0 z0Var = new z0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = T.f7251a;
            z0 z0VarA = L.a(view);
            v0 v0Var = z0Var.f7354a;
            v0Var.r(z0VarA);
            v0Var.d(view.getRootView());
            v0Var.t(view.getWindowSystemUiVisibility());
        }
        return z0Var;
    }

    public final int a() {
        return this.f7354a.k().f535d;
    }

    public final int b() {
        return this.f7354a.k().f532a;
    }

    public final int c() {
        return this.f7354a.k().f534c;
    }

    public final int d() {
        return this.f7354a.k().f533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        return Objects.equals(this.f7354a, ((z0) obj).f7354a);
    }

    public final WindowInsets f() {
        v0 v0Var = this.f7354a;
        if (v0Var instanceof o0) {
            return ((o0) v0Var).f7329c;
        }
        return null;
    }

    public final int hashCode() {
        v0 v0Var = this.f7354a;
        if (v0Var == null) {
            return 0;
        }
        return v0Var.hashCode();
    }

    public z0() {
        this.f7354a = new v0(this);
    }
}
