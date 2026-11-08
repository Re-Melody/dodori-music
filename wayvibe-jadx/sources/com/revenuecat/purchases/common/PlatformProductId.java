package com.revenuecat.purchases.common;

import M8.l;
import N8.y;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
class PlatformProductId {
    private final String productId;

    public PlatformProductId(String productId) {
        m.f(productId, "productId");
        this.productId = productId;
    }

    public Map<String, String> getAsMap() {
        return y.f0(new l(DiagnosticsTracker.PRODUCT_ID_KEY, getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}
