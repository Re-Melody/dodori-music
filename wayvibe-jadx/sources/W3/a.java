package W3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12780b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12781c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12782d = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12783a;

    public a(int i10) {
        this.f12783a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f12783a == ((a) obj).f12783a;
    }

    public final int hashCode() {
        return this.f12783a;
    }

    public final String toString() {
        String str;
        if (equals(f12780b)) {
            str = "COMPACT";
        } else if (equals(f12781c)) {
            str = "MEDIUM";
        } else {
            str = equals(f12782d) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowHeightSizeClass: ".concat(str);
    }
}
