package E9;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f3411a;

    public s(M delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f3411a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3411a.close();
    }

    @Override // E9.M
    public long d(long j10, C0348i sink) {
        kotlin.jvm.internal.m.f(sink, "sink");
        return this.f3411a.d(j10, sink);
    }

    @Override // E9.M
    public final O f() {
        return this.f3411a.f();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f3411a + ')';
    }
}
