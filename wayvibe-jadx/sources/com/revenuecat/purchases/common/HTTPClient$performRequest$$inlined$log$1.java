package com.revenuecat.purchases.common;

import kotlin.jvm.internal.n;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient$performRequest$$inlined$log$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPClient$performRequest$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " We were expecting to be able to return a cached response, but we can't find it. Retrying call with a new ETag");
    }
}
