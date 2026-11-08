package Z3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13640a;

    public l(List list) {
        this.f13640a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return this.f13640a.equals(((l) obj).f13640a);
    }

    public final int hashCode() {
        return this.f13640a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return N8.n.H0(this.f13640a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
