package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends n implements Z8.e {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitPurchase$2$2(InterfaceC2024l interfaceC2024l) {
        super(2);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return D.f8402a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        m.f(purchasesError, "purchasesError");
        CancellableContinuationExtensionsKt.safeResumeWithException(this.$continuation, new PurchasesTransactionException(purchasesError, z10));
    }
}
