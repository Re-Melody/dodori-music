package okhttp3.internal.http;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HttpMethod f24340a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean a(String method) {
        m.f(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }
}
