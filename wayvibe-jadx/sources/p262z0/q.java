package p262z0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29766a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f29766a == ((q) obj).f29766a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29766a);
    }

    public final String toString() {
        return b(this.f29766a);
    }
}
