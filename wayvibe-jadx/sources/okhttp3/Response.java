package okhttp3;

import java.io.Closeable;
import kotlin.jvm.internal.m;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.Exchange$upgradeToSocket$1;

/* JADX INFO: loaded from: classes2.dex */
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f24114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Protocol f24115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handshake f24118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Headers f24119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResponseBody f24120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Exchange$upgradeToSocket$1 f24121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Response f24122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Response f24123j;
    public final Response k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f24124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f24125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Exchange f24126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TrailersSource f24127o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CacheControl f24128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f24129q;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Request f24130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Protocol f24131b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f24133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handshake f24134e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Exchange$upgradeToSocket$1 f24137h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Response f24138i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Response f24139j;
        public Response k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f24140l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f24141m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Exchange f24142n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24132c = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ResponseBody f24136g = ResponseBody.f24144a;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public TrailersSource f24143o = TrailersSource.f24150a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Headers.Builder f24135f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.f24122i != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f24123j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i10 = this.f24132c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f24132c).toString());
            }
            Request request = this.f24130a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f24131b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f24133d;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.f24134e, this.f24135f.b(), this.f24136g, this.f24137h, this.f24138i, this.f24139j, this.k, this.f24140l, this.f24141m, this.f24142n, this.f24143o);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(Headers headers) {
            m.f(headers, "headers");
            this.f24135f = headers.d();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i10, Handshake handshake, Headers headers, ResponseBody body, Exchange$upgradeToSocket$1 exchange$upgradeToSocket$1, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange, TrailersSource trailersSource) {
        m.f(request, "request");
        m.f(protocol, "protocol");
        m.f(message, "message");
        m.f(body, "body");
        m.f(trailersSource, "trailersSource");
        this.f24114a = request;
        this.f24115b = protocol;
        this.f24116c = message;
        this.f24117d = i10;
        this.f24118e = handshake;
        this.f24119f = headers;
        this.f24120g = body;
        this.f24121h = exchange$upgradeToSocket$1;
        this.f24122i = response;
        this.f24123j = response2;
        this.k = response3;
        this.f24124l = j10;
        this.f24125m = j11;
        this.f24126n = exchange;
        this.f24127o = trailersSource;
        boolean z10 = false;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        this.f24129q = z10;
    }

    public static String b(String str, Response response) {
        response.getClass();
        String strA = response.f24119f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final Builder c() {
        Builder builder = new Builder();
        builder.f24132c = -1;
        builder.f24136g = ResponseBody.f24144a;
        builder.f24143o = TrailersSource.f24150a;
        builder.f24130a = this.f24114a;
        builder.f24131b = this.f24115b;
        builder.f24132c = this.f24117d;
        builder.f24133d = this.f24116c;
        builder.f24134e = this.f24118e;
        builder.f24135f = this.f24119f.d();
        builder.f24136g = this.f24120g;
        builder.f24137h = this.f24121h;
        builder.f24138i = this.f24122i;
        builder.f24139j = this.f24123j;
        builder.k = this.k;
        builder.f24140l = this.f24124l;
        builder.f24141m = this.f24125m;
        builder.f24142n = this.f24126n;
        builder.f24143o = this.f24127o;
        return builder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24120g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f24115b + ", code=" + this.f24117d + ", message=" + this.f24116c + ", url=" + this.f24114a.f24102a + '}';
    }
}
