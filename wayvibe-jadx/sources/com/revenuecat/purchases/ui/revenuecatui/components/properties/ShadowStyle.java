package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p028c1.e;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ShadowStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float radius;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f18890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f18891y;

    public /* synthetic */ ShadowStyle(ColorStyle colorStyle, float f10, float f11, float f12, f fVar) {
        this(colorStyle, f10, f11, f12);
    }

    /* JADX INFO: renamed from: copy-qQh39rQ$default, reason: not valid java name */
    public static /* synthetic */ ShadowStyle m438copyqQh39rQ$default(ShadowStyle shadowStyle, ColorStyle colorStyle, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            colorStyle = shadowStyle.color;
        }
        if ((i10 & 2) != 0) {
            f10 = shadowStyle.radius;
        }
        if ((i10 & 4) != 0) {
            f11 = shadowStyle.f18890x;
        }
        if ((i10 & 8) != 0) {
            f12 = shadowStyle.f18891y;
        }
        return shadowStyle.m442copyqQh39rQ(colorStyle, f10, f11, f12);
    }

    public final ColorStyle component1() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m439component2D9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m440component3D9Ej5fM() {
        return this.f18890x;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m441component4D9Ej5fM() {
        return this.f18891y;
    }

    /* JADX INFO: renamed from: copy-qQh39rQ, reason: not valid java name */
    public final ShadowStyle m442copyqQh39rQ(ColorStyle color, float f10, float f11, float f12) {
        m.f(color, "color");
        return new ShadowStyle(color, f10, f11, f12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) obj;
        return m.b(this.color, shadowStyle.color) && e.a(this.radius, shadowStyle.radius) && e.a(this.f18890x, shadowStyle.f18890x) && e.a(this.f18891y, shadowStyle.f18891y);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m443getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m444getXD9Ej5fM() {
        return this.f18890x;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m445getYD9Ej5fM() {
        return this.f18891y;
    }

    public int hashCode() {
        return Float.hashCode(this.f18891y) + b.b(this.f18890x, b.b(this.radius, this.color.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowStyle(color=");
        sb.append(this.color);
        sb.append(", radius=");
        b.r(this.radius, ", x=", sb);
        b.r(this.f18890x, ", y=", sb);
        sb.append((Object) e.b(this.f18891y));
        sb.append(')');
        return sb.toString();
    }

    private ShadowStyle(ColorStyle color, float f10, float f11, float f12) {
        m.f(color, "color");
        this.color = color;
        this.radius = f10;
        this.f18890x = f11;
        this.f18891y = f12;
    }
}
