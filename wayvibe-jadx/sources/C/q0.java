package C;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f1058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f1059b;

    public q0(u0 u0Var, u0 u0Var2) {
        this.f1058a = u0Var;
        this.f1059b = u0Var2;
    }

    @Override // C.u0
    public final int a(p028c1.b bVar) {
        return Math.max(this.f1058a.a(bVar), this.f1059b.a(bVar));
    }

    @Override // C.u0
    public final int b(p028c1.b bVar, p028c1.k kVar) {
        return Math.max(this.f1058a.b(bVar, kVar), this.f1059b.b(bVar, kVar));
    }

    @Override // C.u0
    public final int c(p028c1.b bVar) {
        return Math.max(this.f1058a.c(bVar), this.f1059b.c(bVar));
    }

    @Override // C.u0
    public final int d(p028c1.b bVar, p028c1.k kVar) {
        return Math.max(this.f1058a.d(bVar, kVar), this.f1059b.d(bVar, kVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.b(q0Var.f1058a, this.f1058a) && kotlin.jvm.internal.m.b(q0Var.f1059b, this.f1059b);
    }

    public final int hashCode() {
        return (this.f1059b.hashCode() * 31) + this.f1058a.hashCode();
    }

    public final String toString() {
        return "(" + this.f1058a + " ∪ " + this.f1059b + ')';
    }
}
