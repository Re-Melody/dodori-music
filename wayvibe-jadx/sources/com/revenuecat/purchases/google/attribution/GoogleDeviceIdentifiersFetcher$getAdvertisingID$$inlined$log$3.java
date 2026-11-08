package com.revenuecat.purchases.google.attribution;

import B2.AbstractC0112b;
import H5.h;
import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3 extends n implements a {
    final /* synthetic */ h $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$3(LogIntent logIntent, h hVar) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = hVar;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, sb);
    }
}
