package com.revenuecat.purchases;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ y $previousProductId$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3$invoke$$inlined$log$1(LogIntent logIntent, y yVar) {
        super(0);
        this.$intent = logIntent;
        this.$previousProductId$inlined = yVar;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$previousProductId$inlined.f21873a}, 1, PurchaseStrings.FOUND_EXISTING_PURCHASE, sb);
    }
}
