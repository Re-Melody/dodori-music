package okhttp3.internal;

import kotlin.jvm.internal.m;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        m.f(response, "<this>");
        Response.Builder builderC = response.c();
        ResponseBody responseBody = response.f24120g;
        builderC.f24136g = new UnreadableResponseBody(responseBody.e(), responseBody.c());
        return builderC.a();
    }
}
