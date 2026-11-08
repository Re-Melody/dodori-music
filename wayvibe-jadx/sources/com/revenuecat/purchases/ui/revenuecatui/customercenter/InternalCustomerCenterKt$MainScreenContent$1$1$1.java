package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$MainScreenContent$1$1$1 extends n implements c {
    final /* synthetic */ c $onAction;
    final /* synthetic */ CustomerCenterState.Success $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$MainScreenContent$1$1$1(CustomerCenterState.Success success, c cVar) {
        super(1);
        this.$state = success;
        this.$onAction = cVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchaseInformation) obj);
        return D.f8402a;
    }

    public final void invoke(PurchaseInformation purchase) {
        m.f(purchase, "purchase");
        if (this.$state.getPurchases().size() > 1) {
            this.$onAction.invoke(new CustomerCenterAction.SelectPurchase(purchase));
        }
    }
}
