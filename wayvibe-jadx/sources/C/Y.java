package C;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f964b;

    public Y(u0 u0Var, int i10) {
        this.f963a = u0Var;
        this.f964b = i10;
    }

    @Override // C.u0
    public final int a(p028c1.b bVar) {
        if ((this.f964b & 32) != 0) {
            return this.f963a.a(bVar);
        }
        return 0;
    }

    @Override // C.u0
    public final int b(p028c1.b bVar, p028c1.k kVar) {
        if (((kVar == p028c1.k.Ltr ? 4 : 1) & this.f964b) != 0) {
            return this.f963a.b(bVar, kVar);
        }
        return 0;
    }

    @Override // C.u0
    public final int c(p028c1.b bVar) {
        if ((this.f964b & 16) != 0) {
            return this.f963a.c(bVar);
        }
        return 0;
    }

    @Override // C.u0
    public final int d(p028c1.b bVar, p028c1.k kVar) {
        if (((kVar == p028c1.k.Ltr ? 8 : 2) & this.f964b) != 0) {
            return this.f963a.d(bVar, kVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y6 = (Y) obj;
        if (kotlin.jvm.internal.m.b(this.f963a, y6.f963a)) {
            if (this.f964b == y6.f964b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f964b) + (this.f963a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f963a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i10 = this.f964b;
        int i11 = AbstractC0143c.f983d;
        if ((i10 & i11) == i11) {
            AbstractC0143c.h(sb3, "Start");
        }
        int i12 = AbstractC0143c.f985f;
        if ((i10 & i12) == i12) {
            AbstractC0143c.h(sb3, "Left");
        }
        if ((i10 & 16) == 16) {
            AbstractC0143c.h(sb3, "Top");
        }
        int i13 = AbstractC0143c.f984e;
        if ((i10 & i13) == i13) {
            AbstractC0143c.h(sb3, "End");
        }
        int i14 = AbstractC0143c.f986g;
        if ((i10 & i14) == i14) {
            AbstractC0143c.h(sb3, "Right");
        }
        if ((i10 & 32) == 32) {
            AbstractC0143c.h(sb3, "Bottom");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.m.e(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
