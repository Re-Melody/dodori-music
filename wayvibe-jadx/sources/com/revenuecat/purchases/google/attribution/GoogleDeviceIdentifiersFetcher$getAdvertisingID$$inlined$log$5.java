package com.revenuecat.purchases.google.attribution;

import B2.AbstractC0112b;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.io.IOException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5 extends n implements a {
    final /* synthetic */ IOException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$5(LogIntent logIntent, IOException iOException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = iOException;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, sb);
    }
}
