package E9;

import java.io.EOFException;

/* JADX INFO: renamed from: E9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0346g implements K {
    @Override // E9.K
    public final O f() {
        return O.f3360d;
    }

    @Override // E9.K
    public final void r(long j10, C0348i source) throws EOFException {
        kotlin.jvm.internal.m.f(source, "source");
        source.skip(j10);
    }

    @Override // E9.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // E9.K, java.io.Flushable
    public final void flush() {
    }
}
