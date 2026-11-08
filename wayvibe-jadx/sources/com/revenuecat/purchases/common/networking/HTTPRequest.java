package com.revenuecat.purchases.common.networking;

import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPRequest {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String LAST_REFRESH_TIME_HEADER_NAME = "X-RC-Last-Refresh-Time";
    public static final String POST_PARAMS_HASH = "X-Post-Params-Hash";
    private final JSONObject body;
    private final URL fullURL;
    private final Map<String, String> headers;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public HTTPRequest(URL fullURL, Map<String, String> headers, JSONObject jSONObject) {
        m.f(fullURL, "fullURL");
        m.f(headers, "headers");
        this.fullURL = fullURL;
        this.headers = headers;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPRequest copy$default(HTTPRequest hTTPRequest, URL url, Map map, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i10 & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i10 & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    public final URL component1() {
        return this.fullURL;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final HTTPRequest copy(URL fullURL, Map<String, String> headers, JSONObject jSONObject) {
        m.f(fullURL, "fullURL");
        m.f(headers, "headers");
        return new HTTPRequest(fullURL, headers, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPRequest)) {
            return false;
        }
        HTTPRequest hTTPRequest = (HTTPRequest) obj;
        return m.b(this.fullURL, hTTPRequest.fullURL) && m.b(this.headers, hTTPRequest.headers) && m.b(this.body, hTTPRequest.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final URL getFullURL() {
        return this.fullURL;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int iE = b.e(this.fullURL.hashCode() * 31, 31, this.headers);
        JSONObject jSONObject = this.body;
        return iE + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
