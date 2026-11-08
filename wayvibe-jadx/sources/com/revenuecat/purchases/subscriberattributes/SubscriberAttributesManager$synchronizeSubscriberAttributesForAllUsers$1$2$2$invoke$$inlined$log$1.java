package com.revenuecat.purchases.subscriberattributes;

import B2.AbstractC0112b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2$invoke$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $syncingAppUserID$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$2$2$invoke$$inlined$log$1(LogIntent logIntent, String str, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$syncingAppUserID$inlined = str;
        this.$error$inlined = purchasesError;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$syncingAppUserID$inlined, this.$error$inlined}, 2, AttributionStrings.ATTRIBUTES_SYNC_ERROR, sb);
    }
}
