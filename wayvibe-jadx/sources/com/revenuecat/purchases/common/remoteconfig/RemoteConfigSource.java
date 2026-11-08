package com.revenuecat.purchases.common.remoteconfig;

import V0.p;
import kotlin.jvm.internal.m;
import p134m1.b;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteConfigSource implements WeightedSource {
    private final int priority;
    private final String url;
    private final int weight;

    public RemoteConfigSource(String url, int i10, int i11) {
        m.f(url, "url");
        this.url = url;
        this.priority = i10;
        this.weight = i11;
    }

    public static /* synthetic */ RemoteConfigSource copy$default(RemoteConfigSource remoteConfigSource, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = remoteConfigSource.url;
        }
        if ((i12 & 2) != 0) {
            i10 = remoteConfigSource.priority;
        }
        if ((i12 & 4) != 0) {
            i11 = remoteConfigSource.weight;
        }
        return remoteConfigSource.copy(str, i10, i11);
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.priority;
    }

    public final int component3() {
        return this.weight;
    }

    public final RemoteConfigSource copy(String url, int i10, int i11) {
        m.f(url, "url");
        return new RemoteConfigSource(url, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfigSource)) {
            return false;
        }
        RemoteConfigSource remoteConfigSource = (RemoteConfigSource) obj;
        return m.b(this.url, remoteConfigSource.url) && this.priority == remoteConfigSource.priority && this.weight == remoteConfigSource.weight;
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.WeightedSource
    public int getPriority() {
        return this.priority;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // com.revenuecat.purchases.common.remoteconfig.WeightedSource
    public int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Integer.hashCode(this.weight) + b.c(this.priority, this.url.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfigSource(url=");
        sb.append(this.url);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", weight=");
        return p.q(sb, this.weight, ')');
    }
}
