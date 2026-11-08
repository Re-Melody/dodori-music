package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1 extends n implements c {
    final /* synthetic */ c $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1(c cVar) {
        super(1);
        this.$onAction = cVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SubscriptionOption) obj);
        return D.f8402a;
    }

    public final void invoke(SubscriptionOption subscriptionOption) {
        m.f(subscriptionOption, "subscriptionOption");
        this.$onAction.invoke(new CustomerCenterAction.PurchasePromotionalOffer(subscriptionOption));
    }
}
