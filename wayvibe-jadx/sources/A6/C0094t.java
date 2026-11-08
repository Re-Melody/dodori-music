package A6;

import java.io.Serializable;

/* JADX INFO: renamed from: A6.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094t extends V implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.d f398a;

    public C0094t(E3.d dVar) {
        this.f398a = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f398a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0094t) {
            return this.f398a.equals(((C0094t) obj).f398a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f398a.hashCode();
    }

    public final String toString() {
        return this.f398a.toString();
    }
}
