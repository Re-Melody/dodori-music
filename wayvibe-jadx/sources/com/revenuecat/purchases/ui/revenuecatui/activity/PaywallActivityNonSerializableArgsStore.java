package com.revenuecat.purchases.ui.revenuecatui.activity;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallActivityNonSerializableArgsStore {
    public static final PaywallActivityNonSerializableArgsStore INSTANCE = new PaywallActivityNonSerializableArgsStore();
    private static final Map<Integer, PaywallActivityNonSerializableArgs> argsByHashCode = new LinkedHashMap();
    public static final int $stable = 8;

    private PaywallActivityNonSerializableArgsStore() {
    }

    public final synchronized void clear() {
        argsByHashCode.clear();
    }

    public final synchronized PaywallActivityNonSerializableArgs get(int i10) {
        return argsByHashCode.get(Integer.valueOf(i10));
    }

    public final synchronized void remove(int i10) {
        argsByHashCode.remove(Integer.valueOf(i10));
    }

    public final synchronized int store(PaywallActivityNonSerializableArgs args) {
        int iIdentityHashCode;
        m.f(args, "args");
        iIdentityHashCode = System.identityHashCode(args);
        argsByHashCode.put(Integer.valueOf(iIdentityHashCode), args);
        return iIdentityHashCode;
    }
}
