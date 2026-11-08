package com.revenuecat.purchases.common.events;

import Z8.c;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class EventsManager$Companion$paywalls$2 extends j implements c {
    public EventsManager$Companion$paywalls$2(Object obj) {
        super(1, 0, PaywallStoredEvent.Companion.class, obj, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;");
    }

    @Override // Z8.c
    public final PaywallStoredEvent invoke(String p10) {
        m.f(p10, "p0");
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(p10);
    }
}
