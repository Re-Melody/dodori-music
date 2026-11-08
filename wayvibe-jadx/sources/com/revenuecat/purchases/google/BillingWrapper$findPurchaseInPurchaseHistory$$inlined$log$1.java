package com.revenuecat.purchases.google;

import B2.AbstractC0112b;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.RestoreStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $productId$inlined;
    final /* synthetic */ ProductType $productType$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1(LogIntent logIntent, String str, ProductType productType) {
        super(0);
        this.$intent = logIntent;
        this.$productId$inlined = str;
        this.$productType$inlined = productType;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$productId$inlined, this.$productType$inlined.name()}, 2, RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, sb);
    }
}
