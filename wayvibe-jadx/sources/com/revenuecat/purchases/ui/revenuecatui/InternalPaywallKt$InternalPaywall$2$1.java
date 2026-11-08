package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalPaywallKt$InternalPaywall$2$1 extends n implements Z8.a {
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$2$1(PaywallViewModel paywallViewModel) {
        super(0);
        this.$viewModel = paywallViewModel;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m314invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m314invoke() {
        if (this.$viewModel.handleBackNavigation()) {
            return;
        }
        PaywallViewModel.closePaywall$default(this.$viewModel, null, 1, null);
    }
}
