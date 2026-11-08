package p112k2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21583b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f21582a = 0L;
            this.f21583b = 1L;
        } else {
            this.f21582a = j10;
            this.f21583b = j11;
        }
    }

    public final String toString() {
        return this.f21582a + "/" + this.f21583b;
    }
}
