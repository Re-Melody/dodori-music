package p260y9;

import N8.s;
import java.util.List;
import kotlin.jvm.internal.m;
import p097i9.r;
import p134m1.b;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f29233a;

    public H(g gVar) {
        this.f29233a = gVar;
    }

    @Override // p240w9.g
    public final boolean c() {
        return false;
    }

    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        Integer numK0 = r.k0(name);
        if (numK0 != null) {
            return numK0.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // p240w9.g
    public final l e() {
        return p240w9.m.f28085c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return m.b(this.f29233a, h10.f29233a) && m.b(a(), h10.a());
    }

    @Override // p240w9.g
    public final int f() {
        return 1;
    }

    @Override // p240w9.g
    public final String g(int i10) {
        return String.valueOf(i10);
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return s.f8650a;
    }

    @Override // p240w9.g
    public final List h(int i10) {
        if (i10 >= 0) {
            return s.f8650a;
        }
        StringBuilder sbP = b.p(i10, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f29233a.hashCode() * 31);
    }

    @Override // p240w9.g
    public final g i(int i10) {
        if (i10 >= 0) {
            return this.f29233a;
        }
        StringBuilder sbP = b.p(i10, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    @Override // p240w9.g
    public final boolean isInline() {
        return false;
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbP = b.p(i10, "Illegal index ", ", ");
        sbP.append(a());
        sbP.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbP.toString().toString());
    }

    public final String toString() {
        return a() + '(' + this.f29233a + ')';
    }
}
