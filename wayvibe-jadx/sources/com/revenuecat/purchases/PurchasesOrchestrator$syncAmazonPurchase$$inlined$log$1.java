package com.revenuecat.purchases;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ String $amazonUserID$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $receiptID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$syncAmazonPurchase$$inlined$log$1(LogIntent logIntent, String str, String str2) {
        super(0);
        this.$intent = logIntent;
        this.$receiptID$inlined = str;
        this.$amazonUserID$inlined = str2;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$receiptID$inlined, this.$amazonUserID$inlined}, 2, PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, sb);
    }
}
