package com.revenuecat.purchases.ui.revenuecatui.components.state;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageContext {

    public static final class DefaultImpls {
        @Deprecated
        public static String getPackageUniqueId(PackageContext packageContext) {
            return PackageContext.super.getPackageUniqueId();
        }

        @Deprecated
        public static /* synthetic */ OfferEligibility resolveOfferEligibility(PackageContext packageContext, OfferEligibility selectedOfferEligibility) {
            m.f(selectedOfferEligibility, "selectedOfferEligibility");
            return PackageContext.super.resolveOfferEligibility(selectedOfferEligibility);
        }
    }

    default boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i10) {
        Package rcPackage;
        String packageUniqueId = getPackageUniqueId();
        Package rcPackage2 = getRcPackage();
        Integer tabIndex = getTabIndex();
        String identifier = null;
        if (packageUniqueId != null) {
            return packageUniqueId.equals(selectedPackageInfo != null ? selectedPackageInfo.getUniqueId() : null);
        }
        if (rcPackage2 == null) {
            return tabIndex != null && tabIndex.intValue() == i10;
        }
        String identifier2 = rcPackage2.getIdentifier();
        if (selectedPackageInfo != null && (rcPackage = selectedPackageInfo.getRcPackage()) != null) {
            identifier = rcPackage.getIdentifier();
        }
        return m.b(identifier2, identifier);
    }

    OfferEligibility getOfferEligibility();

    default String getPackageUniqueId() {
        SubscriptionOption option;
        Package rcPackage = getRcPackage();
        String id = null;
        if (rcPackage == null) {
            return null;
        }
        ResolvedOffer resolvedOffer = getResolvedOffer();
        ResolvedOffer.ConfiguredOffer configuredOffer = resolvedOffer instanceof ResolvedOffer.ConfiguredOffer ? (ResolvedOffer.ConfiguredOffer) resolvedOffer : null;
        if (configuredOffer != null && (option = configuredOffer.getOption()) != null) {
            id = option.getId();
        }
        if (id == null) {
            return rcPackage.getIdentifier();
        }
        return rcPackage.getIdentifier() + ':' + id;
    }

    Package getRcPackage();

    ResolvedOffer getResolvedOffer();

    Integer getTabIndex();

    /* synthetic */ default OfferEligibility resolveOfferEligibility(OfferEligibility selectedOfferEligibility) {
        m.f(selectedOfferEligibility, "selectedOfferEligibility");
        OfferEligibility offerEligibility = getOfferEligibility();
        return offerEligibility == null ? selectedOfferEligibility : offerEligibility;
    }
}
