package p054ea;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19651a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f19651a;
        long j11 = ((a) obj).f19651a;
        if (j10 < j11) {
            return 1;
        }
        return j10 > j11 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof a) && this.f19651a == ((a) obj).f19651a;
    }

    public final int hashCode() {
        long j10 = this.f19651a;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
