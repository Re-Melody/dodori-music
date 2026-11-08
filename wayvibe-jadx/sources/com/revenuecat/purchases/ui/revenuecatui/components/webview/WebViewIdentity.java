package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewIdentity {
    public static final int $stable = 0;
    private final String componentId;
    private final String resolvedUrl;
    private final boolean sizeToContentHeight;
    private final boolean sizeToContentWidth;

    public WebViewIdentity(String resolvedUrl, String componentId, boolean z10, boolean z11) {
        m.f(resolvedUrl, "resolvedUrl");
        m.f(componentId, "componentId");
        this.resolvedUrl = resolvedUrl;
        this.componentId = componentId;
        this.sizeToContentWidth = z10;
        this.sizeToContentHeight = z11;
    }

    public static /* synthetic */ WebViewIdentity copy$default(WebViewIdentity webViewIdentity, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewIdentity.resolvedUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = webViewIdentity.componentId;
        }
        if ((i10 & 4) != 0) {
            z10 = webViewIdentity.sizeToContentWidth;
        }
        if ((i10 & 8) != 0) {
            z11 = webViewIdentity.sizeToContentHeight;
        }
        return webViewIdentity.copy(str, str2, z10, z11);
    }

    public final String component1() {
        return this.resolvedUrl;
    }

    public final String component2() {
        return this.componentId;
    }

    public final boolean component3() {
        return this.sizeToContentWidth;
    }

    public final boolean component4() {
        return this.sizeToContentHeight;
    }

    public final WebViewIdentity copy(String resolvedUrl, String componentId, boolean z10, boolean z11) {
        m.f(resolvedUrl, "resolvedUrl");
        m.f(componentId, "componentId");
        return new WebViewIdentity(resolvedUrl, componentId, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewIdentity)) {
            return false;
        }
        WebViewIdentity webViewIdentity = (WebViewIdentity) obj;
        return m.b(this.resolvedUrl, webViewIdentity.resolvedUrl) && m.b(this.componentId, webViewIdentity.componentId) && this.sizeToContentWidth == webViewIdentity.sizeToContentWidth && this.sizeToContentHeight == webViewIdentity.sizeToContentHeight;
    }

    public final String getComponentId() {
        return this.componentId;
    }

    public final String getResolvedUrl() {
        return this.resolvedUrl;
    }

    public final boolean getSizeToContentHeight() {
        return this.sizeToContentHeight;
    }

    public final boolean getSizeToContentWidth() {
        return this.sizeToContentWidth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sizeToContentHeight) + p134m1.b.f(AbstractC0112b.a(this.resolvedUrl.hashCode() * 31, 31, this.componentId), 31, this.sizeToContentWidth);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WebViewIdentity(resolvedUrl=");
        sb.append(this.resolvedUrl);
        sb.append(", componentId=");
        sb.append(this.componentId);
        sb.append(", sizeToContentWidth=");
        sb.append(this.sizeToContentWidth);
        sb.append(", sizeToContentHeight=");
        return p134m1.b.o(sb, this.sizeToContentHeight, ')');
    }
}
