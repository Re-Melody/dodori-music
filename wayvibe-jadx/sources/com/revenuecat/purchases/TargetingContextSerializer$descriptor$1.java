package com.revenuecat.purchases;

import M8.D;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p260y9.E;
import p260y9.c0;

/* JADX INFO: loaded from: classes.dex */
public final class TargetingContextSerializer$descriptor$1 extends n implements Z8.c {
    public static final TargetingContextSerializer$descriptor$1 INSTANCE = new TargetingContextSerializer$descriptor$1();

    public TargetingContextSerializer$descriptor$1() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p240w9.a) obj);
        return D.f8402a;
    }

    public final void invoke(p240w9.a buildClassSerialDescriptor) {
        m.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("revision", E.f29226b);
        buildClassSerialDescriptor.a("ruleId", c0.f29273b);
    }
}
