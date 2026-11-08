package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.n;
import N8.y;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreTransactionMapperKt {
    public static final Map<String, Object> map(StoreTransaction storeTransaction) {
        m.f(storeTransaction, "<this>");
        return y.g0(new l("transactionIdentifier", transactionIdentifierValue(storeTransaction)), new l("productIdentifier", n.B0(storeTransaction.getProductIds())), new l("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), new l(b.f16391Q, MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime()))), new l("purchaseToken", storeTransaction.getPurchaseToken()), new l("originalJson", storeTransaction.getOriginalJson().toString()), new l("signature", storeTransaction.getSignature()));
    }

    private static final String transactionIdentifierValue(StoreTransaction storeTransaction) {
        String orderId = storeTransaction.getOrderId();
        if (orderId != null) {
            return orderId;
        }
        if (storeTransaction.getPurchaseType() == PurchaseType.AMAZON_PURCHASE) {
            return storeTransaction.getPurchaseToken();
        }
        return null;
    }
}
