package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $underlyingErrorMessage$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase$executeAsync$1$1$1$invoke$$inlined$log$2(LogIntent logIntent, String str) {
        super(0);
        this.$intent = logIntent;
        this.$underlyingErrorMessage$inlined = str;
    }

    @Override // Z8.a
    public final String invoke() {
        return N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + this.$underlyingErrorMessage$inlined;
    }
}
