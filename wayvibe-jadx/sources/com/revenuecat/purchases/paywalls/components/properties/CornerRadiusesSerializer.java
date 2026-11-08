package com.revenuecat.purchases.paywalls.components.properties;

import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public final class CornerRadiusesSerializer implements a {
    public static final CornerRadiusesSerializer INSTANCE = new CornerRadiusesSerializer();
    private static final g descriptor;
    private static final a serializer;

    static {
        a aVarSerializer = CornerRadiuses.Dp.Companion.serializer();
        serializer = aVarSerializer;
        descriptor = aVarSerializer.getDescriptor();
    }

    private CornerRadiusesSerializer() {
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return descriptor;
    }

    @Override // p219u9.a
    public void serialize(d encoder, CornerRadiuses value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
    }

    @Override // p219u9.a
    public CornerRadiuses deserialize(c decoder) {
        m.f(decoder, "decoder");
        return (CornerRadiuses) decoder.o(serializer);
    }
}
