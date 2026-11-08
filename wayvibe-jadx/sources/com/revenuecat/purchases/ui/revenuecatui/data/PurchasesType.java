package com.revenuecat.purchases.ui.revenuecatui.data;

import Q8.d;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.events.FeatureEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;

/* JADX INFO: loaded from: classes2.dex */
public interface PurchasesType {

    public static final class DefaultImpls {
    }

    static /* synthetic */ Object awaitCustomerInfo$default(PurchasesType purchasesType, CacheFetchPolicy cacheFetchPolicy, d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitCustomerInfo");
        }
        if ((i10 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.m27default();
        }
        return purchasesType.awaitCustomerInfo(cacheFetchPolicy, dVar);
    }

    Object awaitCreateSupportTicket(String str, String str2, d dVar);

    Object awaitCustomerCenterConfigData(d dVar);

    Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, d dVar);

    Object awaitGetProduct(String str, String str2, d dVar);

    Object awaitGetUiConfig(d dVar);

    Object awaitGetVirtualCurrencies(d dVar);

    Object awaitGetWorkflow(String str, d dVar);

    Object awaitOfferings(d dVar);

    Object awaitPurchase(PurchaseParams.Builder builder, d dVar);

    Object awaitRestore(d dVar);

    Object awaitSyncPurchases(d dVar);

    String getAppUserID();

    CustomerCenterListener getCustomerCenterListener();

    String getPreferredUILocaleOverride();

    PurchasesAreCompletedBy getPurchasesAreCompletedBy();

    String getStorefrontCountryCode();

    void invalidateVirtualCurrenciesCache();

    Object resolveWorkflow(String str, d dVar);

    void track(FeatureEvent featureEvent);
}
