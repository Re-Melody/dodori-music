package W3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f12786b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f12787c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f12788d = new c(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12789a;

    public c(int i10) {
        this.f12789a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.f12789a == ((c) obj).f12789a;
    }

    public final int hashCode() {
        return this.f12789a;
    }

    public final String toString() {
        String str;
        if (equals(f12786b)) {
            str = "COMPACT";
        } else if (equals(f12787c)) {
            str = "MEDIUM";
        } else {
            str = equals(f12788d) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowWidthSizeClass: ".concat(str);
    }
}
