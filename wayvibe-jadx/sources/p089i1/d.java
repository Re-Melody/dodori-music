package p089i1;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20433c;

    public d(Object obj, int i10, b bVar) {
        this.f20431a = obj;
        this.f20432b = i10;
        this.f20433c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20431a.equals(dVar.f20431a) && this.f20432b == dVar.f20432b && this.f20433c.equals(dVar.f20433c);
    }

    public final int hashCode() {
        return this.f20433c.hashCode() + b.c(this.f20432b, this.f20431a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.f20431a + ", index=" + this.f20432b + ", reference=" + this.f20433c + ')';
    }
}
