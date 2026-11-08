package com.revenuecat.purchases.interfaces;

import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes2.dex */
public interface ManageSubscriptionsCallback {
    void onError(PurchasesError purchasesError);

    void onSuccess();
}
