package V0;

import O0.C0678g;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0678g f12402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f12403b;

    public E(C0678g c0678g, s sVar) {
        this.f12402a = c0678g;
        this.f12403b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e2 = (E) obj;
        return kotlin.jvm.internal.m.b(this.f12402a, e2.f12402a) && kotlin.jvm.internal.m.b(this.f12403b, e2.f12403b);
    }

    public final int hashCode() {
        return this.f12403b.hashCode() + (this.f12402a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f12402a) + ", offsetMapping=" + this.f12403b + ')';
    }
}
