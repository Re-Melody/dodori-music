package com.revenuecat.purchases.models;

import N8.s;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.checkpoints.CheckpointWorkflowResolverImpl;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final InstallmentsInfo installmentsInfo;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final PurchasingData purchasingData;
    private final List<String> tags;

    public TestSubscriptionOption(List<PricingPhase> pricingPhases, String basePlanId, List<String> tags, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData) {
        m.f(pricingPhases, "pricingPhases");
        m.f(basePlanId, "basePlanId");
        m.f(tags, "tags");
        m.f(presentedOfferingContext, "presentedOfferingContext");
        m.f(purchasingData, "purchasingData");
        this.pricingPhases = pricingPhases;
        this.basePlanId = basePlanId;
        this.tags = tags;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = installmentsInfo;
        this.purchasingData = purchasingData;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        return getPricingPhases().size() == 1 ? this.basePlanId : b.m(new StringBuilder(), this.basePlanId, ":testOfferId");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return this.purchasingData;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public /* synthetic */ TestSubscriptionOption(List list, String str, List list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, PurchasingData purchasingData, int i10, f fVar) {
        this(list, (i10 & 2) != 0 ? "testBasePlanId" : str, (i10 & 4) != 0 ? s.f8650a : list2, (i10 & 8) != 0 ? new PresentedOfferingContext(CheckpointWorkflowResolverImpl.OFFERING_STEP_TYPE) : presentedOfferingContext, (i10 & 16) != 0 ? null : installmentsInfo, purchasingData);
    }
}
