package com.revenuecat.purchases.common;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformInfo {
    private final String flavor;
    private final String version;

    public PlatformInfo(String flavor, String str) {
        m.f(flavor, "flavor");
        this.flavor = flavor;
        this.version = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformInfo)) {
            return false;
        }
        PlatformInfo platformInfo = (PlatformInfo) obj;
        return m.b(this.flavor, platformInfo.flavor) && m.b(this.version, platformInfo.version);
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.flavor.hashCode() * 31;
        String str = this.version;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlatformInfo(flavor=");
        sb.append(this.flavor);
        sb.append(", version=");
        return AbstractC0112b.j(sb, this.version, ')');
    }
}
