package com.revenuecat.purchases.google;

import M8.D;
import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$getStoreTransaction$2$2 extends n implements Z8.c {
    final /* synthetic */ Z8.c $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStoreTransaction$2$2(Z8.c cVar, Purchase purchase) {
        super(1);
        this.$completion = cVar;
        this.$purchase = purchase;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return D.f8402a;
    }

    public final void invoke(ProductType type) {
        m.f(type, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, type, null, null, null, null, 30, null));
    }
}
