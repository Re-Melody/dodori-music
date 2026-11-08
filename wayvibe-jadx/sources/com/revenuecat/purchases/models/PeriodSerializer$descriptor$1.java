package com.revenuecat.purchases.models;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p240w9.a;
import p260y9.E;
import p260y9.V;
import p260y9.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodSerializer$descriptor$1 extends n implements c {
    public static final PeriodSerializer$descriptor$1 INSTANCE = new PeriodSerializer$descriptor$1();

    public PeriodSerializer$descriptor$1() {
        super(1);
    }

    public final void invoke(a buildClassSerialDescriptor) {
        m.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("value", E.f29226b);
        V v3 = c0.f29273b;
        buildClassSerialDescriptor.a("unit", v3);
        buildClassSerialDescriptor.a("iso8601", v3);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return D.f8402a;
    }
}
