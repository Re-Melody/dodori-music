package p179q7;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f25683b;

    public d(int i10, h hVar) {
        this.f25682a = i10;
        this.f25683b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f25682a == dVar.f25682a && this.f25683b.equals(dVar.f25683b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f25682a ^ 1000003) * 1000003) ^ this.f25683b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f25682a + ", mutation=" + this.f25683b + "}";
    }
}
