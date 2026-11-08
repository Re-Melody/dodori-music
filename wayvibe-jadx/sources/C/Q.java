package C;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028c1.b f952b;

    public Q(u0 u0Var, p028c1.b bVar) {
        this.f951a = u0Var;
        this.f952b = bVar;
    }

    @Override // C.f0
    public final float a() {
        u0 u0Var = this.f951a;
        p028c1.b bVar = this.f952b;
        return bVar.z(u0Var.a(bVar));
    }

    @Override // C.f0
    public final float b(p028c1.k kVar) {
        u0 u0Var = this.f951a;
        p028c1.b bVar = this.f952b;
        return bVar.z(u0Var.d(bVar, kVar));
    }

    @Override // C.f0
    public final float c(p028c1.k kVar) {
        u0 u0Var = this.f951a;
        p028c1.b bVar = this.f952b;
        return bVar.z(u0Var.b(bVar, kVar));
    }

    @Override // C.f0
    public final float d() {
        u0 u0Var = this.f951a;
        p028c1.b bVar = this.f952b;
        return bVar.z(u0Var.c(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q5 = (Q) obj;
        return kotlin.jvm.internal.m.b(this.f951a, q5.f951a) && kotlin.jvm.internal.m.b(this.f952b, q5.f952b);
    }

    public final int hashCode() {
        return this.f952b.hashCode() + (this.f951a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f951a + ", density=" + this.f952b + ')';
    }
}
