package E9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f3410a;

    public r(K delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f3410a = delegate;
    }

    @Override // E9.K, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3410a.close();
    }

    @Override // E9.K
    public final O f() {
        return this.f3410a.f();
    }

    @Override // E9.K, java.io.Flushable
    public void flush() {
        this.f3410a.flush();
    }

    @Override // E9.K
    public void r(long j10, C0348i source) {
        kotlin.jvm.internal.m.f(source, "source");
        this.f3410a.r(j10, source);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3410a + ')';
    }
}
