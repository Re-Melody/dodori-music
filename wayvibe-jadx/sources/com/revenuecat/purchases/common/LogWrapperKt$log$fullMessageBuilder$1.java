package com.revenuecat.purchases.common;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class LogWrapperKt$log$fullMessageBuilder$1 extends n implements Z8.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ Z8.a $messageBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWrapperKt$log$fullMessageBuilder$1(LogIntent logIntent, Z8.a aVar) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = aVar;
    }

    @Override // Z8.a
    public final String invoke() {
        return N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + ((String) this.$messageBuilder.invoke());
    }
}
