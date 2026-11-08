package com.revenuecat.purchases.hybridcommon;

import M8.D;
import M8.l;
import N8.y;
import Z8.c;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonKt$getPurchaseCompletedFunction$1$1$1 extends n implements c {
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ StoreTransaction $transaction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$getPurchaseCompletedFunction$1$1$1(OnResult onResult, StoreTransaction storeTransaction) {
        super(1);
        this.$onResult = onResult;
        this.$transaction = storeTransaction;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, ? extends Object>) obj);
        return D.f8402a;
    }

    public final void invoke(Map<String, ? extends Object> map) {
        m.f(map, "map");
        this.$onResult.onReceived(y.g0(new l("productIdentifier", this.$transaction.getProductIds().get(0)), new l("customerInfo", map), new l("transaction", StoreTransactionMapperKt.map(this.$transaction))));
    }
}
