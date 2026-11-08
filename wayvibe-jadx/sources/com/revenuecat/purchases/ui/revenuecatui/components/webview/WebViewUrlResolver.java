package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import android.net.Uri;
import kotlin.jvm.internal.m;
import p097i9.k;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewUrlResolver {
    public static final int $stable = 0;
    private static final String HTTPS_SCHEME = "https";
    public static final WebViewUrlResolver INSTANCE = new WebViewUrlResolver();

    private WebViewUrlResolver() {
    }

    public final String resolve(String url) {
        String host;
        m.f(url, "url");
        if (k.n0(url, "{{")) {
            return null;
        }
        Uri uri = Uri.parse(url);
        if (!r.c0(uri.getScheme(), HTTPS_SCHEME) || (host = uri.getHost()) == null || k.x0(host)) {
            return null;
        }
        return url;
    }
}
