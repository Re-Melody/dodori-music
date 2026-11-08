package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Z8.c;
import com.revenuecat.purchases.models.Period;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PricingPhaseExtensionsKt$productOfferPeriodInYears$1 extends n implements c {
    public static final PricingPhaseExtensionsKt$productOfferPeriodInYears$1 INSTANCE = new PricingPhaseExtensionsKt$productOfferPeriodInYears$1();

    public PricingPhaseExtensionsKt$productOfferPeriodInYears$1() {
        super(1);
    }

    @Override // Z8.c
    public final String invoke(Period productOfferPeriodInPeriodUnit) {
        m.f(productOfferPeriodInPeriodUnit, "$this$productOfferPeriodInPeriodUnit");
        return PeriodExtensionsKt.getRoundedValueInYears(productOfferPeriodInPeriodUnit);
    }
}
