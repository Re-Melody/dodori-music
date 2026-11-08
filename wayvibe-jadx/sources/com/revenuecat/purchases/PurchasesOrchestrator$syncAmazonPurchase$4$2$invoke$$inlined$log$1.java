package com.revenuecat.purchases;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ String $amazonUserID$inlined;
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $receiptID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAmazonPurchase$4$2$invoke$$inlined$log$1(LogIntent logIntent, String str, String str2, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$receiptID$inlined = str;
        this.$amazonUserID$inlined = str2;
        this.$error$inlined = purchasesError;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$receiptID$inlined, this.$amazonUserID$inlined, this.$error$inlined}, 3, PurchaseStrings.SYNCING_PURCHASE_ERROR_DETAILS_USER_ID, sb);
    }
}
