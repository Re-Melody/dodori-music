package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.ColorUtilsKt;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.g;
import p251x9.c;
import p251x9.d;
import p260y9.E;

/* JADX INFO: loaded from: classes2.dex */
final class RgbaStringArgbColorIntDeserializer implements a {
    public static final RgbaStringArgbColorIntDeserializer INSTANCE = new RgbaStringArgbColorIntDeserializer();
    private static final g descriptor = E.f29226b;

    private RgbaStringArgbColorIntDeserializer() {
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return descriptor;
    }

    @Override // p219u9.a
    public /* bridge */ /* synthetic */ void serialize(d dVar, Object obj) {
        serialize(dVar, ((Number) obj).intValue());
    }

    @Override // p219u9.a
    public Integer deserialize(c decoder) {
        m.f(decoder, "decoder");
        return Integer.valueOf(ColorUtilsKt.parseRGBAColor(decoder.p()));
    }

    public void serialize(d encoder, int i10) {
        m.f(encoder, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
