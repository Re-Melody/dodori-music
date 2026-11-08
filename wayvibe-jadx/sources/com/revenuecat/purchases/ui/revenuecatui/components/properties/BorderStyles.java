package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p028c1.e;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class BorderStyles {
    public static final int $stable = 0;
    private final ColorStyles colors;
    private final float width;

    public /* synthetic */ BorderStyles(float f10, ColorStyles colorStyles, f fVar) {
        this(f10, colorStyles);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStyles m410copyD5KLDUw$default(BorderStyles borderStyles, float f10, ColorStyles colorStyles, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStyles.width;
        }
        if ((i10 & 2) != 0) {
            colorStyles = borderStyles.colors;
        }
        return borderStyles.m412copyD5KLDUw(f10, colorStyles);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m411component1D9Ej5fM() {
        return this.width;
    }

    public final ColorStyles component2() {
        return this.colors;
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStyles m412copyD5KLDUw(float f10, ColorStyles colors) {
        m.f(colors, "colors");
        return new BorderStyles(f10, colors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyles)) {
            return false;
        }
        BorderStyles borderStyles = (BorderStyles) obj;
        return e.a(this.width, borderStyles.width) && m.b(this.colors, borderStyles.colors);
    }

    public final /* synthetic */ ColorStyles getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m413getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return this.colors.hashCode() + (Float.hashCode(this.width) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BorderStyles(width=");
        b.r(this.width, ", colors=", sb);
        sb.append(this.colors);
        sb.append(')');
        return sb.toString();
    }

    private BorderStyles(float f10, ColorStyles colors) {
        m.f(colors, "colors");
        this.width = f10;
        this.colors = colors;
    }
}
