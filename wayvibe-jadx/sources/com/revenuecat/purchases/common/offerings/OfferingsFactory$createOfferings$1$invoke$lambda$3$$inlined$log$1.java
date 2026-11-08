package com.revenuecat.purchases.common.offerings;

import B2.AbstractC0112b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ boolean $isTestStore$inlined;
    final /* synthetic */ Set $missingProducts$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$createOfferings$1$invoke$lambda$3$$inlined$log$1(LogIntent logIntent, boolean z10, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$isTestStore$inlined = z10;
        this.$missingProducts$inlined = set;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{N8.n.H0(this.$missingProducts$inlined, ", ", null, null, null, 62)}, 1, this.$isTestStore$inlined ? OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR_TEST_STORE : OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, sb);
    }
}
