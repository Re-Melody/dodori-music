package com.revenuecat.purchases.common.remoteconfig;

import d9.d;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class SourceFailover {
    private final RemoteConfigSourceHandle.Purpose purpose;
    private final WeightedSourceSelector<RemoteConfigSource> selector;
    private int token;

    public SourceFailover(RemoteConfigSourceHandle.Purpose purpose, List<RemoteConfigSource> sources, d random, int i10) {
        m.f(purpose, "purpose");
        m.f(sources, "sources");
        m.f(random, "random");
        this.purpose = purpose;
        this.selector = new WeightedSourceSelector<>(sources, random);
        this.token = i10;
    }

    public final RemoteConfigSourceHandle getCurrent() {
        RemoteConfigSource remoteConfigSource = (RemoteConfigSource) this.selector.getCurrent();
        if (remoteConfigSource != null) {
            return new RemoteConfigSourceHandle(this.purpose, remoteConfigSource, this.token);
        }
        return null;
    }

    public final int getCurrentToken() {
        return this.token;
    }

    public final boolean reportUnhealthy(RemoteConfigSourceHandle handle) {
        m.f(handle, "handle");
        if (handle.getToken() != this.token) {
            return false;
        }
        this.selector.advance();
        this.token++;
        return true;
    }

    public final void restart() {
        this.selector.reset();
        this.token++;
    }

    public /* synthetic */ SourceFailover(RemoteConfigSourceHandle.Purpose purpose, List list, d dVar, int i10, int i11, f fVar) {
        this(purpose, list, dVar, (i11 & 8) != 0 ? 0 : i10);
    }
}
