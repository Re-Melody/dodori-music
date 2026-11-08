package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import androidx.lifecycle.Z;
import androidx.lifecycle.d0;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class VirtualCurrencyBalancesScreenViewModelFactory extends d0 {
    public static final int $stable = 8;
    private final PurchasesType purchases;

    public VirtualCurrencyBalancesScreenViewModelFactory(PurchasesType purchases) {
        m.f(purchases, "purchases");
        this.purchases = purchases;
    }

    @Override // androidx.lifecycle.d0, androidx.lifecycle.b0
    public <T extends Z> T create(Class<T> modelClass) {
        m.f(modelClass, "modelClass");
        return new VirtualCurrencyBalancesScreenViewModel(this.purchases);
    }
}
