package com.revenuecat.purchases.ui.revenuecatui.fonts;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomParcelizableFontProvider implements ParcelizableFontProvider {
    public static final int $stable = 0;
    private final PaywallFontFamily fontFamily;

    public CustomParcelizableFontProvider(PaywallFontFamily fontFamily) {
        m.f(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider
    public PaywallFontFamily getFont(TypographyType type) {
        m.f(type, "type");
        return this.fontFamily;
    }
}
