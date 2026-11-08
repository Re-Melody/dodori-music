package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Q.F;
import Q8.d;
import U.Y0;
import Z8.a;
import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import p151n9.S;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomerCenterViewModel {

    public static final class DefaultImpls {
    }

    static /* synthetic */ Object loadAndDisplayPromotionalOffer$default(CustomerCenterViewModel customerCenterViewModel, Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAndDisplayPromotionalOffer");
        }
        if ((i10 & 16) != 0) {
            purchaseInformation = null;
        }
        return customerCenterViewModel.loadAndDisplayPromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, dVar);
    }

    static /* synthetic */ void openURL$default(CustomerCenterViewModel customerCenterViewModel, Context context, String str, CustomerCenterConfigData.HelpPath.OpenMethod openMethod, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openURL");
        }
        if ((i10 & 4) != 0) {
            openMethod = CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL;
        }
        customerCenterViewModel.openURL(context, str, openMethod);
    }

    void clearActionError();

    void contactSupport(Context context, String str);

    void dismissPromotionalOffer(Context context, CustomerCenterConfigData.HelpPath helpPath);

    Object dismissRestoreDialog(d dVar);

    void dismissSupportTicketSuccessSnackbar();

    Y0 getActionError();

    S getState();

    Object loadAndDisplayPromotionalOffer(Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, d dVar);

    @InternalRevenueCatAPI
    Object loadCustomerCenter(d dVar);

    Object onAcceptedPromotionalOffer(SubscriptionOption subscriptionOption, Activity activity, d dVar);

    void onActivityResumed();

    void onActivityStarted();

    void onActivityStopped(boolean z10);

    void onCustomActionSelected(CustomActionData customActionData);

    void onNavigationButtonPressed(Context context, a aVar);

    void openURL(Context context, String str, CustomerCenterConfigData.HelpPath.OpenMethod openMethod);

    void pathButtonPressed(Context context, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation);

    void refreshColors(F f10, boolean z10);

    Object refreshCustomerCenter(d dVar);

    void refreshStateIfLocaleChanged();

    Object restorePurchases(d dVar);

    void selectPurchase(PurchaseInformation purchaseInformation);

    void showCreateSupportTicket();

    void showPaywall(Context context);

    void showVirtualCurrencyBalances();

    void trackImpressionIfNeeded();
}
