package com.revenuecat.purchases.amazon.attribution;

import B2.AbstractC0112b;
import Z8.a;
import android.provider.Settings;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class AmazonDeviceIdentifiersFetcher$getDeviceIdentifiers$$inlined$log$1 extends n implements a {
    final /* synthetic */ Settings.SettingNotFoundException $e$inlined;
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonDeviceIdentifiersFetcher$getDeviceIdentifiers$$inlined$log$1(LogIntent logIntent, Settings.SettingNotFoundException settingNotFoundException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = settingNotFoundException;
    }

    @Override // Z8.a
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return AbstractC0112b.n(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.AMAZON_COULD_NOT_GET_ADID, sb);
    }
}
