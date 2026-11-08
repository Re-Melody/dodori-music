package com.revenuecat.purchases.hybridcommon.mappers;

import M8.l;
import N8.y;
import com.revenuecat.purchases.DebugEvent;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugEventMapperKt {
    public static final Map<String, Object> toMap(DebugEvent debugEvent) {
        m.f(debugEvent, "<this>");
        return y.k0(y.f0(new l("type", debugEvent.getName().name())), debugEvent.getProperties());
    }
}
