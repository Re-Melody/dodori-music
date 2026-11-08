package com.revenuecat.purchases.paywalls.components.common.serializers;

import D7.W;
import M8.k;
import N8.o;
import N8.y;
import Z8.c;
import com.revenuecat.purchases.models.StoreReplacementMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import p219u9.a;
import p240w9.e;
import p240w9.g;
import p240w9.i;
import p251x9.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StoreReplacementModeDeserializer implements a {
    private final StoreReplacementMode defaultValue;
    private final g descriptor;
    private final Map<String, StoreReplacementMode> valuesByType;

    public StoreReplacementModeDeserializer(StoreReplacementMode defaultValue, c typeForValue) {
        m.f(defaultValue, "defaultValue");
        m.f(typeForValue, "typeForValue");
        this.defaultValue = defaultValue;
        List listU = W.U(StoreReplacementMode.WITHOUT_PRORATION, StoreReplacementMode.WITH_TIME_PRORATION, StoreReplacementMode.CHARGE_FULL_PRICE, StoreReplacementMode.CHARGE_PRORATED_PRICE, StoreReplacementMode.DEFERRED);
        int iE0 = y.e0(o.o0(listU, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iE0 < 16 ? 16 : iE0);
        for (Object obj : listU) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this.valuesByType = linkedHashMap;
        this.descriptor = i.a("StoreReplacementMode", e.f28069j);
    }

    @Override // p219u9.a
    public g getDescriptor() {
        return this.descriptor;
    }

    @Override // p219u9.a
    public StoreReplacementMode deserialize(p251x9.c decoder) {
        m.f(decoder, "decoder");
        StoreReplacementMode storeReplacementMode = this.valuesByType.get(decoder.p());
        return storeReplacementMode == null ? this.defaultValue : storeReplacementMode;
    }

    @Override // p219u9.a
    public void serialize(d encoder, StoreReplacementMode value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        throw new k("Serialization is not implemented because it is not needed.");
    }
}
