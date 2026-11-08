package com.revenuecat.purchases.common.offerings;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import kotlin.jvm.internal.n;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory$createOfferings$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ JSONException $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$createOfferings$$inlined$log$1(LogIntent logIntent, JSONException jSONException) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = jSONException;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$error$inlined.getLocalizedMessage()}, 1, OfferingStrings.JSON_EXCEPTION_ERROR, sb);
    }
}
