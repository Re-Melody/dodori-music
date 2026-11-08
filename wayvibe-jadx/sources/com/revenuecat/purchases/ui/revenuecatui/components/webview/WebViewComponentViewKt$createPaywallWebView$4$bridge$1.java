package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.D;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewComponentViewKt$createPaywallWebView$4$bridge$1 extends n implements Z8.a {
    final /* synthetic */ Z8.a $onLoadFailed;
    final /* synthetic */ u $terminalFailure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewComponentViewKt$createPaywallWebView$4$bridge$1(u uVar, Z8.a aVar) {
        super(0);
        this.$terminalFailure = uVar;
        this.$onLoadFailed = aVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m528invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m528invoke() {
        this.$terminalFailure.f21869a = true;
        this.$onLoadFailed.invoke();
    }
}
