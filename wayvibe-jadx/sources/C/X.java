package C;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p067g0.q implements F0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f962b;

    @Override // F0.s0
    public final Object F(p028c1.b bVar, Object obj) {
        j0 j0Var = obj instanceof j0 ? (j0) obj : null;
        if (j0Var == null) {
            j0Var = new j0();
        }
        j0Var.f1016a = this.f961a;
        j0Var.f1017b = this.f962b;
        return j0Var;
    }
}
