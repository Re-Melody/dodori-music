package okhttp3.internal.http;

import kotlin.jvm.internal.m;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RequestLine f24353a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        m.f(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }
}
