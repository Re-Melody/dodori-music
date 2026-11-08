package com.revenuecat.purchases.amazon;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ JSONObject $response$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$normalizePurchaseData$2$invoke$$inlined$log$1(LogIntent logIntent, JSONObject jSONObject) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = jSONObject;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$response$inlined.toString()}, 1, AmazonStrings.RECEIPT_DATA_RECEIVED, sb);
    }
}
