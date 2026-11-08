package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1 extends n implements a {
    final /* synthetic */ c $onAccept;
    final /* synthetic */ PromotionalOfferData $promotionalOfferData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionalOfferScreenKt$PromotionalOfferScreen$1$1$1(c cVar, PromotionalOfferData promotionalOfferData) {
        super(0);
        this.$onAccept = cVar;
        this.$promotionalOfferData = promotionalOfferData;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m715invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m715invoke() {
        this.$onAccept.invoke(this.$promotionalOfferData.getSubscriptionOption());
    }
}
