package com.revenuecat.purchases.common.remoteconfig;

import Z8.a;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigManager$handleRefreshError$$inlined$log$1 extends n implements a {
    final /* synthetic */ PurchasesError $error$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigManager$handleRefreshError$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        sb.append("Disabling remote config for this session after receiving a 4xx response. Error: " + this.$error$inlined);
        return sb.toString();
    }
}
