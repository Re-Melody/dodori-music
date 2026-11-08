package com.revenuecat.purchases;

import M8.D;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p119k9.InterfaceC2024l;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2 extends n implements Z8.c {
    final /* synthetic */ InterfaceC2024l $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitStorefrontCountryCode$2$2(InterfaceC2024l interfaceC2024l) {
        super(1);
        this.$continuation = interfaceC2024l;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return D.f8402a;
    }

    public final void invoke(String it) {
        m.f(it, "it");
        CancellableContinuationExtensionsKt.safeResume(this.$continuation, it);
    }
}
