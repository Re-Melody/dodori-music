package com.revenuecat.purchases.google.usecase;

import B2.AbstractC0112b;
import Z4.C0983p;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ C0983p $it$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsUseCase$onOk$lambda$9$$inlined$log$1(LogIntent logIntent, C0983p c0983p) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = c0983p;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        C0983p c0983p = this.$it$inlined;
        return AbstractC0112b.n(new Object[]{c0983p.f13796c, c0983p}, 2, OfferingStrings.LIST_PRODUCTS, sb);
    }
}
