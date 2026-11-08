package com.revenuecat.purchases.common.localrules;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;

/* JADX INFO: loaded from: classes2.dex */
public enum RulesDimensionNamespace {
    Custom("custom"),
    Device("device"),
    Store(ProductResponseJsonKeys.STORE),
    SubscriberAttributes("subscriberAttributes");

    private final String key;

    RulesDimensionNamespace(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
