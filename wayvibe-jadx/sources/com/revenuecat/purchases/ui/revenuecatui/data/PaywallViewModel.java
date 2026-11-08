package com.revenuecat.purchases.ui.revenuecatui.data;

import Q.F;
import Q8.d;
import U.Y0;
import android.app.Activity;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.common.workflows.WorkflowTriggerType;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.paywalls.events.PaywallComponentInteractionData;
import com.revenuecat.purchases.paywalls.events.PaywallComponentType;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p151n9.S;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallViewModel {

    public static final class DefaultImpls {
        @Deprecated
        public static void trackComponentInteraction(PaywallViewModel paywallViewModel, PaywallComponentType componentType, String str, String componentValue, String str2) {
            m.f(componentType, "componentType");
            m.f(componentValue, "componentValue");
            PaywallViewModel.super.trackComponentInteraction(componentType, str, componentValue, str2);
        }
    }

    static /* synthetic */ void closePaywall$default(PaywallViewModel paywallViewModel, PaywallResult paywallResult, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePaywall");
        }
        if ((i10 & 1) != 0) {
            paywallResult = null;
        }
        paywallViewModel.closePaywall(paywallResult);
    }

    static /* synthetic */ Object handlePackagePurchase$default(PaywallViewModel paywallViewModel, Activity activity, Package r10, ResolvedOffer resolvedOffer, d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePackagePurchase");
        }
        if ((i10 & 4) != 0) {
            resolvedOffer = null;
        }
        return paywallViewModel.handlePackagePurchase(activity, r10, resolvedOffer, dVar);
    }

    static /* synthetic */ void trackComponentInteraction$default(PaywallViewModel paywallViewModel, PaywallComponentType paywallComponentType, String str, String str2, String str3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackComponentInteraction");
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        paywallViewModel.trackComponentInteraction(paywallComponentType, str, str2, str3);
    }

    void clearActionError();

    void closePaywall(PaywallResult paywallResult);

    Y0 getActionError();

    Y0 getActionInProgress();

    Y0 getPurchaseCompleted();

    ResourceProvider getResourceProvider();

    S getState();

    String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout);

    Y0 getWorkflowState();

    boolean handleBackNavigation();

    Object handlePackagePurchase(Activity activity, Package r10, ResolvedOffer resolvedOffer, d dVar);

    Object handleRestorePurchases(d dVar);

    void handleWorkflowAction(String str, WorkflowTriggerType workflowTriggerType);

    void invalidateCustomerInfoCache();

    void notifyUrlOpened(String str);

    void notifyWebCheckoutOpened();

    void onPaywallDismissed();

    void onPaywallPresented();

    void onTransitionComplete(int i10);

    void preloadExitOffering();

    void purchaseSelectedPackage(Activity activity);

    void refreshStateIfColorsChanged(F f10, boolean z10);

    void refreshStateIfLocaleChanged();

    void restorePurchases();

    void selectPackage(TemplateConfiguration.PackageInfo packageInfo);

    void trackComponentInteraction(PaywallComponentInteractionData paywallComponentInteractionData);

    default void trackComponentInteraction(PaywallComponentType componentType, String str, String componentValue, String str2) {
        m.f(componentType, "componentType");
        m.f(componentValue, "componentValue");
        trackComponentInteraction(new PaywallComponentInteractionData(componentType, str, componentValue, str2, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524272, (f) null));
    }

    void trackExitOffer(ExitOfferType exitOfferType, String str);

    void trackPaywallImpressionIfNeeded();
}
