package K1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f7348b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f7349a;

    static {
        n0 j0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            j0Var = new m0();
        } else if (i10 >= 31) {
            j0Var = new l0();
        } else if (i10 >= 30) {
            j0Var = new k0();
        } else {
            j0Var = i10 >= 29 ? new j0() : new i0();
        }
        f7348b = j0Var.b().f7354a.a().f7354a.b().f7354a.c();
    }

    public v0(z0 z0Var) {
        this.f7349a = z0Var;
    }

    public z0 a() {
        return this.f7349a;
    }

    public z0 b() {
        return this.f7349a;
    }

    public z0 c() {
        return this.f7349a;
    }

    public C0606h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return o() == v0Var.o() && n() == v0Var.n() && Objects.equals(k(), v0Var.k()) && Objects.equals(i(), v0Var.i()) && Objects.equals(e(), v0Var.e());
    }

    public B1.c f(int i10) {
        return B1.c.f531e;
    }

    public B1.c g(int i10) {
        if ((i10 & 8) == 0) {
            return B1.c.f531e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public B1.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public B1.c i() {
        return B1.c.f531e;
    }

    public B1.c j() {
        return k();
    }

    public B1.c k() {
        return B1.c.f531e;
    }

    public B1.c l() {
        return k();
    }

    public z0 m(int i10, int i11, int i12, int i13) {
        return f7348b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(B1.c[] cVarArr) {
    }

    public void r(z0 z0Var) {
    }

    public void s(B1.c cVar) {
    }

    public void t(int i10) {
    }
}
