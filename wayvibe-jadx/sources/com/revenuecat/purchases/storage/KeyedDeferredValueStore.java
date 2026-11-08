package com.revenuecat.purchases.storage;

import Z8.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import p119k9.I;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class KeyedDeferredValueStore<H, T> {
    private final Map<H, I> deferred;
    private final Object lock;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyedDeferredValueStore() {
        f fVar = null;
        this(fVar, 1, fVar);
    }

    private final I forgettingFailure(H h10, a aVar) {
        I i10 = (I) aVar.invoke();
        i10.invokeOnCompletion(new KeyedDeferredValueStore$forgettingFailure$1$1(this, h10));
        return i10;
    }

    public final Map<H, I> getDeferred() {
        return this.deferred;
    }

    public final I getOrPut(H h10, a task) {
        I iForgettingFailure;
        m.f(task, "task");
        synchronized (this.lock) {
            iForgettingFailure = this.deferred.get(h10);
            if (iForgettingFailure == null) {
                iForgettingFailure = forgettingFailure(h10, task);
                this.deferred.put(h10, iForgettingFailure);
            }
        }
        return iForgettingFailure;
    }

    public KeyedDeferredValueStore(Object lock) {
        m.f(lock, "lock");
        this.lock = lock;
        this.deferred = new LinkedHashMap();
    }

    public /* synthetic */ KeyedDeferredValueStore(Object obj, int i10, f fVar) {
        this((i10 & 1) != 0 ? new Object() { // from class: com.revenuecat.purchases.storage.KeyedDeferredValueStore.1
        } : obj);
    }
}
