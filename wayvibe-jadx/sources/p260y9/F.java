package p260y9;

import N8.s;
import java.util.List;
import kotlin.jvm.internal.m;
import p097i9.r;
import p134m1.b;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f29228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f29229c;

    public F(String str, g gVar, g gVar2) {
        this.f29227a = str;
        this.f29228b = gVar;
        this.f29229c = gVar2;
    }

    @Override // p240w9.g
    public final String a() {
        return this.f29227a;
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
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // p240w9.g
    public final l e() {
        return p240w9.m.f28086d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return m.b(this.f29227a, f10.f29227a) && m.b(this.f29228b, f10.f29228b) && m.b(this.f29229c, f10.f29229c);
    }

    @Override // p240w9.g
    public final int f() {
        return 2;
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
        throw new IllegalArgumentException(b.m(b.p(i10, "Illegal index ", ", "), this.f29227a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f29229c.hashCode() + ((this.f29228b.hashCode() + (this.f29227a.hashCode() * 31)) * 31);
    }

    @Override // p240w9.g
    public final g i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.m(b.p(i10, "Illegal index ", ", "), this.f29227a, " expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f29228b;
        }
        if (i11 == 1) {
            return this.f29229c;
        }
        throw new IllegalStateException("Unreached");
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
        throw new IllegalArgumentException(b.m(b.p(i10, "Illegal index ", ", "), this.f29227a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f29227a + '(' + this.f29228b + ", " + this.f29229c + ')';
    }
}
