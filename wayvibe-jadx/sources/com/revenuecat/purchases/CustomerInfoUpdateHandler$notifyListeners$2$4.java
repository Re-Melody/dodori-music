package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfoUpdateHandler$notifyListeners$2$4 extends n implements Z8.a {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoUpdateHandler$notifyListeners$2$4(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // Z8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m46invoke();
        return D.f8402a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m46invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
