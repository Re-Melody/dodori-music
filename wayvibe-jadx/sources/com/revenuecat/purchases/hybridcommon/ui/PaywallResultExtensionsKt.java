package com.revenuecat.purchases.hybridcommon.ui;

import B8.V;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallResultExtensionsKt {
    public static final String getName(PaywallResult paywallResult) {
        m.f(paywallResult, "<this>");
        if (paywallResult.equals(PaywallResult.Cancelled.INSTANCE)) {
            return "CANCELLED";
        }
        if (paywallResult instanceof PaywallResult.Error) {
            return HybridPurchaseLogicBridge.RESULT_ERROR;
        }
        if (paywallResult instanceof PaywallResult.Purchased) {
            return "PURCHASED";
        }
        if (paywallResult instanceof PaywallResult.Restored) {
            return "RESTORED";
        }
        throw new V();
    }
}
