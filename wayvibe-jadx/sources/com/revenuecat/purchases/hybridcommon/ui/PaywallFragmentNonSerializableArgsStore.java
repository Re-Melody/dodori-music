package com.revenuecat.purchases.hybridcommon.ui;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFragmentNonSerializableArgsStore {
    public static final PaywallFragmentNonSerializableArgsStore INSTANCE = new PaywallFragmentNonSerializableArgsStore();
    private static final ConcurrentHashMap<String, PaywallFragmentNonSerializableArgs> store = new ConcurrentHashMap<>();

    private PaywallFragmentNonSerializableArgsStore() {
    }

    public final PaywallFragmentNonSerializableArgs get(String key) {
        m.f(key, "key");
        return store.get(key);
    }

    public final void put(String key, PaywallFragmentNonSerializableArgs args) {
        m.f(key, "key");
        m.f(args, "args");
        store.put(key, args);
    }

    public final void remove(String key) {
        m.f(key, "key");
        store.remove(key);
    }
}
