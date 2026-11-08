package p028c1;

import p046da.b;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n[] f15860b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f15861c = b.S(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15862a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f15860b[(int) ((j10 & 1095216660480L) >>> 32)].f15863a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        long jB = b(j10);
        if (n.a(jB, 0L)) {
            return "Unspecified";
        }
        if (n.a(jB, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (!n.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f15862a == ((m) obj).f15862a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15862a);
    }

    public final String toString() {
        return d(this.f15862a);
    }
}
