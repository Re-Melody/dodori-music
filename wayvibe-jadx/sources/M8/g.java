package M8;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8410b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8411a = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g other = (g) obj;
        kotlin.jvm.internal.m.f(other, "other");
        return this.f8411a - other.f8411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.f8411a == gVar.f8411a;
    }

    public final int hashCode() {
        return this.f8411a;
    }

    public final String toString() {
        return "2.2.21";
    }
}
