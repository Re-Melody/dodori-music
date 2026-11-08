package com.revenuecat.purchases.google;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.BillingStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingWrapper$performStartConnection$$inlined$log$2 extends n implements Z8.a {
    final /* synthetic */ IllegalStateException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$performStartConnection$$inlined$log$2(LogIntent logIntent, IllegalStateException illegalStateException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = illegalStateException;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined}, 1, BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, sb);
    }
}
