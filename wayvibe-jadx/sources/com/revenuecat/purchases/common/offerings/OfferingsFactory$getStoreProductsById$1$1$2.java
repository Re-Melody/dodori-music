package com.revenuecat.purchases.common.offerings;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$2 extends n implements c {
    final /* synthetic */ c $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$2(c cVar) {
        super(1);
        this.$onError = cVar;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }

    public final void invoke(PurchasesError it) {
        m.f(it, "it");
        this.$onError.invoke(it);
    }
}
