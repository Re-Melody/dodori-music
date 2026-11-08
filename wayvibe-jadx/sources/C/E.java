package C;

/* JADX INFO: loaded from: classes.dex */
public final class E implements E0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z8.c f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f927b;

    public E(Z8.c cVar) {
        this.f926a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && ((E) obj).f926a == this.f926a;
    }

    @Override // E0.c
    public final void g(E0.g gVar) {
        u0 u0Var = (u0) gVar.b(A0.f914a);
        if (kotlin.jvm.internal.m.b(u0Var, this.f927b)) {
            return;
        }
        this.f927b = u0Var;
        this.f926a.invoke(u0Var);
    }

    public final int hashCode() {
        return this.f926a.hashCode();
    }
}
