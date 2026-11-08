package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import F0.J;
import M8.D;
import Z8.c;
import androidx.compose.ui.draw.a;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p067g0.r;
import p110k0.d;
import p110k0.g;
import p143n0.Q;
import p143n0.W;
import p143n0.c0;
import p163p0.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OverlayKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements c {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ c0 $shape;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$overlay$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00571 extends n implements c {
            final /* synthetic */ ColorStyle $color;
            final /* synthetic */ Q $outline;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00571(ColorStyle colorStyle, Q q5) {
                super(1);
                this.$color = colorStyle;
                this.$outline = q5;
            }

            @Override // Z8.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((p163p0.c) obj);
                return D.f8402a;
            }

            public final void invoke(p163p0.c onDrawWithContent) {
                m.f(onDrawWithContent, "$this$onDrawWithContent");
                ((J) onDrawWithContent).b();
                ColorStyle colorStyle = this.$color;
                if (colorStyle instanceof ColorStyle.Solid) {
                    W.r(onDrawWithContent, this.$outline, ((ColorStyle.Solid) colorStyle).m428unboximpl());
                } else if (colorStyle instanceof ColorStyle.Gradient) {
                    W.q(onDrawWithContent, this.$outline, ((ColorStyle.Gradient) colorStyle).m420unboximpl(), 0.0f, 60);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c0 c0Var, ColorStyle colorStyle) {
            super(1);
            this.$shape = c0Var;
            this.$color = colorStyle;
        }

        @Override // Z8.c
        public final g invoke(d drawWithCache) {
            m.f(drawWithCache, "$this$drawWithCache");
            return drawWithCache.b(new C00571(this.$color, this.$shape.mo6createOutlinePq9zytI(drawWithCache.f21549a.c(), drawWithCache.f21549a.getLayoutDirection(), drawWithCache)));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt$underlay$1, reason: invalid class name and case insensitive filesystem */
    public static final class C15571 extends n implements c {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ c0 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15571(c0 c0Var, ColorStyle colorStyle) {
            super(1);
            this.$shape = c0Var;
            this.$color = colorStyle;
        }

        @Override // Z8.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e) obj);
            return D.f8402a;
        }

        public final void invoke(e drawBehind) {
            m.f(drawBehind, "$this$drawBehind");
            Q qMo6createOutlinePq9zytI = this.$shape.mo6createOutlinePq9zytI(drawBehind.c(), drawBehind.getLayoutDirection(), drawBehind);
            ColorStyle colorStyle = this.$color;
            if (colorStyle instanceof ColorStyle.Solid) {
                W.r(drawBehind, qMo6createOutlinePq9zytI, ((ColorStyle.Solid) colorStyle).m428unboximpl());
            } else if (colorStyle instanceof ColorStyle.Gradient) {
                W.q(drawBehind, qMo6createOutlinePq9zytI, ((ColorStyle.Gradient) colorStyle).m420unboximpl(), 0.0f, 60);
            }
        }
    }

    public static final /* synthetic */ r overlay(r rVar, ColorStyle color, c0 shape) {
        m.f(rVar, "<this>");
        m.f(color, "color");
        m.f(shape, "shape");
        return a.b(rVar, new AnonymousClass1(shape, color));
    }

    public static /* synthetic */ r overlay$default(r rVar, ColorStyle colorStyle, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = W.f22719a;
        }
        return overlay(rVar, colorStyle, c0Var);
    }

    public static final /* synthetic */ r underlay(r rVar, ColorStyle color, c0 shape) {
        m.f(rVar, "<this>");
        m.f(color, "color");
        m.f(shape, "shape");
        return a.a(rVar, new C15571(shape, color));
    }

    public static /* synthetic */ r underlay$default(r rVar, ColorStyle colorStyle, c0 c0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = W.f22719a;
        }
        return underlay(rVar, colorStyle, c0Var);
    }
}
