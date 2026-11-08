package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import Z8.c;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class PaywallWebView$canScrollHorizontallyReference$1 extends j implements c {
    public PaywallWebView$canScrollHorizontallyReference$1(Object obj) {
        super(1, 0, PaywallWebView.class, obj, "canScrollHorizontally", "canScrollHorizontally(I)Z");
    }

    public final Boolean invoke(int i10) {
        return Boolean.valueOf(((PaywallWebView) this.receiver).canScrollHorizontally(i10));
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
