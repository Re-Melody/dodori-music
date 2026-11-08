package com.revenuecat.purchases.ui.revenuecatui.data;

import Z8.c;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5 extends n implements c {
    public static final PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5 INSTANCE = new PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5();

    public PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$5() {
        super(1);
    }

    @Override // Z8.c
    public final Price invoke(StoreProduct product) {
        m.f(product, "product");
        return StoreProduct.pricePerMonth$default(product, null, 1, null);
    }
}
