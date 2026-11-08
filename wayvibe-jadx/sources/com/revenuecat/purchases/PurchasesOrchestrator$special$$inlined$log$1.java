package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$special$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$special$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return p134m1.b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " Automatic syncing of purchases has been disabled. \nRevenueCat won’t observe the new purchases from the store, and it will not sync any purchase \nautomatically. Call syncPurchases whenever a new transaction is completed so the \nreceipt is sent to RevenueCat’s backend. Consumables disappear from the receipt \nafter the transaction is finished, so make sure purchases are synced before \nfinishing any consumable transaction, otherwise RevenueCat won’t register the \npurchase.");
    }
}
