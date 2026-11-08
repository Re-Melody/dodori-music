package E;

/* JADX INFO: renamed from: E.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0335b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2877a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0335b) {
            return this.f2877a == ((C0335b) obj).f2877a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2877a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f2877a + ')';
    }
}
