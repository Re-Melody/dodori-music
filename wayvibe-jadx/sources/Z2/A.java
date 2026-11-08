package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f13455c = new A(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13457b;

    public A(long j10, long j11) {
        this.f13456a = j10;
        this.f13457b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            A a10 = (A) obj;
            if (this.f13456a == a10.f13456a && this.f13457b == a10.f13457b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f13456a) * 31) + ((int) this.f13457b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f13456a);
        sb.append(", position=");
        return V0.p.k(this.f13457b, "]", sb);
    }
}
