package B8;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: B8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0132t implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0125l f866d = new C0125l(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f869g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0125l f870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f872c;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f867e = nanos;
        f868f = -nanos;
        f869g = TimeUnit.SECONDS.toNanos(1L);
    }

    public C0132t(long j10) {
        C0125l c0125l = f866d;
        long jNanoTime = System.nanoTime();
        this.f870a = c0125l;
        long jMin = Math.min(f867e, Math.max(f868f, j10));
        this.f871b = jNanoTime + jMin;
        this.f872c = jMin <= 0;
    }

    public final boolean a() {
        if (!this.f872c) {
            long j10 = this.f871b;
            this.f870a.getClass();
            if (j10 - System.nanoTime() > 0) {
                return false;
            }
            this.f872c = true;
        }
        return true;
    }

    public final long b() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f870a.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f872c && this.f871b - jNanoTime <= 0) {
            this.f872c = true;
        }
        return timeUnit.convert(this.f871b - jNanoTime, timeUnit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0132t c0132t = (C0132t) obj;
        C0125l c0125l = c0132t.f870a;
        C0125l c0125l2 = this.f870a;
        if (c0125l2 == c0125l) {
            long j10 = this.f871b - c0132t.f871b;
            if (j10 < 0) {
                return -1;
            }
            return j10 > 0 ? 1 : 0;
        }
        throw new AssertionError("Tickers (" + c0125l2 + " and " + c0132t.f870a + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0132t)) {
            return false;
        }
        C0132t c0132t = (C0132t) obj;
        C0125l c0125l = this.f870a;
        if (c0125l != null ? c0125l == c0132t.f870a : c0132t.f870a == null) {
            return this.f871b == c0132t.f871b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f870a, Long.valueOf(this.f871b)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jB = b();
        long jAbs = Math.abs(jB);
        long j10 = f869g;
        long j11 = jAbs / j10;
        long jAbs2 = Math.abs(jB) % j10;
        StringBuilder sb = new StringBuilder();
        if (jB < 0) {
            sb.append('-');
        }
        sb.append(j11);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        C0125l c0125l = f866d;
        C0125l c0125l2 = this.f870a;
        if (c0125l2 != c0125l) {
            sb.append(" (ticker=" + c0125l2 + ")");
        }
        return sb.toString();
    }
}
