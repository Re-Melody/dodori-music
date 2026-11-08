package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$$inlined$log$2(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return p134m1.b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " Purchase history is empty.");
    }
}
