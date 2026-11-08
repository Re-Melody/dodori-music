package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import B2.AbstractC0112b;
import android.net.Uri;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p097i9.k;
import p097i9.r;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class WebViewOriginsKt {
    public static final boolean shouldBlockWebViewNavigation(String str, boolean z10, String str2) {
        String originOrNull;
        if (str == null || (originOrNull = toOriginOrNull(str)) == null || !r.j0(originOrNull, "https://", false)) {
            return true;
        }
        return z10 && !originOrNull.equals(str2 != null ? toOriginOrNull(str2) : null);
    }

    public static final String toOriginOrNull(String str) {
        m.f(str, "<this>");
        Uri uri = Uri.parse(str);
        m.e(uri, "uri");
        return toOriginOrNull(uri);
    }

    public static final String toOriginOrNull(Uri uri) {
        m.f(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null) {
            Locale US = Locale.US;
            m.e(US, "US");
            String lowerCase = scheme.toLowerCase(US);
            m.e(lowerCase, "toLowerCase(...)");
            String host = uri.getHost();
            if (host != null) {
                if (k.x0(host)) {
                    host = null;
                }
                if (host != null) {
                    m.e(US, "US");
                    String lowerCase2 = host.toLowerCase(US);
                    m.e(lowerCase2, "toLowerCase(...)");
                    String str = "";
                    if (uri.getPort() != -1 && ((!lowerCase.equals("https") || uri.getPort() != 443) && (!lowerCase.equals("http") || uri.getPort() != 80))) {
                        str = ":" + uri.getPort();
                    }
                    return AbstractC0112b.y(lowerCase, "://", lowerCase2, str);
                }
            }
        }
        return null;
    }
}
