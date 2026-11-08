package okhttp3.internal;

import E9.AbstractC0341b;
import E9.C0348i;
import E9.InterfaceC0350k;
import E9.M;
import E9.O;
import kotlin.jvm.internal.m;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class UnreadableResponseBody extends ResponseBody implements M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaType f24156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24157c;

    public UnreadableResponseBody(MediaType mediaType, long j10) {
        this.f24156b = mediaType;
        this.f24157c = j10;
    }

    @Override // okhttp3.ResponseBody
    public final long c() {
        return this.f24157c;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // E9.M
    public final long d(long j10, C0348i sink) {
        m.f(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public final MediaType e() {
        return this.f24156b;
    }

    @Override // E9.M
    public final O f() {
        return O.f3360d;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0350k g() {
        return AbstractC0341b.c(this);
    }
}
