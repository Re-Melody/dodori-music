package com.revenuecat.purchases.common;

import M8.l;
import N8.y;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    public static /* synthetic */ void CustomerCenterCallback$annotations() {
    }

    public static /* synthetic */ void OfferingsCallback$annotations() {
    }

    public static /* synthetic */ void OfferingsSuccessCallback$annotations() {
    }

    public static /* synthetic */ void ProductEntitlementCallback$annotations() {
    }

    public static /* synthetic */ void RewardVerificationResultCallback$annotations() {
    }

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        m.f(pricingPhase, "<this>");
        return y.g0(new l("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), new l("billingCycleCount", pricingPhase.getBillingCycleCount()), new l("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), new l("formattedPrice", pricingPhase.getPrice().getFormatted()), new l("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), new l("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode()));
    }
}
