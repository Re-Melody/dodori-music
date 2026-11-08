package com.revenuecat.purchases.ui.revenuecatui;

import U.F;
import U.G;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalPaywallKt$InternalPaywall$1$1 extends n implements c {
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$1$1(PaywallViewModel paywallViewModel) {
        super(1);
        this.$viewModel = paywallViewModel;
    }

    @Override // Z8.c
    public final F invoke(G DisposableEffect) {
        m.f(DisposableEffect, "$this$DisposableEffect");
        this.$viewModel.onPaywallPresented();
        final PaywallViewModel paywallViewModel = this.$viewModel;
        return new F() { // from class: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt$InternalPaywall$1$1$invoke$$inlined$onDispose$1
            @Override // U.F
            public void dispose() {
                paywallViewModel.onPaywallDismissed();
            }
        };
    }
}
