package com.revenuecat.purchases.common.events;

import M8.D;
import Z8.c;
import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class EventsManager$debugEventListener$callback$1$1 extends n implements c {
    final /* synthetic */ DebugEventListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsManager$debugEventListener$callback$1$1(DebugEventListener debugEventListener) {
        super(1);
        this.$listener = debugEventListener;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DebugEvent) obj);
        return D.f8402a;
    }

    public final void invoke(DebugEvent event) {
        m.f(event, "event");
        this.$listener.onDebugEventReceived(event);
    }
}
