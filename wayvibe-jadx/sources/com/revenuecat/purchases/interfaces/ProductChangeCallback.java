package com.revenuecat.purchases.interfaces;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.models.StoreTransaction;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC0641c
public interface ProductChangeCallback extends PurchaseErrorCallback {
    void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo);
}
