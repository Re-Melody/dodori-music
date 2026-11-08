package com.revenuecat.purchases.ui.revenuecatui.fonts;

import T0.AbstractC0818v;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomFontProvider implements FontProvider {
    public static final int $stable = 0;
    private final AbstractC0818v fontFamily;

    public CustomFontProvider(AbstractC0818v fontFamily) {
        m.f(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider
    public AbstractC0818v getFont(TypographyType type) {
        m.f(type, "type");
        return this.fontFamily;
    }
}
