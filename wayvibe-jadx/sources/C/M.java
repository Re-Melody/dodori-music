package C;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p067g0.q implements F0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p067g0.g f937a;

    @Override // F0.s0
    public final Object F(p028c1.b bVar, Object obj) {
        j0 j0Var = obj instanceof j0 ? (j0) obj : null;
        if (j0Var == null) {
            j0Var = new j0();
        }
        j0Var.f1018c = new F(this.f937a);
        return j0Var;
    }
}
