package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Z8.c;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p085h9.h;

/* JADX INFO: loaded from: classes2.dex */
public final class DistributionProvider$values$1 extends n implements c {
    public static final DistributionProvider$values$1 INSTANCE = new DistributionProvider$values$1();

    public DistributionProvider$values$1() {
        super(1);
    }

    @Override // Z8.c
    public final h invoke(FlexDistribution distribution) {
        m.f(distribution, "distribution");
        return N8.m.f0(new Dimension[]{new Dimension.Horizontal(VerticalAlignment.CENTER, distribution), new Dimension.Vertical(HorizontalAlignment.CENTER, distribution)});
    }
}
