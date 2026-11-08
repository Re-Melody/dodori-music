package com.revenuecat.purchases;

import N8.u;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.utils.PrewarmTargetOfferingsKt;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2 extends n implements Z8.a {
    final /* synthetic */ OfferingsCache $offeringsCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2(OfferingsCache offeringsCache) {
        super(0);
        this.$offeringsCache = offeringsCache;
    }

    @Override // Z8.a
    public final Set<String> invoke() {
        Offerings cachedOfferings = this.$offeringsCache.getCachedOfferings();
        Set<String> setPrewarmTargetOfferingIds = cachedOfferings != null ? PrewarmTargetOfferingsKt.prewarmTargetOfferingIds(cachedOfferings) : null;
        return setPrewarmTargetOfferingIds == null ? u.f8652a : setPrewarmTargetOfferingIds;
    }
}
