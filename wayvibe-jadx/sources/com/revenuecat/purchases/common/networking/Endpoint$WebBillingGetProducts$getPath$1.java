package com.revenuecat.purchases.common.networking;

import Z8.c;
import android.net.Uri;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class Endpoint$WebBillingGetProducts$getPath$1 extends n implements c {
    public static final Endpoint$WebBillingGetProducts$getPath$1 INSTANCE = new Endpoint$WebBillingGetProducts$getPath$1();

    public Endpoint$WebBillingGetProducts$getPath$1() {
        super(1);
    }

    @Override // Z8.c
    public final CharSequence invoke(String it) {
        m.f(it, "it");
        String strEncode = Uri.encode(it);
        m.e(strEncode, "encode(it)");
        return strEncode;
    }
}
