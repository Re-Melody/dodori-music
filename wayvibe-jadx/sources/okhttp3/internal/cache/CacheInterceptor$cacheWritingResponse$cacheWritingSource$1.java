package okhttp3.internal.cache;

import E9.C0348i;
import E9.M;
import E9.O;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24168a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24168a) {
            throw null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (_UtilJvmKt.c(this)) {
            throw null;
        }
        this.f24168a = true;
        throw null;
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) {
        m.f(sink, "sink");
        throw null;
    }

    @Override // E9.M
    public final O f() {
        throw null;
    }
}
