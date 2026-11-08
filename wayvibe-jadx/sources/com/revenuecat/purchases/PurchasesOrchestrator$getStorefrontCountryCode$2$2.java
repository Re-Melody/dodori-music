package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$getStorefrontCountryCode$2$2 extends n implements Z8.c {
    final /* synthetic */ GetStorefrontCallback $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$getStorefrontCountryCode$2$2(GetStorefrontCallback getStorefrontCallback) {
        super(1);
        this.$callback = getStorefrontCallback;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }

    public final void invoke(PurchasesError error) {
        m.f(error, "error");
        LogUtilsKt.errorLog(error);
        this.$callback.onError(error);
    }
}
