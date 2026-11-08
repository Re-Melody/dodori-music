package com.revenuecat.purchases.ui.revenuecatui.helpers;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class TestTag {
    public static final int $stable = 0;
    public static final TestTag INSTANCE = new TestTag();
    public static final String PURCHASE_BUTTON_TAG = "PurchaseButton";

    private TestTag() {
    }

    public final String selectButtonTestTag(String packageId) {
        m.f(packageId, "packageId");
        return "SelectButton_".concat(packageId);
    }
}
