package com.revenuecat.purchases.common.caching;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1 extends n implements a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Set $it$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$getPreviouslySentHashedTokens$lambda$21$$inlined$log$1(LogIntent logIntent, Set set) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = set;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$it$inlined}, 1, ReceiptStrings.TOKENS_ALREADY_POSTED, sb);
    }
}
