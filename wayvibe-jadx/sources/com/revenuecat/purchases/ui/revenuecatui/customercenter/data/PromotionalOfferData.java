package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import B2.AbstractC0112b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.SubscriptionOption;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionalOfferData {
    public static final int $stable = 8;
    private final CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer;
    private final String localizedPricingPhasesDescription;
    private final CustomerCenterConfigData.HelpPath originalPath;
    private final SubscriptionOption subscriptionOption;

    public PromotionalOfferData(CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath originalPath, String localizedPricingPhasesDescription) {
        m.f(configuredPromotionalOffer, "configuredPromotionalOffer");
        m.f(subscriptionOption, "subscriptionOption");
        m.f(originalPath, "originalPath");
        m.f(localizedPricingPhasesDescription, "localizedPricingPhasesDescription");
        this.configuredPromotionalOffer = configuredPromotionalOffer;
        this.subscriptionOption = subscriptionOption;
        this.originalPath = originalPath;
        this.localizedPricingPhasesDescription = localizedPricingPhasesDescription;
    }

    public static /* synthetic */ PromotionalOfferData copy$default(PromotionalOfferData promotionalOfferData, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath helpPath, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            promotionalOffer = promotionalOfferData.configuredPromotionalOffer;
        }
        if ((i10 & 2) != 0) {
            subscriptionOption = promotionalOfferData.subscriptionOption;
        }
        if ((i10 & 4) != 0) {
            helpPath = promotionalOfferData.originalPath;
        }
        if ((i10 & 8) != 0) {
            str = promotionalOfferData.localizedPricingPhasesDescription;
        }
        return promotionalOfferData.copy(promotionalOffer, subscriptionOption, helpPath, str);
    }

    public final CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer component1() {
        return this.configuredPromotionalOffer;
    }

    public final SubscriptionOption component2() {
        return this.subscriptionOption;
    }

    public final CustomerCenterConfigData.HelpPath component3() {
        return this.originalPath;
    }

    public final String component4() {
        return this.localizedPricingPhasesDescription;
    }

    public final PromotionalOfferData copy(CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer configuredPromotionalOffer, SubscriptionOption subscriptionOption, CustomerCenterConfigData.HelpPath originalPath, String localizedPricingPhasesDescription) {
        m.f(configuredPromotionalOffer, "configuredPromotionalOffer");
        m.f(subscriptionOption, "subscriptionOption");
        m.f(originalPath, "originalPath");
        m.f(localizedPricingPhasesDescription, "localizedPricingPhasesDescription");
        return new PromotionalOfferData(configuredPromotionalOffer, subscriptionOption, originalPath, localizedPricingPhasesDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionalOfferData)) {
            return false;
        }
        PromotionalOfferData promotionalOfferData = (PromotionalOfferData) obj;
        return m.b(this.configuredPromotionalOffer, promotionalOfferData.configuredPromotionalOffer) && m.b(this.subscriptionOption, promotionalOfferData.subscriptionOption) && m.b(this.originalPath, promotionalOfferData.originalPath) && m.b(this.localizedPricingPhasesDescription, promotionalOfferData.localizedPricingPhasesDescription);
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer getConfiguredPromotionalOffer() {
        return this.configuredPromotionalOffer;
    }

    public final /* synthetic */ String getLocalizedPricingPhasesDescription() {
        return this.localizedPricingPhasesDescription;
    }

    public final /* synthetic */ CustomerCenterConfigData.HelpPath getOriginalPath() {
        return this.originalPath;
    }

    public final /* synthetic */ SubscriptionOption getSubscriptionOption() {
        return this.subscriptionOption;
    }

    public int hashCode() {
        return this.localizedPricingPhasesDescription.hashCode() + ((this.originalPath.hashCode() + ((this.subscriptionOption.hashCode() + (this.configuredPromotionalOffer.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PromotionalOfferData(configuredPromotionalOffer=");
        sb.append(this.configuredPromotionalOffer);
        sb.append(", subscriptionOption=");
        sb.append(this.subscriptionOption);
        sb.append(", originalPath=");
        sb.append(this.originalPath);
        sb.append(", localizedPricingPhasesDescription=");
        return AbstractC0112b.j(sb, this.localizedPricingPhasesDescription, ')');
    }
}
