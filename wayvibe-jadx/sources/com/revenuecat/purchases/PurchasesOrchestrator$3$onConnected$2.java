package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesOrchestrator$3$onConnected$2 extends n implements Z8.c {
    public static final PurchasesOrchestrator$3$onConnected$2 INSTANCE = new PurchasesOrchestrator$3$onConnected$2();

    public PurchasesOrchestrator$3$onConnected$2() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }

    public final void invoke(PurchasesError error) {
        m.f(error, "error");
        LogUtilsKt.errorLog(error);
    }
}
