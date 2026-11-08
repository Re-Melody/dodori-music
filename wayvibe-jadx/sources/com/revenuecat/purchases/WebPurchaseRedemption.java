package com.revenuecat.purchases;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WebPurchaseRedemption {
    private final String redemptionToken;

    public WebPurchaseRedemption(String redemptionToken) {
        m.f(redemptionToken, "redemptionToken");
        this.redemptionToken = redemptionToken;
    }

    public final String getRedemptionToken$purchases_defaultsRelease() {
        return this.redemptionToken;
    }
}
