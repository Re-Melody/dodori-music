package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class WebViewComponentViewKt$createPaywallWebView$4$2 extends j implements c {
    public WebViewComponentViewKt$createPaywallWebView$4$2(Object obj) {
        super(1, 0, PaywallWebView.class, obj, "onContentGestureVerdict", "onContentGestureVerdict(Z)V");
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return D.f8402a;
    }

    public final void invoke(boolean z10) {
        ((PaywallWebView) this.receiver).onContentGestureVerdict(z10);
    }
}
