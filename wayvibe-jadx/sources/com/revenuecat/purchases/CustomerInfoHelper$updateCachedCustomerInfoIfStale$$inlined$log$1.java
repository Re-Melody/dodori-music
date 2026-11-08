package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ boolean $appInBackground$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$updateCachedCustomerInfoIfStale$$inlined$log$1(LogIntent logIntent, boolean z10) {
        super(0);
        this.$intent = logIntent;
        this.$appInBackground$inlined = z10;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        sb.append(this.$appInBackground$inlined ? CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND : CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
        return sb.toString();
    }
}
