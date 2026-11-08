package p122l0;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2046c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21885a;

    public static String a(int i10) {
        if (i10 == 1) {
            return "Next";
        }
        if (i10 == 2) {
            return "Previous";
        }
        if (i10 == 3) {
            return "Left";
        }
        if (i10 == 4) {
            return "Right";
        }
        if (i10 == 5) {
            return "Up";
        }
        if (i10 == 6) {
            return "Down";
        }
        if (i10 == 7) {
            return "Enter";
        }
        return i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2046c) {
            return this.f21885a == ((C2046c) obj).f21885a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21885a);
    }

    public final String toString() {
        return a(this.f21885a);
    }
}
