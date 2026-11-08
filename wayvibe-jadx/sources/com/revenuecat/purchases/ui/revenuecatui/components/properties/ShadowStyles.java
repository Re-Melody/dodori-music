package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p028c1.e;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ShadowStyles {
    public static final int $stable = 0;
    private final ColorStyles colors;
    private final float radius;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f18892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f18893y;

    public /* synthetic */ ShadowStyles(ColorStyles colorStyles, float f10, float f11, float f12, f fVar) {
        this(colorStyles, f10, f11, f12);
    }

    /* JADX INFO: renamed from: copy-qQh39rQ$default, reason: not valid java name */
    public static /* synthetic */ ShadowStyles m446copyqQh39rQ$default(ShadowStyles shadowStyles, ColorStyles colorStyles, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            colorStyles = shadowStyles.colors;
        }
        if ((i10 & 2) != 0) {
            f10 = shadowStyles.radius;
        }
        if ((i10 & 4) != 0) {
            f11 = shadowStyles.f18892x;
        }
        if ((i10 & 8) != 0) {
            f12 = shadowStyles.f18893y;
        }
        return shadowStyles.m450copyqQh39rQ(colorStyles, f10, f11, f12);
    }

    public final ColorStyles component1() {
        return this.colors;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m447component2D9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m448component3D9Ej5fM() {
        return this.f18892x;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m449component4D9Ej5fM() {
        return this.f18893y;
    }

    /* JADX INFO: renamed from: copy-qQh39rQ, reason: not valid java name */
    public final ShadowStyles m450copyqQh39rQ(ColorStyles colors, float f10, float f11, float f12) {
        m.f(colors, "colors");
        return new ShadowStyles(colors, f10, f11, f12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowStyles)) {
            return false;
        }
        ShadowStyles shadowStyles = (ShadowStyles) obj;
        return m.b(this.colors, shadowStyles.colors) && e.a(this.radius, shadowStyles.radius) && e.a(this.f18892x, shadowStyles.f18892x) && e.a(this.f18893y, shadowStyles.f18893y);
    }

    public final /* synthetic */ ColorStyles getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m451getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m452getXD9Ej5fM() {
        return this.f18892x;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m453getYD9Ej5fM() {
        return this.f18893y;
    }

    public int hashCode() {
        return Float.hashCode(this.f18893y) + b.b(this.f18892x, b.b(this.radius, this.colors.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShadowStyles(colors=");
        sb.append(this.colors);
        sb.append(", radius=");
        b.r(this.radius, ", x=", sb);
        b.r(this.f18892x, ", y=", sb);
        sb.append((Object) e.b(this.f18893y));
        sb.append(')');
        return sb.toString();
    }

    private ShadowStyles(ColorStyles colors, float f10, float f11, float f12) {
        m.f(colors, "colors");
        this.colors = colors;
        this.radius = f10;
        this.f18892x = f11;
        this.f18893y = f12;
    }
}
