package E9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N f3360d = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3363c;

    public O a() {
        this.f3361a = false;
        return this;
    }

    public O b() {
        this.f3363c = 0L;
        return this;
    }

    public long c() {
        if (this.f3361a) {
            return this.f3362b;
        }
        throw new IllegalStateException("No deadline");
    }

    public O d(long j10) {
        this.f3361a = true;
        this.f3362b = j10;
        return this;
    }

    public boolean e() {
        return this.f3361a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3361a && this.f3362b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public O g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.m.f(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(V0.p.j(j10, "timeout < 0: ").toString());
        }
        this.f3363c = unit.toNanos(j10);
        return this;
    }
}
