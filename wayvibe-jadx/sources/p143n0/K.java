package p143n0;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22710a;

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            return this.f22710a == ((K) obj).f22710a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22710a);
    }

    public final String toString() {
        int i10 = this.f22710a;
        if (i10 == 0) {
            return "Argb8888";
        }
        if (i10 == 1) {
            return "Alpha8";
        }
        if (i10 == 2) {
            return "Rgb565";
        }
        if (i10 == 3) {
            return "F16";
        }
        return i10 == 4 ? "Gpu" : "Unknown";
    }
}
