package com.revenuecat.purchases.common.caching;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1 extends n implements a {
    final /* synthetic */ boolean $appInBackground$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1(LogIntent logIntent, boolean z10) {
        super(0);
        this.$intent = logIntent;
        this.$appInBackground$inlined = z10;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{Boolean.valueOf(this.$appInBackground$inlined)}, 1, ReceiptStrings.CHECKING_IF_CACHE_STALE, sb);
    }
}
