package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import U.InterfaceC0877b0;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewComponentViewKt$WebViewComponentView$5$1 extends n implements c {
    final /* synthetic */ InterfaceC0877b0 $widthAxisUnboundedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewComponentViewKt$WebViewComponentView$5$1(InterfaceC0877b0 interfaceC0877b0) {
        super(1);
        this.$widthAxisUnboundedState = interfaceC0877b0;
    }

    @Override // Z8.c
    public final r invoke(r conditional) {
        m.f(conditional, "$this$conditional");
        return ModifierExtensionsKt.trackMainAxisUnbounded(conditional, true, this.$widthAxisUnboundedState);
    }
}
