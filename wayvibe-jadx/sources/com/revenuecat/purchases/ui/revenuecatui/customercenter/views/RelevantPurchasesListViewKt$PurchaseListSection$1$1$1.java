package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import M8.D;
import Z8.a;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RelevantPurchasesListViewKt$PurchaseListSection$1$1$1 extends n implements a {
    final /* synthetic */ PurchaseInformation $info;
    final /* synthetic */ c $onPurchaseSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelevantPurchasesListViewKt$PurchaseListSection$1$1$1(c cVar, PurchaseInformation purchaseInformation) {
        super(0);
        this.$onPurchaseSelect = cVar;
        this.$info = purchaseInformation;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m721invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m721invoke() {
        this.$onPurchaseSelect.invoke(this.$info);
    }
}
