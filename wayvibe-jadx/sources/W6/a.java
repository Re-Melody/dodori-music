package W6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12850c;

    public a(long j10, long j11, long j12) {
        this.f12848a = j10;
        this.f12849b = j11;
        this.f12850c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f12848a == aVar.f12848a && this.f12849b == aVar.f12849b && this.f12850c == aVar.f12850c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f12848a;
        long j11 = this.f12849b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f12850c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f12848a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f12849b);
        sb.append(", uptimeMillis=");
        return V0.p.k(this.f12850c, "}", sb);
    }
}
