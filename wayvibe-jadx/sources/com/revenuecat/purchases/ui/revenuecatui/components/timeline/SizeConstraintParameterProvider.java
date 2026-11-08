package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import M8.v;
import N8.m;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.f;
import p017b1.a;
import p085h9.h;

/* JADX INFO: loaded from: classes2.dex */
final class SizeConstraintParameterProvider implements a {
    private final h values = m.f0(new SizeConstraint[]{new SizeConstraint.Fit((v) null, 1, (f) null), SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(100, null)});

    @Override // p017b1.a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p017b1.a
    public h getValues() {
        return this.values;
    }
}
