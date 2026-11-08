package com.revenuecat.purchases.google.attribution;

import Z8.a;
import com.revenuecat.purchases.common.LogIntent;
import kotlin.jvm.internal.n;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7 extends n implements a {
    final /* synthetic */ LogIntent $intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$7(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override // Z8.a
    public final String invoke() {
        return b.m(new StringBuilder(), N8.n.H0(this.$intent.getEmojiList(), "", null, null, null, 62), " NoSuchMethodError when getting advertising identifier. com.google.android.gms.ads library is not available.");
    }
}
