package com.revenuecat.purchases.google.usecase;

import B2.AbstractC0112b;
import Z4.C0976i;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ C0976i $billingResult$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$queryProductDetailsAsyncEnsuringOneResponse$lambda$14$$inlined$log$1(LogIntent logIntent, C0976i c0976i) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = c0976i;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{Integer.valueOf(this.$billingResult$inlined.f13768a)}, 1, OfferingStrings.EXTRA_QUERY_PRODUCT_DETAILS_RESPONSE, sb);
    }
}
