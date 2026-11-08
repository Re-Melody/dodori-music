package p028c1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15850a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f15850a == ((f) obj).f15850a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15850a);
    }

    public final String toString() {
        long j10 = this.f15850a;
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) e.b(Float.intBitsToFloat((int) (j10 & 4294967295L)))) + ')';
    }
}
