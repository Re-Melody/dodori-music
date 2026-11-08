package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingServiceDisconnected$lambda$6$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return p134m1.b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " Callback has already been called when checking if device can make payments.");
    }
}
