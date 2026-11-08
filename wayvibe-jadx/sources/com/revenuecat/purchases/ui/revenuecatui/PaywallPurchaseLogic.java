package com.revenuecat.purchases.ui.revenuecatui;

import Q8.d;
import android.app.Activity;
import com.revenuecat.purchases.CustomerInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface PaywallPurchaseLogic {
    Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, d dVar);

    Object performRestore(CustomerInfo customerInfo, d dVar);
}
