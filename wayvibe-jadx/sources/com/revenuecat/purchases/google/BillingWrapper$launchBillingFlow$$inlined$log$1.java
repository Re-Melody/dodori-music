package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$launchBillingFlow$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$launchBillingFlow$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return p134m1.b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " Activity passed into launchBillingFlow has a null intent, which may cause a crash. See https://github.com/RevenueCat/purchases-android/issues/381 for more information.");
    }
}
