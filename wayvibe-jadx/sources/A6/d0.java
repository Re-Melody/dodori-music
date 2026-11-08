package A6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends V implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f362a;

    public d0(V v3) {
        this.f362a = v3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f362a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f362a.equals(((d0) obj).f362a);
        }
        return false;
    }

    @Override // A6.V
    public final V f() {
        return this.f362a;
    }

    public final int hashCode() {
        return -this.f362a.hashCode();
    }

    public final String toString() {
        return this.f362a + ".reverse()";
    }
}
