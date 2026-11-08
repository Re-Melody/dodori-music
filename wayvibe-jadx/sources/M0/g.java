package M0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8019a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8019a == ((g) obj).f8019a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8019a);
    }

    public final String toString() {
        int i10 = this.f8019a;
        if (i10 == 0) {
            return "Button";
        }
        if (i10 == 1) {
            return "Checkbox";
        }
        if (i10 == 2) {
            return "Switch";
        }
        if (i10 == 3) {
            return "RadioButton";
        }
        if (i10 == 4) {
            return "Tab";
        }
        if (i10 == 5) {
            return "Image";
        }
        return i10 == 6 ? "DropdownList" : "Unknown";
    }
}
