package com.revenuecat.purchases.models;

import B2.AbstractC0112b;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
final class StoreReplacementModeMapping {
    private final String galaxyBackendName;
    private final GoogleReplacementMode googleReplacementMode;
    private final String legacyPlayBackendName;
    private final int playBillingClientMode;

    public StoreReplacementModeMapping(int i10, String legacyPlayBackendName, String str, GoogleReplacementMode googleReplacementMode) {
        m.f(legacyPlayBackendName, "legacyPlayBackendName");
        m.f(googleReplacementMode, "googleReplacementMode");
        this.playBillingClientMode = i10;
        this.legacyPlayBackendName = legacyPlayBackendName;
        this.galaxyBackendName = str;
        this.googleReplacementMode = googleReplacementMode;
    }

    public static /* synthetic */ StoreReplacementModeMapping copy$default(StoreReplacementModeMapping storeReplacementModeMapping, int i10, String str, String str2, GoogleReplacementMode googleReplacementMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = storeReplacementModeMapping.playBillingClientMode;
        }
        if ((i11 & 2) != 0) {
            str = storeReplacementModeMapping.legacyPlayBackendName;
        }
        if ((i11 & 4) != 0) {
            str2 = storeReplacementModeMapping.galaxyBackendName;
        }
        if ((i11 & 8) != 0) {
            googleReplacementMode = storeReplacementModeMapping.googleReplacementMode;
        }
        return storeReplacementModeMapping.copy(i10, str, str2, googleReplacementMode);
    }

    public final int component1() {
        return this.playBillingClientMode;
    }

    public final String component2() {
        return this.legacyPlayBackendName;
    }

    public final String component3() {
        return this.galaxyBackendName;
    }

    public final GoogleReplacementMode component4() {
        return this.googleReplacementMode;
    }

    public final StoreReplacementModeMapping copy(int i10, String legacyPlayBackendName, String str, GoogleReplacementMode googleReplacementMode) {
        m.f(legacyPlayBackendName, "legacyPlayBackendName");
        m.f(googleReplacementMode, "googleReplacementMode");
        return new StoreReplacementModeMapping(i10, legacyPlayBackendName, str, googleReplacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreReplacementModeMapping)) {
            return false;
        }
        StoreReplacementModeMapping storeReplacementModeMapping = (StoreReplacementModeMapping) obj;
        return this.playBillingClientMode == storeReplacementModeMapping.playBillingClientMode && m.b(this.legacyPlayBackendName, storeReplacementModeMapping.legacyPlayBackendName) && m.b(this.galaxyBackendName, storeReplacementModeMapping.galaxyBackendName) && this.googleReplacementMode == storeReplacementModeMapping.googleReplacementMode;
    }

    public final String getGalaxyBackendName() {
        return this.galaxyBackendName;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getLegacyPlayBackendName() {
        return this.legacyPlayBackendName;
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    public int hashCode() {
        int iA = AbstractC0112b.a(Integer.hashCode(this.playBillingClientMode) * 31, 31, this.legacyPlayBackendName);
        String str = this.galaxyBackendName;
        return this.googleReplacementMode.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "StoreReplacementModeMapping(playBillingClientMode=" + this.playBillingClientMode + ", legacyPlayBackendName=" + this.legacyPlayBackendName + ", galaxyBackendName=" + this.galaxyBackendName + ", googleReplacementMode=" + this.googleReplacementMode + ')';
    }
}
