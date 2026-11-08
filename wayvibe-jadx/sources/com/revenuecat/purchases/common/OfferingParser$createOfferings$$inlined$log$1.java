package com.revenuecat.purchases.common;

import B2.AbstractC0112b;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingParser$createOfferings$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $productsById$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingParser$createOfferings$$inlined$log$1(LogIntent logIntent, Map map) {
        super(0);
        this.$intent = logIntent;
        this.$productsById$inlined = map;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{Integer.valueOf(this.$productsById$inlined.size())}, 1, OfferingStrings.BUILDING_OFFERINGS, sb);
    }
}
