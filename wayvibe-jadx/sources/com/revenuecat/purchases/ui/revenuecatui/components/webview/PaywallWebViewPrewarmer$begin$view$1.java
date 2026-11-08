package com.revenuecat.purchases.ui.revenuecatui.components.webview;

import M8.D;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallWebViewPrewarmer$begin$view$1 extends n implements Z8.a {
    final /* synthetic */ String $url;
    final /* synthetic */ PaywallWebViewPrewarmer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallWebViewPrewarmer$begin$view$1(PaywallWebViewPrewarmer paywallWebViewPrewarmer, String str) {
        super(0);
        this.this$0 = paywallWebViewPrewarmer;
        this.$url = str;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m519invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m519invoke() {
        this.this$0.mainHandler.post(new b(0, this.this$0, this.$url));
    }
}
