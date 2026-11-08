package p260y9;

import B2.AbstractC0112b;
import N8.s;
import java.util.List;
import kotlin.jvm.internal.m;
import p240w9.f;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class V implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f29261b;

    public V(String str, f kind) {
        m.f(kind, "kind");
        this.f29260a = str;
        this.f29261b = kind;
    }

    @Override // p240w9.g
    public final String a() {
        return this.f29260a;
    }

    @Override // p240w9.g
    public final boolean c() {
        return false;
    }

    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p240w9.g
    public final l e() {
        return this.f29261b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        if (m.b(this.f29260a, v3.f29260a)) {
            if (m.b(this.f29261b, v3.f29261b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p240w9.g
    public final int f() {
        return 0;
    }

    @Override // p240w9.g
    public final String g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return s.f8650a;
    }

    @Override // p240w9.g
    public final List h(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f29261b.hashCode() * 31) + this.f29260a.hashCode();
    }

    @Override // p240w9.g
    public final g i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p240w9.g
    public final boolean isInline() {
        return false;
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("PrimitiveDescriptor("), this.f29260a, ')');
    }
}
