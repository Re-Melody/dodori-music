package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1108c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f15548b;

    public C1108c(int i10, Method method) {
        this.f15547a = i10;
        this.f15548b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1108c)) {
            return false;
        }
        C1108c c1108c = (C1108c) obj;
        return this.f15547a == c1108c.f15547a && this.f15548b.getName().equals(c1108c.f15548b.getName());
    }

    public final int hashCode() {
        return this.f15548b.getName().hashCode() + (this.f15547a * 31);
    }
}
