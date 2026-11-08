package C;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends p067g0.q implements F0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p067g0.h f1079a;

    @Override // F0.s0
    public final Object F(p028c1.b bVar, Object obj) {
        j0 j0Var = obj instanceof j0 ? (j0) obj : null;
        if (j0Var == null) {
            j0Var = new j0();
        }
        j0Var.f1018c = new G(this.f1079a);
        return j0Var;
    }
}
