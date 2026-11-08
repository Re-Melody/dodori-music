package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import B2.AbstractC0112b;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    private final String expectedOrigin;
    private volatile boolean failed;
    private volatile boolean finished;
    private final Z8.a onMainFrameLoadFailed;
    private final Z8.a onMainFrameLoadFinished;
    private final Z8.a onMainFrameNavigationStarted;

    public PaywallWebViewClient(String str, Z8.a onMainFrameNavigationStarted, Z8.a onMainFrameLoadFailed, Z8.a onMainFrameLoadFinished) {
        m.f(onMainFrameNavigationStarted, "onMainFrameNavigationStarted");
        m.f(onMainFrameLoadFailed, "onMainFrameLoadFailed");
        m.f(onMainFrameLoadFinished, "onMainFrameLoadFinished");
        this.expectedOrigin = str;
        this.onMainFrameNavigationStarted = onMainFrameNavigationStarted;
        this.onMainFrameLoadFailed = onMainFrameLoadFailed;
        this.onMainFrameLoadFinished = onMainFrameLoadFinished;
    }

    private final void markFailed(String str) {
        if (this.failed) {
            return;
        }
        this.failed = true;
        Logger.INSTANCE.w("Paywalls V2 web_view load failed terminally, removing the component: " + str);
        this.onMainFrameLoadFailed.invoke();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String str) {
        m.f(view, "view");
        super.onPageFinished(view, str);
        if (this.failed || this.finished) {
            return;
        }
        if ((str != null ? WebViewOriginsKt.toOriginOrNull(str) : null) == null) {
            return;
        }
        this.finished = true;
        this.onMainFrameLoadFinished.invoke();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String str, Bitmap bitmap) {
        m.f(view, "view");
        super.onPageStarted(view, str, bitmap);
        if (this.failed) {
            return;
        }
        if ((str != null ? WebViewOriginsKt.toOriginOrNull(str) : null) == null) {
            return;
        }
        if (!WebViewOriginsKt.shouldBlockWebViewNavigation(str, true, this.expectedOrigin)) {
            this.onMainFrameNavigationStarted.invoke();
            return;
        }
        view.stopLoading();
        StringBuilder sb = new StringBuilder("blocked main-frame navigation to '");
        sb.append(str);
        sb.append("' (expectedOrigin=");
        markFailed(AbstractC0112b.j(sb, this.expectedOrigin, ')'));
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        m.f(view, "view");
        m.f(request, "request");
        m.f(error, "error");
        if (request.isForMainFrame()) {
            markFailed("resource error code=" + error.getErrorCode() + " '" + ((Object) error.getDescription()) + '\'');
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        m.f(view, "view");
        m.f(request, "request");
        m.f(errorResponse, "errorResponse");
        if (request.isForMainFrame()) {
            markFailed("HTTP error status=" + errorResponse.getStatusCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        m.f(view, "view");
        m.f(handler, "handler");
        m.f(error, "error");
        handler.cancel();
        markFailed("SSL error: " + error);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        m.f(view, "view");
        m.f(detail, "detail");
        markFailed("render process gone (didCrash=" + detail.didCrash() + ')');
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        m.f(view, "view");
        m.f(request, "request");
        Uri url = request.getUrl();
        return WebViewOriginsKt.shouldBlockWebViewNavigation(url != null ? url.toString() : null, request.isForMainFrame(), this.expectedOrigin);
    }
}
