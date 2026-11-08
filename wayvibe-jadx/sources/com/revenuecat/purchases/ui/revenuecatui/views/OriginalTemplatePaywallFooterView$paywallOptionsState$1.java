package com.revenuecat.purchases.ui.revenuecatui.views;

import M8.D;
import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class OriginalTemplatePaywallFooterView$paywallOptionsState$1 extends n implements a {
    final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView$paywallOptionsState$1(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        super(0);
        this.this$0 = originalTemplatePaywallFooterView;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m901invoke() {
        a aVar = this.this$0.dismissHandler;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m901invoke();
        return D.f8402a;
    }
}
