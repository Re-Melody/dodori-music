package com.revenuecat.purchases.common.remoteconfig;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class GenerationGuardedCache<T> {
    private volatile T value;
    private final Object lock = new Object();
    private int lastGeneration = -1;

    public final T getCached() {
        return this.value;
    }

    public final void invalidate(int i10) {
        synchronized (this.lock) {
            if (i10 >= this.lastGeneration) {
                this.lastGeneration = i10;
                this.value = null;
            }
        }
    }

    public final boolean isAtOrAbove(int i10) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.lastGeneration >= i10;
        }
        return z10;
    }

    public final boolean isCurrent(int i10) {
        boolean z10;
        synchronized (this.lock) {
            z10 = i10 >= this.lastGeneration;
        }
        return z10;
    }

    public final boolean isWarm() {
        return this.value != null;
    }

    public final boolean isWarmAtOrAbove(int i10) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.lastGeneration >= i10 && this.value != null;
        }
        return z10;
    }

    public final void store(int i10, T newValue) {
        m.f(newValue, "newValue");
        synchronized (this.lock) {
            if (i10 >= this.lastGeneration) {
                this.lastGeneration = i10;
                this.value = newValue;
            }
        }
    }
}
