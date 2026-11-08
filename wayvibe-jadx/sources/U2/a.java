package U2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12064b;

    public a(long j10, long j11) {
        this.f12063a = j10;
        this.f12064b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12063a == aVar.f12063a && this.f12064b == aVar.f12064b;
    }

    public final int hashCode() {
        return (((int) this.f12063a) * 31) + ((int) this.f12064b);
    }
}
