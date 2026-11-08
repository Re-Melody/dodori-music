package com.revenuecat.purchases.ui.revenuecatui;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.ui.revenuecatui.helpers.CancellableContinuationExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseLogicWithCallback$performPurchase$2$1 extends n implements c {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseLogicWithCallback$performPurchase$2$1(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchaseLogicResult) obj);
        return D.f8402a;
    }

    public final void invoke(PurchaseLogicResult result) {
        m.f(result, "result");
        CancellableContinuationExtensionsKt.safeResume(this.$continuation, result);
    }
}
