package com.revenuecat.purchases;

import N8.t;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class DebugEvent {
    private final DebugEventName name;
    private final Map<String, String> properties;

    public DebugEvent(DebugEventName name, Map<String, String> properties) {
        m.f(name, "name");
        m.f(properties, "properties");
        this.name = name;
        this.properties = properties;
    }

    public final DebugEventName getName() {
        return this.name;
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public /* synthetic */ DebugEvent(DebugEventName debugEventName, Map map, int i10, f fVar) {
        this(debugEventName, (i10 & 2) != 0 ? t.f8651a : map);
    }
}
