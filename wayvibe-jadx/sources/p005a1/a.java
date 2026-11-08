package p005a1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14081a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f14081a, ((a) obj).f14081a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14081a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f14081a + ')';
    }
}
