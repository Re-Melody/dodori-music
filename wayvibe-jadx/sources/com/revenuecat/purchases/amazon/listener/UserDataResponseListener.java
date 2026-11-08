package com.revenuecat.purchases.amazon.listener;

import Z8.c;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public interface UserDataResponseListener extends PurchasingListener {

    public static final class DefaultImpls {
        @Deprecated
        public static void onProductDataResponse(UserDataResponseListener userDataResponseListener, ProductDataResponse response) {
            m.f(response, "response");
            UserDataResponseListener.super.onProductDataResponse(response);
        }

        @Deprecated
        public static void onPurchaseResponse(UserDataResponseListener userDataResponseListener, PurchaseResponse response) {
            m.f(response, "response");
            UserDataResponseListener.super.onPurchaseResponse(response);
        }

        @Deprecated
        public static void onPurchaseUpdatesResponse(UserDataResponseListener userDataResponseListener, PurchaseUpdatesResponse response) {
            m.f(response, "response");
            UserDataResponseListener.super.onPurchaseUpdatesResponse(response);
        }
    }

    void getUserData(c cVar, c cVar2);

    default void onProductDataResponse(ProductDataResponse response) {
        m.f(response, "response");
    }

    default void onPurchaseResponse(PurchaseResponse response) {
        m.f(response, "response");
    }

    default void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response) {
        m.f(response, "response");
    }
}
