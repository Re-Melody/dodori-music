package com.revenuecat.purchases.amazon;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1 extends n implements a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$2$invoke$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$error$inlined}, 1, AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, sb);
    }
}
