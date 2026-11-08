package com.revenuecat.purchases.amazon;

import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;
import p134m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonBilling$shouldFinishTransactions$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$shouldFinishTransactions$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " Attempting to interact with the Amazon App Store while RevenueCat is configured not to complete purchases won't do anything. (See AmazonConfiguration.Builder.purchasesAreCompletedBy().) Please use syncAmazonPurchase to send purchases to RevenueCat instead.");
    }
}
