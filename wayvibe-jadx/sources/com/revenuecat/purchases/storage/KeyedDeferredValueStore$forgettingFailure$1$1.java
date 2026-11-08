package com.revenuecat.purchases.storage;

import M8.D;
import Z8.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyedDeferredValueStore$forgettingFailure$1$1 extends n implements c {
    final /* synthetic */ H $key;
    final /* synthetic */ KeyedDeferredValueStore<H, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedDeferredValueStore$forgettingFailure$1$1(KeyedDeferredValueStore<H, T> keyedDeferredValueStore, H h10) {
        super(1);
        this.this$0 = keyedDeferredValueStore;
        this.$key = h10;
    }

    @Override // Z8.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return D.f8402a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            KeyedDeferredValueStore<H, T> keyedDeferredValueStore = this.this$0;
            Object obj = this.$key;
            synchronized (((KeyedDeferredValueStore) keyedDeferredValueStore).lock) {
                keyedDeferredValueStore.getDeferred().remove(obj);
            }
        }
    }
}
