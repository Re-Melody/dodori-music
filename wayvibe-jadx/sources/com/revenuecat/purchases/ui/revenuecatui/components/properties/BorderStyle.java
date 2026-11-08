package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p028c1.e;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class BorderStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float width;

    public /* synthetic */ BorderStyle(float f10, ColorStyle colorStyle, f fVar) {
        this(f10, colorStyle);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStyle m406copyD5KLDUw$default(BorderStyle borderStyle, float f10, ColorStyle colorStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStyle.width;
        }
        if ((i10 & 2) != 0) {
            colorStyle = borderStyle.color;
        }
        return borderStyle.m408copyD5KLDUw(f10, colorStyle);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m407component1D9Ej5fM() {
        return this.width;
    }

    public final ColorStyle component2() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStyle m408copyD5KLDUw(float f10, ColorStyle color) {
        m.f(color, "color");
        return new BorderStyle(f10, color, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) obj;
        return e.a(this.width, borderStyle.width) && m.b(this.color, borderStyle.color);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m409getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return this.color.hashCode() + (Float.hashCode(this.width) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BorderStyle(width=");
        b.r(this.width, ", color=", sb);
        sb.append(this.color);
        sb.append(')');
        return sb.toString();
    }

    private BorderStyle(float f10, ColorStyle color) {
        m.f(color, "color");
        this.width = f10;
        this.color = color;
    }
}
