package X4;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f13229c = -9223372036854775807L;

    public h(long j10) {
        a(j10);
    }

    public final synchronized void a(long j10) {
        a.q(this.f13229c == -9223372036854775807L);
        this.f13227a = j10;
    }

    public final long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13229c != -9223372036854775807L) {
            long j11 = (this.f13229c * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            long j14 = (j12 * 8589934592L) + j10;
            j10 = Math.abs(j13 - j11) < Math.abs(j14 - j11) ? j13 : j14;
        }
        return d((j10 * 1000000) / 90000);
    }

    public final long c() {
        if (this.f13227a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f13229c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13228b;
    }

    public final long d(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13229c != -9223372036854775807L) {
            this.f13229c = j10;
        } else {
            long j11 = this.f13227a;
            if (j11 != Long.MAX_VALUE) {
                this.f13228b = j11 - j10;
            }
            synchronized (this) {
                this.f13229c = j10;
                notifyAll();
            }
        }
        return j10 + this.f13228b;
    }
}
