package com.revenuecat.purchases.ui.revenuecatui.composables;

import M8.D;
import Z8.a;
import com.revenuecat.purchases.paywalls.events.PaywallComponentType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallLegacyComponentInteraction;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class FooterKt$Footer$3$2$1 extends n implements a {
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Footer$3$2$1(PaywallViewModel paywallViewModel) {
        super(0);
        this.$viewModel = paywallViewModel;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m551invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m551invoke() {
        PaywallViewModel.trackComponentInteraction$default(this.$viewModel, PaywallComponentType.BUTTON, PaywallLegacyComponentInteraction.RESTORE_BUTTON_NAME, PaywallLegacyComponentInteraction.Value.RESTORE_PURCHASES, null, 8, null);
        this.$viewModel.restorePurchases();
    }
}
