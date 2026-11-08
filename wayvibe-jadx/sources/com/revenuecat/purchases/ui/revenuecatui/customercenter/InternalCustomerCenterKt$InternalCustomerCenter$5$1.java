package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import android.content.Context;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$5$1 extends n implements Z8.a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Z8.a $onDismiss;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$5$1(CustomerCenterViewModel customerCenterViewModel, Context context, Z8.a aVar) {
        super(0);
        this.$viewModel = customerCenterViewModel;
        this.$context = context;
        this.$onDismiss = aVar;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m647invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m647invoke() {
        this.$viewModel.onNavigationButtonPressed(this.$context, this.$onDismiss);
    }
}
