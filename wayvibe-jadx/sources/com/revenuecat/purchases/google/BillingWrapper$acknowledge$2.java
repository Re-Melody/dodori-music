package com.revenuecat.purchases.google;

import M8.D;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$acknowledge$2 extends n implements Z8.c {
    public static final BillingWrapper$acknowledge$2 INSTANCE = new BillingWrapper$acknowledge$2();

    public BillingWrapper$acknowledge$2() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        m.f(purchasesError, "<anonymous parameter 0>");
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }
}
