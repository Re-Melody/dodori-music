package com.revenuecat.purchases;

import M8.D;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p260y9.V;
import p260y9.c0;

/* JADX INFO: loaded from: classes.dex */
public final class CustomVariableDefinitionSerializer$descriptor$1 extends n implements Z8.c {
    public static final CustomVariableDefinitionSerializer$descriptor$1 INSTANCE = new CustomVariableDefinitionSerializer$descriptor$1();

    public CustomVariableDefinitionSerializer$descriptor$1() {
        super(1);
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p240w9.a) obj);
        return D.f8402a;
    }

    public final void invoke(p240w9.a buildClassSerialDescriptor) {
        m.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        c0 c0Var = c0.f29272a;
        V v3 = c0.f29273b;
        buildClassSerialDescriptor.a("type", v3);
        buildClassSerialDescriptor.a("default_value", v3);
    }
}
