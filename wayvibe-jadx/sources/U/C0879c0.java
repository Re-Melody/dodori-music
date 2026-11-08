package U;

import B2.AbstractC0112b;

/* JADX INFO: renamed from: U.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11846a;

    public C0879c0(String str) {
        this.f11846a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0879c0) && kotlin.jvm.internal.m.b(this.f11846a, ((C0879c0) obj).f11846a);
    }

    public final int hashCode() {
        return this.f11846a.hashCode();
    }

    public final String toString() {
        return AbstractC0112b.j(new StringBuilder("OpaqueKey(key="), this.f11846a, ')');
    }
}
