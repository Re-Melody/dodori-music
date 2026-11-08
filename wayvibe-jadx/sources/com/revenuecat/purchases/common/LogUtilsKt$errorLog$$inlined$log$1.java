package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class LogUtilsKt$errorLog$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogUtilsKt$errorLog$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    @Override // Z8.a
    public final String invoke() {
        return N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + this.$error$inlined.toString();
    }
}
