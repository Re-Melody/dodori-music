package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import Q.F;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalPaywallKt$InternalPaywall$3$1 extends n implements Z8.a {
    final /* synthetic */ F $colorScheme;
    final /* synthetic */ boolean $isDark;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$3$1(PaywallViewModel paywallViewModel, F f10, boolean z10) {
        super(0);
        this.$viewModel = paywallViewModel;
        this.$colorScheme = f10;
        this.$isDark = z10;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m315invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m315invoke() {
        this.$viewModel.refreshStateIfLocaleChanged();
        this.$viewModel.refreshStateIfColorsChanged(this.$colorScheme, this.$isDark);
    }
}
