package p028c1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15851a;

    public static final float a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f15851a == ((g) obj).f15851a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15851a);
    }

    public final String toString() {
        long j10 = this.f15851a;
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j10))) + " x " + ((Object) e.b(a(j10)));
    }
}
