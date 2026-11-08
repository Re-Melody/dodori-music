package p143n0;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f22769b = W.j(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22770c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22771a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f22771a == ((g0) obj).f22771a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22771a);
    }

    public final String toString() {
        return d(this.f22771a);
    }
}
