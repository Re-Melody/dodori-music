package com.revenuecat.purchases.amazon.handler;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $productData$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDataHandler$handleSuccessfulProductDataResponse$$inlined$log$1(LogIntent logIntent, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$productData$inlined = map;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$productData$inlined}, 1, AmazonStrings.RETRIEVED_PRODUCT_DATA, sb);
    }
}
