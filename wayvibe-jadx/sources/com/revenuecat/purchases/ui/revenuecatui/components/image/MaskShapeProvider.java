package com.revenuecat.purchases.ui.revenuecatui.components.image;

import N8.m;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import p017b1.a;
import p085h9.h;

/* JADX INFO: loaded from: classes2.dex */
final class MaskShapeProvider implements a {
    private final h values = m.f0(new MaskShape[]{new MaskShape.Rectangle(new CornerRadiuses.Dp(30.0d, 50.0d, 20.0d, 40.0d)), MaskShape.Concave.INSTANCE, MaskShape.Convex.INSTANCE, MaskShape.Circle.INSTANCE});

    @Override // p017b1.a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p017b1.a
    public h getValues() {
        return this.values;
    }
}
