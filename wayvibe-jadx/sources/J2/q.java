package J2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6536b;

    public q(long j10, long j11) {
        this.f6535a = j10;
        this.f6536b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f6535a == qVar.f6535a && this.f6536b == qVar.f6536b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f6535a) * 31) + ((int) this.f6536b);
    }
}
