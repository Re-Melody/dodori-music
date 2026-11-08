package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import N8.m;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import p017b1.a;
import p085h9.g;
import p085h9.h;
import p085h9.k;

/* JADX INFO: loaded from: classes2.dex */
final class DistributionProvider implements a {
    private final h values;

    public DistributionProvider() {
        h hVarF0 = m.f0(FlexDistribution.values());
        DistributionProvider$values$1 transform = DistributionProvider$values$1.INSTANCE;
        kotlin.jvm.internal.m.f(transform, "transform");
        k kVar = k.f20359a;
        this.values = new g(hVarF0, transform, 0);
    }

    @Override // p017b1.a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // p017b1.a
    public h getValues() {
        return this.values;
    }
}
