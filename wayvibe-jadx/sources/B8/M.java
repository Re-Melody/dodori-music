package B8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f744e = new M(null, null, r0.f848e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.q f746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f748d;

    public M(A a10, J8.q qVar, r0 r0Var, boolean z10) {
        this.f745a = a10;
        this.f746b = qVar;
        p229v9.a.k(r0Var, "status");
        this.f747c = r0Var;
        this.f748d = z10;
    }

    public static M a(r0 r0Var) {
        p229v9.a.g("error status shouldn't be OK", !r0Var.e());
        return new M(null, null, r0Var, false);
    }

    public static M b(A a10, J8.q qVar) {
        p229v9.a.k(a10, "subchannel");
        return new M(a10, qVar, r0.f848e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return p228v8.c.d(this.f745a, m8.f745a) && p228v8.c.d(this.f747c, m8.f747c) && p228v8.c.d(this.f746b, m8.f746b) && this.f748d == m8.f748d;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f748d);
        return Arrays.hashCode(new Object[]{this.f745a, this.f747c, this.f746b, boolValueOf});
    }

    public final String toString() {
        U.P pF = p228v8.a.f(this);
        pF.c(this.f745a, "subchannel");
        pF.c(this.f746b, "streamTracerFactory");
        pF.c(this.f747c, "status");
        pF.d("drop", this.f748d);
        return pF.toString();
    }
}
