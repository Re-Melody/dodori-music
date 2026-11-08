package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.y;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.Transaction;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class TransactionMapperKt {
    public static final Map<String, Object> map(Transaction transaction) {
        m.f(transaction, "<this>");
        return y.g0(new l("transactionIdentifier", transaction.getTransactionIdentifier()), new l("revenueCatId", transaction.getTransactionIdentifier()), new l("productIdentifier", transaction.getProductIdentifier()), new l("productId", transaction.getProductIdentifier()), new l("purchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(transaction.getPurchaseDate()))), new l(b.f16391Q, MappersHelpersKt.toIso8601(transaction.getPurchaseDate())));
    }
}
