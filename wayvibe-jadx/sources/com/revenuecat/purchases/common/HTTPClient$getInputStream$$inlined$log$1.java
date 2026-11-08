package com.revenuecat.purchases.common;

import B2.AbstractC0112b;
import com.revenuecat.purchases.strings.NetworkStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient$getInputStream$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ Exception $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPClient$getInputStream$$inlined$log$1(LogIntent logIntent, Exception exc) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = exc;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined.getMessage()}, 1, NetworkStrings.PROBLEM_CONNECTING, sb);
    }
}
