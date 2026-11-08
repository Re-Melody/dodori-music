package com.revenuecat.purchases.paywalls;

import Z8.a;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallAssetWarming$warmer$2 extends n implements a {
    final /* synthetic */ a $warmerProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallAssetWarming$warmer$2(a aVar) {
        super(0);
        this.$warmerProvider = aVar;
    }

    @Override // Z8.a
    public final PaywallAssetWarmer invoke() {
        return (PaywallAssetWarmer) this.$warmerProvider.invoke();
    }
}
