package com.revenuecat.purchases.ui.revenuecatui;

import M8.InterfaceC0641c;
import Q8.d;
import android.app.Activity;
import com.revenuecat.purchases.Package;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0641c
public interface PurchaseLogic extends PaywallPurchaseLogic {

    public static final class DefaultImpls {
        @Deprecated
        public static Object performPurchase(PurchaseLogic purchaseLogic, Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, d dVar) {
            return PurchaseLogic.super.performPurchase(activity, paywallPurchaseLogicParams, dVar);
        }
    }

    static /* synthetic */ Object performPurchase$suspendImpl(PurchaseLogic purchaseLogic, Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, d dVar) {
        return purchaseLogic.performPurchase(activity, paywallPurchaseLogicParams.getRcPackage(), dVar);
    }

    Object performPurchase(Activity activity, Package r10, d dVar);

    @Override // com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic
    default Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, d dVar) {
        return performPurchase$suspendImpl(this, activity, paywallPurchaseLogicParams, dVar);
    }
}
