package p069g2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20057a;

    public d(String name) {
        m.f(name, "name");
        this.f20057a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return m.b(this.f20057a, ((d) obj).f20057a);
    }

    public final int hashCode() {
        return this.f20057a.hashCode();
    }

    public final String toString() {
        return this.f20057a;
    }
}
