package C;

/* JADX INFO: loaded from: classes.dex */
public final class J implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f934b;

    public J(u0 u0Var, u0 u0Var2) {
        this.f933a = u0Var;
        this.f934b = u0Var2;
    }

    @Override // C.u0
    public final int a(p028c1.b bVar) {
        int iA = this.f933a.a(bVar) - this.f934b.a(bVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // C.u0
    public final int b(p028c1.b bVar, p028c1.k kVar) {
        int iB = this.f933a.b(bVar, kVar) - this.f934b.b(bVar, kVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // C.u0
    public final int c(p028c1.b bVar) {
        int iC = this.f933a.c(bVar) - this.f934b.c(bVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // C.u0
    public final int d(p028c1.b bVar, p028c1.k kVar) {
        int iD = this.f933a.d(bVar, kVar) - this.f934b.d(bVar, kVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return kotlin.jvm.internal.m.b(j10.f933a, this.f933a) && kotlin.jvm.internal.m.b(j10.f934b, this.f934b);
    }

    public final int hashCode() {
        return this.f934b.hashCode() + (this.f933a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f933a + " - " + this.f934b + ')';
    }
}
