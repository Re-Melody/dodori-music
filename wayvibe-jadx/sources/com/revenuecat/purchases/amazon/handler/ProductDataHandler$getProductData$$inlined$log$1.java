package com.revenuecat.purchases.amazon.handler;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.common.LogIntent;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class ProductDataHandler$getProductData$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Set $skus$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDataHandler$getProductData$$inlined$log$1(LogIntent logIntent, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$skus$inlined = set;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{N8.n.H0(this.$skus$inlined, null, null, null, null, 63)}, 1, AmazonStrings.REQUESTING_PRODUCTS, sb);
    }
}
