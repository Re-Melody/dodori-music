package p231w0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27824a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f27824a == ((a) obj).f27824a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27824a);
    }

    public final String toString() {
        int i10 = this.f27824a;
        if (i10 == 1) {
            return "Touch";
        }
        return i10 == 2 ? "Keyboard" : "Error";
    }
}
