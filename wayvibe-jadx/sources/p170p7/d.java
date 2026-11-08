package p170p7;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f25256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f25257b;

    public d(k kVar, j jVar) {
        if (kVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f25256a = kVar;
        if (jVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.f25257b = jVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int iCompareTo = this.f25256a.compareTo(dVar.f25256a);
        return iCompareTo != 0 ? iCompareTo : this.f25257b.compareTo(dVar.f25257b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f25256a.equals(dVar.f25256a) && this.f25257b.equals(dVar.f25257b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25256a.hashCode() ^ 1000003) * 1000003) ^ this.f25257b.hashCode();
    }

    public final String toString() {
        return "Segment{fieldPath=" + this.f25256a + ", kind=" + this.f25257b + "}";
    }
}
