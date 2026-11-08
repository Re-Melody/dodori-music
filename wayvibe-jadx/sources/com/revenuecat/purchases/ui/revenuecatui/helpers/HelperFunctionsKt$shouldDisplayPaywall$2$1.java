package com.revenuecat.purchases.ui.revenuecatui.helpers;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes2.dex */
public final class HelperFunctionsKt$shouldDisplayPaywall$2$1 extends n implements c {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelperFunctionsKt$shouldDisplayPaywall$2$1(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return D.f8402a;
    }

    public final void invoke(boolean z10) {
        CancellableContinuationExtensionsKt.safeResume(this.$continuation, Boolean.valueOf(z10));
    }
}
