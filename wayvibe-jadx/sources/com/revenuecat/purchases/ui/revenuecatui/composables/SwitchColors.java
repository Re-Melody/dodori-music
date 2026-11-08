package com.revenuecat.purchases.ui.revenuecatui.composables;

import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;
import p143n0.C2096x;

/* JADX INFO: loaded from: classes2.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final ColorStyle checkedBorderColor;
    private final long checkedIconColor;
    private final ColorStyle checkedThumbColor;
    private final ColorStyle checkedTrackColor;
    private final ColorStyle disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final ColorStyle disabledCheckedThumbColor;
    private final ColorStyle disabledCheckedTrackColor;
    private final ColorStyle disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final ColorStyle disabledUncheckedThumbColor;
    private final ColorStyle disabledUncheckedTrackColor;
    private final ColorStyle uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final ColorStyle uncheckedThumbColor;
    private final ColorStyle uncheckedTrackColor;

    public /* synthetic */ SwitchColors(ColorStyle colorStyle, ColorStyle colorStyle2, ColorStyle colorStyle3, long j10, ColorStyle colorStyle4, ColorStyle colorStyle5, ColorStyle colorStyle6, long j11, ColorStyle colorStyle7, ColorStyle colorStyle8, ColorStyle colorStyle9, long j12, ColorStyle colorStyle10, ColorStyle colorStyle11, ColorStyle colorStyle12, long j13, f fVar) {
        this(colorStyle, colorStyle2, colorStyle3, j10, colorStyle4, colorStyle5, colorStyle6, j11, colorStyle7, colorStyle8, colorStyle9, j12, colorStyle10, colorStyle11, colorStyle12, j13);
    }

    public final ColorStyle borderColor$revenuecatui_defaultsRelease(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.checkedBorderColor : this.uncheckedBorderColor;
        }
        return z11 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return m.b(this.checkedThumbColor, switchColors.checkedThumbColor) && m.b(this.checkedTrackColor, switchColors.checkedTrackColor) && m.b(this.checkedBorderColor, switchColors.checkedBorderColor) && C2096x.c(this.checkedIconColor, switchColors.checkedIconColor) && m.b(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && m.b(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && m.b(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && C2096x.c(this.uncheckedIconColor, switchColors.uncheckedIconColor) && m.b(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && m.b(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && m.b(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && C2096x.c(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && m.b(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && m.b(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && m.b(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && C2096x.c(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    public int hashCode() {
        int iHashCode = (this.checkedBorderColor.hashCode() + ((this.checkedTrackColor.hashCode() + (this.checkedThumbColor.hashCode() * 31)) * 31)) * 31;
        long j10 = this.checkedIconColor;
        int i10 = C2096x.f22803n;
        return Long.hashCode(this.disabledUncheckedIconColor) + ((this.disabledUncheckedBorderColor.hashCode() + ((this.disabledUncheckedTrackColor.hashCode() + ((this.disabledUncheckedThumbColor.hashCode() + b.g(this.disabledCheckedIconColor, (this.disabledCheckedBorderColor.hashCode() + ((this.disabledCheckedTrackColor.hashCode() + ((this.disabledCheckedThumbColor.hashCode() + b.g(this.uncheckedIconColor, (this.uncheckedBorderColor.hashCode() + ((this.uncheckedTrackColor.hashCode() + ((this.uncheckedThumbColor.hashCode() + b.g(j10, iHashCode, 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: iconColor-WaAFU9c$revenuecatui_defaultsRelease, reason: not valid java name */
    public final long m594iconColorWaAFU9c$revenuecatui_defaultsRelease(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.checkedIconColor : this.uncheckedIconColor;
        }
        return z11 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    public final ColorStyle thumbColor$revenuecatui_defaultsRelease(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.checkedThumbColor : this.uncheckedThumbColor;
        }
        return z11 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SwitchColors(checkedThumbColor=");
        sb.append(this.checkedThumbColor);
        sb.append(", checkedTrackColor=");
        sb.append(this.checkedTrackColor);
        sb.append(", checkedBorderColor=");
        sb.append(this.checkedBorderColor);
        sb.append(", checkedIconColor=");
        b.u(this.checkedIconColor, ", uncheckedThumbColor=", sb);
        sb.append(this.uncheckedThumbColor);
        sb.append(", uncheckedTrackColor=");
        sb.append(this.uncheckedTrackColor);
        sb.append(", uncheckedBorderColor=");
        sb.append(this.uncheckedBorderColor);
        sb.append(", uncheckedIconColor=");
        b.u(this.uncheckedIconColor, ", disabledCheckedThumbColor=", sb);
        sb.append(this.disabledCheckedThumbColor);
        sb.append(", disabledCheckedTrackColor=");
        sb.append(this.disabledCheckedTrackColor);
        sb.append(", disabledCheckedBorderColor=");
        sb.append(this.disabledCheckedBorderColor);
        sb.append(", disabledCheckedIconColor=");
        b.u(this.disabledCheckedIconColor, ", disabledUncheckedThumbColor=", sb);
        sb.append(this.disabledUncheckedThumbColor);
        sb.append(", disabledUncheckedTrackColor=");
        sb.append(this.disabledUncheckedTrackColor);
        sb.append(", disabledUncheckedBorderColor=");
        sb.append(this.disabledUncheckedBorderColor);
        sb.append(", disabledUncheckedIconColor=");
        sb.append((Object) C2096x.i(this.disabledUncheckedIconColor));
        sb.append(')');
        return sb.toString();
    }

    public final ColorStyle trackColor$revenuecatui_defaultsRelease(boolean z10, boolean z11) {
        if (z10) {
            return z11 ? this.checkedTrackColor : this.uncheckedTrackColor;
        }
        return z11 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    private SwitchColors(ColorStyle checkedThumbColor, ColorStyle checkedTrackColor, ColorStyle checkedBorderColor, long j10, ColorStyle uncheckedThumbColor, ColorStyle uncheckedTrackColor, ColorStyle uncheckedBorderColor, long j11, ColorStyle disabledCheckedThumbColor, ColorStyle disabledCheckedTrackColor, ColorStyle disabledCheckedBorderColor, long j12, ColorStyle disabledUncheckedThumbColor, ColorStyle disabledUncheckedTrackColor, ColorStyle disabledUncheckedBorderColor, long j13) {
        m.f(checkedThumbColor, "checkedThumbColor");
        m.f(checkedTrackColor, "checkedTrackColor");
        m.f(checkedBorderColor, "checkedBorderColor");
        m.f(uncheckedThumbColor, "uncheckedThumbColor");
        m.f(uncheckedTrackColor, "uncheckedTrackColor");
        m.f(uncheckedBorderColor, "uncheckedBorderColor");
        m.f(disabledCheckedThumbColor, "disabledCheckedThumbColor");
        m.f(disabledCheckedTrackColor, "disabledCheckedTrackColor");
        m.f(disabledCheckedBorderColor, "disabledCheckedBorderColor");
        m.f(disabledUncheckedThumbColor, "disabledUncheckedThumbColor");
        m.f(disabledUncheckedTrackColor, "disabledUncheckedTrackColor");
        m.f(disabledUncheckedBorderColor, "disabledUncheckedBorderColor");
        this.checkedThumbColor = checkedThumbColor;
        this.checkedTrackColor = checkedTrackColor;
        this.checkedBorderColor = checkedBorderColor;
        this.checkedIconColor = j10;
        this.uncheckedThumbColor = uncheckedThumbColor;
        this.uncheckedTrackColor = uncheckedTrackColor;
        this.uncheckedBorderColor = uncheckedBorderColor;
        this.uncheckedIconColor = j11;
        this.disabledCheckedThumbColor = disabledCheckedThumbColor;
        this.disabledCheckedTrackColor = disabledCheckedTrackColor;
        this.disabledCheckedBorderColor = disabledCheckedBorderColor;
        this.disabledCheckedIconColor = j12;
        this.disabledUncheckedThumbColor = disabledUncheckedThumbColor;
        this.disabledUncheckedTrackColor = disabledUncheckedTrackColor;
        this.disabledUncheckedBorderColor = disabledUncheckedBorderColor;
        this.disabledUncheckedIconColor = j13;
    }
}
