package com.revenuecat.purchases.common.events;

import Z8.c;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class EventsManager$Companion$paywalls$1 extends j implements c {
    public static final EventsManager$Companion$paywalls$1 INSTANCE = new EventsManager$Companion$paywalls$1();

    public EventsManager$Companion$paywalls$1() {
        super(1, PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override // Z8.c
    public final String invoke(PaywallStoredEvent p10) {
        m.f(p10, "p0");
        return p10.toString();
    }
}
