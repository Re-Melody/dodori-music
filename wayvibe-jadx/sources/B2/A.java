package B2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f557d = new ThreadLocal();

    public A(long j10) {
        f(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long jLongValue = this.f554a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f557d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f555b = jLongValue - j10;
                notifyAll();
            }
            this.f556c = j10;
            return j10 + this.f555b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f556c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j10) {
        long j11;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f556c;
            if (j12 != -9223372036854775807L) {
                long j13 = (j12 * 90000) / 1000000;
                long j14 = j13 / 8589934592L;
                long j15 = (j14 * 8589934592L) + j10;
                j11 = ((j14 + 1) * 8589934592L) + j10;
                if (j15 >= j13) {
                    j11 = j15;
                }
            } else {
                j11 = j10;
            }
            return a((j11 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j10;
        j10 = this.f554a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized boolean e() {
        return this.f555b != -9223372036854775807L;
    }

    public final synchronized void f(long j10) {
        this.f554a = j10;
        this.f555b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f556c = -9223372036854775807L;
    }

    public final synchronized void g(long j10, boolean z10) {
        try {
            AbstractC0111a.h(this.f554a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z10) {
                this.f557d.set(Long.valueOf(j10));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
