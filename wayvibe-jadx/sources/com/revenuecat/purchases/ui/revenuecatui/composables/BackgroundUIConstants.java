package com.revenuecat.purchases.ui.revenuecatui.composables;

import D0.C0184j;
import D0.InterfaceC0185k;

/* JADX INFO: loaded from: classes2.dex */
final class BackgroundUIConstants {
    public static final float blurAlpha = 0.7f;
    public static final int minSDKVersionSupportingBlur = 31;
    public static final BackgroundUIConstants INSTANCE = new BackgroundUIConstants();
    private static final float blurSize = 60;
    private static final InterfaceC0185k contentScale = C0184j.f1802b;

    private BackgroundUIConstants() {
    }

    /* JADX INFO: renamed from: getBlurSize-D9Ej5fM, reason: not valid java name */
    public final float m534getBlurSizeD9Ej5fM() {
        return blurSize;
    }

    public final InterfaceC0185k getContentScale() {
        return contentScale;
    }
}
