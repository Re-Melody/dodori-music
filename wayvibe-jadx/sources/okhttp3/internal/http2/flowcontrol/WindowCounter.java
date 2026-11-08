package okhttp3.internal.http2.flowcontrol;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24530c;

    public WindowCounter(int i10) {
        this.f24528a = i10;
    }

    public static void b(WindowCounter windowCounter, long j10, long j11, int i10) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        synchronized (windowCounter) {
            try {
                if (j10 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j11 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j12 = windowCounter.f24529b + j10;
                windowCounter.f24529b = j12;
                long j13 = windowCounter.f24530c + j11;
                windowCounter.f24530c = j13;
                if (j13 > j12) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized long a() {
        return this.f24529b - this.f24530c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f24528a + ", total=" + this.f24529b + ", acknowledged=" + this.f24530c + ", unacknowledged=" + a() + ')';
    }
}
