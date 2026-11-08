package com.revenuecat.purchases.subscriberattributes.caching;

import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1 extends n implements a {
    final /* synthetic */ String $appUserID$inlined;
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Map $unsyncedAttributesByKey$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$filterUnsynced$lambda$10$$inlined$log$1(LogIntent logIntent, Map map, String str) {
        super(0);
        this.$intent = logIntent;
        this.$unsyncedAttributesByKey$inlined = map;
        this.$appUserID$inlined = str;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(this.$unsyncedAttributesByKey$inlined.size()), this.$appUserID$inlined}, 2)));
        sb2.append(!this.$unsyncedAttributesByKey$inlined.isEmpty() ? N8.n.H0(this.$unsyncedAttributesByKey$inlined.values(), "\n", null, null, null, 62) : "");
        sb.append(sb2.toString());
        return sb.toString();
    }
}
