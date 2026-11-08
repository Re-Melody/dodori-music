package okhttp3;

import D7.W;
import M8.l;
import V0.p;
import kotlin.jvm.internal.m;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.Tags;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f24102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Headers f24104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestBody f24105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Tags f24106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CacheControl f24107f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpUrl f24108a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RequestBody f24111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Tags f24112e = EmptyTags.f24152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f24109b = "GET";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Headers.Builder f24110c = new Headers.Builder();

        public final void a(String str, String value) {
            m.f(value, "value");
            this.f24110c.a(str, value);
        }

        public final void b(CacheControl cacheControl) {
            m.f(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                e("Cache-Control");
            } else {
                c("Cache-Control", string);
            }
        }

        public final void c(String name, String value) {
            m.f(name, "name");
            m.f(value, "value");
            Headers.Builder builder = this.f24110c;
            builder.getClass();
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.c(value, name);
            builder.c(name);
            _HeadersCommonKt.a(builder, name, value);
        }

        public final void d(String method, RequestBody requestBody) {
            m.f(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f24340a;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("QUERY") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(p.o("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.a(method)) {
                throw new IllegalArgumentException(p.o("method ", method, " must not have a request body.").toString());
            }
            this.f24109b = method;
            this.f24111d = requestBody;
        }

        public final void e(String name) {
            m.f(name, "name");
            this.f24110c.c(name);
        }

        public final void f(String url) {
            m.f(url, "url");
            HttpUrl.Companion companion = HttpUrl.f24033i;
            if (r.j0(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                m.e(strSubstring, "substring(...)");
                url = "http:".concat(strSubstring);
            } else if (r.j0(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                m.e(strSubstring2, "substring(...)");
                url = "https:".concat(strSubstring2);
            }
            companion.getClass();
            m.f(url, "<this>");
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.b(null, url);
            this.f24108a = builder.a();
        }
    }

    public Request(Builder builder) {
        HttpUrl httpUrl = builder.f24108a;
        if (httpUrl == null) {
            throw new IllegalStateException("url == null");
        }
        this.f24102a = httpUrl;
        this.f24103b = builder.f24109b;
        this.f24104c = builder.f24110c.b();
        this.f24105d = builder.f24111d;
        this.f24106e = builder.f24112e;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.f24107f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl.f23940n.getClass();
        CacheControl cacheControlA = CacheControl.Companion.a(this.f24104c);
        this.f24107f = cacheControlA;
        return cacheControlA;
    }

    public final Builder b() {
        Builder builder = new Builder();
        EmptyTags emptyTags = EmptyTags.f24152a;
        builder.f24108a = this.f24102a;
        builder.f24109b = this.f24103b;
        builder.f24111d = this.f24105d;
        builder.f24112e = this.f24106e;
        builder.f24110c = this.f24104c.d();
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f24103b);
        sb.append(", url=");
        sb.append(this.f24102a);
        Headers headers = this.f24104c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (l lVar : headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    W.k0();
                    throw null;
                }
                l lVar2 = lVar;
                String str = (String) lVar2.f8413a;
                String str2 = (String) lVar2.f8414b;
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.i(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        EmptyTags emptyTags = EmptyTags.f24152a;
        Tags tags = this.f24106e;
        if (!m.b(tags, emptyTags)) {
            sb.append(", tags=");
            sb.append(tags);
        }
        sb.append('}');
        return sb.toString();
    }
}
