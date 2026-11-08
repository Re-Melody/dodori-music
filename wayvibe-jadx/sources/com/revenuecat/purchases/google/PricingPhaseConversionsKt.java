package com.revenuecat.purchases.google;

import Z4.C0981n;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(C0981n c0981n) {
        m.f(c0981n, "<this>");
        Period.Factory factory = Period.Factory;
        String billingPeriod = c0981n.f13785d;
        m.e(billingPeriod, "billingPeriod");
        Period periodCreate = factory.create(billingPeriod);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(c0981n.f13787f));
        Integer numValueOf = Integer.valueOf(c0981n.f13786e);
        String formattedPrice = c0981n.f13782a;
        m.e(formattedPrice, "formattedPrice");
        String priceCurrencyCode = c0981n.f13784c;
        m.e(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(formattedPrice, c0981n.f13783b, priceCurrencyCode));
    }
}
