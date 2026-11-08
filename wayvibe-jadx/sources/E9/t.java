package E9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public O f3412e;

    public t(O delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f3412e = delegate;
    }

    @Override // E9.O
    public final O a() {
        return this.f3412e.a();
    }

    @Override // E9.O
    public final O b() {
        return this.f3412e.b();
    }

    @Override // E9.O
    public final long c() {
        return this.f3412e.c();
    }

    @Override // E9.O
    public final O d(long j10) {
        return this.f3412e.d(j10);
    }

    @Override // E9.O
    public final boolean e() {
        return this.f3412e.e();
    }

    @Override // E9.O
    public final void f() throws InterruptedIOException {
        this.f3412e.f();
    }

    @Override // E9.O
    public final O g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.m.f(unit, "unit");
        return this.f3412e.g(j10, unit);
    }
}
