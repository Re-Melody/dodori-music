package T0;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11446a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "Normal";
        }
        return i10 == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return this.f11446a == ((C) obj).f11446a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11446a);
    }

    public final String toString() {
        return a(this.f11446a);
    }
}
