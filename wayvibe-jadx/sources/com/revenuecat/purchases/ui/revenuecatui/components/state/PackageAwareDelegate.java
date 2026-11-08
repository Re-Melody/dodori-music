package com.revenuecat.purchases.ui.revenuecatui.components.state;

import U.C0880d;
import U.Y0;
import Z8.a;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageAwareDelegate {
    public static final int $stable = 8;
    private final Y0 isSelected$delegate;
    private final Y0 offerEligibility$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final PackageContext style;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate$isSelected$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // Z8.a
        public final Boolean invoke() {
            return Boolean.valueOf(PackageAwareDelegate.this.style.computeIsSelected((PaywallState.Loaded.Components.SelectedPackageInfo) PackageAwareDelegate.this.selectedPackageInfoProvider.invoke(), ((Number) PackageAwareDelegate.this.selectedTabIndexProvider.invoke()).intValue()));
        }
    }

    public PackageAwareDelegate(PackageContext style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider) {
        m.f(style, "style");
        m.f(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        m.f(selectedTabIndexProvider, "selectedTabIndexProvider");
        m.f(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.isSelected$delegate = C0880d.D(new AnonymousClass2());
        this.offerEligibility$delegate = C0880d.D(new PackageAwareDelegate$offerEligibility$2(this));
    }

    public final OfferEligibility getOfferEligibility() {
        return (OfferEligibility) this.offerEligibility$delegate.getValue();
    }

    public final boolean isSelected() {
        return ((Boolean) this.isSelected$delegate.getValue()).booleanValue();
    }
}
