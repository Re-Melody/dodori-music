package com.revenuecat.purchases.ui.revenuecatui.helpers;

import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallProductIdentifierKt {
    public static final String paywallProductIdentifier(StoreProduct storeProduct) {
        m.f(storeProduct, "<this>");
        return storeProduct instanceof GoogleStoreProduct ? ((GoogleStoreProduct) storeProduct).getProductId() : storeProduct.getId();
    }
}
