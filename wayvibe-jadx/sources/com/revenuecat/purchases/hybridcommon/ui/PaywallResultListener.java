package com.revenuecat.purchases.hybridcommon.ui;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallResultListener {

    public static final class DefaultImpls {
        @InterfaceC0641c
        public static void onPaywallResult(PaywallResultListener paywallResultListener, PaywallResult paywallResult) {
            m.f(paywallResult, "paywallResult");
        }
    }

    @InterfaceC0641c
    void onPaywallResult(PaywallResult paywallResult);

    void onPaywallResult(String str);
}
