package com.revenuecat.purchases.ui.revenuecatui;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallModeKt {
    public static final boolean isFullScreen(PaywallMode paywallMode) {
        m.f(paywallMode, "<this>");
        return paywallMode == PaywallMode.FULL_SCREEN;
    }
}
