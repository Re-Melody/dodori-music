package p005a1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14099a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Ltr";
        }
        if (i10 == 2) {
            return "Rtl";
        }
        if (i10 == 3) {
            return "Content";
        }
        if (i10 == 4) {
            return "ContentOrLtr";
        }
        if (i10 == 5) {
            return "ContentOrRtl";
        }
        return i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f14099a == ((k) obj).f14099a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14099a);
    }

    public final String toString() {
        return a(this.f14099a);
    }
}
