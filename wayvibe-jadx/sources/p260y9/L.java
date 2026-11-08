package p260y9;

import N8.s;
import java.util.List;
import kotlin.jvm.internal.m;
import p240w9.g;
import p240w9.l;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f29239a = new L();

    @Override // p240w9.g
    public final String a() {
        return "kotlin.Nothing";
    }

    @Override // p240w9.g
    public final boolean c() {
        return false;
    }

    @Override // p240w9.g
    public final int d(String name) {
        m.f(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p240w9.g
    public final l e() {
        return p240w9.m.f28087e;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p240w9.g
    public final int f() {
        return 0;
    }

    @Override // p240w9.g
    public final String g(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p240w9.g
    public final List getAnnotations() {
        return s.f8650a;
    }

    @Override // p240w9.g
    public final List h(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (p240w9.m.f28087e.hashCode() * 31) - 1818355776;
    }

    @Override // p240w9.g
    public final g i(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p240w9.g
    public final boolean isInline() {
        return false;
    }

    @Override // p240w9.g
    public final boolean j(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
