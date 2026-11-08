package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class BadgeStyle {
    public static final int $stable = 0;
    private final TwoDimensionalAlignment alignment;
    private final StackComponentStyle stackStyle;
    private final Badge.Style style;

    public BadgeStyle(StackComponentStyle stackStyle, Badge.Style style, TwoDimensionalAlignment alignment) {
        m.f(stackStyle, "stackStyle");
        m.f(style, "style");
        m.f(alignment, "alignment");
        this.stackStyle = stackStyle;
        this.style = style;
        this.alignment = alignment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeStyle)) {
            return false;
        }
        BadgeStyle badgeStyle = (BadgeStyle) obj;
        return m.b(this.stackStyle, badgeStyle.stackStyle) && this.style == badgeStyle.style && this.alignment == badgeStyle.alignment;
    }

    public final /* synthetic */ TwoDimensionalAlignment getAlignment() {
        return this.alignment;
    }

    public final /* synthetic */ StackComponentStyle getStackStyle() {
        return this.stackStyle;
    }

    public final /* synthetic */ Badge.Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.alignment.hashCode() + ((this.style.hashCode() + (this.stackStyle.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "BadgeStyle(stackStyle=" + this.stackStyle + ", style=" + this.style + ", alignment=" + this.alignment + ')';
    }
}
