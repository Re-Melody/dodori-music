package com.revenuecat.purchases.models;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p240w9.a;
import p260y9.K;
import p260y9.V;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceSerializer$descriptor$1 extends n implements c {
    public static final PriceSerializer$descriptor$1 INSTANCE = new PriceSerializer$descriptor$1();

    public PriceSerializer$descriptor$1() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return D.f8402a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        m.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        V v3 = c0.f29273b;
        buildClassSerialDescriptor.a("formatted", v3);
        buildClassSerialDescriptor.a("amount_micros", K.f29238b);
        buildClassSerialDescriptor.a("currency_code", v3);
    }
}
