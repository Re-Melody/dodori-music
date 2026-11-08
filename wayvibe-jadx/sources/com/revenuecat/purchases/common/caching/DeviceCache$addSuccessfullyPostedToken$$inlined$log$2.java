package com.revenuecat.purchases.common.caching;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceCache$addSuccessfullyPostedToken$$inlined$log$2 extends n implements a {
    final /* synthetic */ Map $current$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$addSuccessfullyPostedToken$$inlined$log$2(LogIntent logIntent, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$current$inlined = map;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$current$inlined.keySet()}, 1, ReceiptStrings.TOKENS_IN_CACHE, sb);
    }
}
