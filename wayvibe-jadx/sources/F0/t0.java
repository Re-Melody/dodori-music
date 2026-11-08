package F0;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D0.N f3841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f3842b;

    public t0(D0.N n6, V v3) {
        this.f3841a = n6;
        this.f3842b = v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.b(this.f3841a, t0Var.f3841a) && kotlin.jvm.internal.m.b(this.f3842b, t0Var.f3842b);
    }

    public final int hashCode() {
        return this.f3842b.hashCode() + (this.f3841a.hashCode() * 31);
    }

    @Override // F0.q0
    public final boolean m() {
        return this.f3842b.u0().q();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f3841a + ", placeable=" + this.f3842b + ')';
    }
}
