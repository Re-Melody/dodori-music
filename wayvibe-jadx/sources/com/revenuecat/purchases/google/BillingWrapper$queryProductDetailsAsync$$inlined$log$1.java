package com.revenuecat.purchases.google;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$queryProductDetailsAsync$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Set $productIds$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$queryProductDetailsAsync$$inlined$log$1(LogIntent logIntent, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$productIds$inlined = set;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{N8.n.H0(this.$productIds$inlined, null, null, null, null, 63)}, 1, OfferingStrings.FETCHING_PRODUCTS, sb);
    }
}
