package p260y9;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class X implements g, InterfaceC2374j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f29263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f29265c;

    public X(g original) {
        m.f(original, "original");
        this.f29263a = original;
        this.f29264b = original.a() + '?';
        this.f29265c = O.b(original);
    }

    @Override // p240w9.g
    public final String a() {
        return this.f29264b;
    }

    @Override // p260y9.InterfaceC2374j
    public final Set b() {
        return this.f29265c;
    }

    @Override // p240w9.g
    public final boolean c() {
        return true;
    }

    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        return this.f29263a.d(name);
    }

    @Override // p240w9.g
    public final l e() {
        return this.f29263a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X) {
            return m.b(this.f29263a, ((X) obj).f29263a);
        }
        return false;
    }

    @Override // p240w9.g
    public final int f() {
        return this.f29263a.f();
    }

    @Override // p240w9.g
    public final String g(int i10) {
        return this.f29263a.g(i10);
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return this.f29263a.getAnnotations();
    }

    @Override // p240w9.g
    public final List h(int i10) {
        return this.f29263a.h(i10);
    }

    public final int hashCode() {
        return this.f29263a.hashCode() * 31;
    }

    @Override // p240w9.g
    public final g i(int i10) {
        return this.f29263a.i(i10);
    }

    @Override // p240w9.g
    public final boolean isInline() {
        return this.f29263a.isInline();
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        return this.f29263a.j(i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29263a);
        sb.append('?');
        return sb.toString();
    }
}
