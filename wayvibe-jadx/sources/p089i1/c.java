package p089i1;

import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f20430c;

    public c(Object obj, int i10, l lVar) {
        this.f20428a = obj;
        this.f20429b = i10;
        this.f20430c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f20428a.equals(cVar.f20428a) && this.f20429b == cVar.f20429b && this.f20430c.equals(cVar.f20430c);
    }

    public final int hashCode() {
        return this.f20430c.hashCode() + b.c(this.f20429b, this.f20428a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.f20428a + ", index=" + this.f20429b + ", reference=" + this.f20430c + ')';
    }
}
