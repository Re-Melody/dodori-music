package com.revenuecat.purchases.identity;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityManager$aliasCurrentUserIdTo$2$2 extends n implements c {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$aliasCurrentUserIdTo$2$2(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return D.f8402a;
    }

    public final void invoke(PurchasesError error) {
        m.f(error, "error");
        CancellableContinuationExtensionsKt.safeResumeWithException(this.$continuation, new PurchasesException(error));
    }
}
