package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesExtensionsKt$awaitCustomerInfo$2$1 extends n implements Z8.c {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitCustomerInfo$2$1(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }

    public final void invoke(PurchasesError it) {
        m.f(it, "it");
        CancellableContinuationExtensionsKt.safeResumeWithException(this.$continuation, new PurchasesException(it));
    }
}
