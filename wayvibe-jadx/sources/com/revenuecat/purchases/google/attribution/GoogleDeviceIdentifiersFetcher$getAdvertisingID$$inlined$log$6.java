package com.revenuecat.purchases.google.attribution;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6 extends n implements a {
    final /* synthetic */ NullPointerException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$6(LogIntent logIntent, NullPointerException nullPointerException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = nullPointerException;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, sb);
    }
}
