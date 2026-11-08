package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.D;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewComponentViewKt$WebViewComponentView$7$1$configured$1 extends n implements Z8.a {
    final /* synthetic */ String $resolvedUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewComponentViewKt$WebViewComponentView$7$1$configured$1(String str) {
        super(0);
        this.$resolvedUrl = str;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m522invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m522invoke() {
        PaywallWebViewPrewarmer.Companion.getShared().markWarmed(this.$resolvedUrl);
    }
}
