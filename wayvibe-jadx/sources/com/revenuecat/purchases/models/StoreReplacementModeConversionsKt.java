package com.revenuecat.purchases.models;

import B8.V;
import M8.l;
import N8.y;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.Store;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreReplacementModeConversionsKt {
    private static final Map<StoreReplacementMode, StoreReplacementModeMapping> storeReplacementModeMappings = y.g0(new l(StoreReplacementMode.WITHOUT_PRORATION, new StoreReplacementModeMapping(3, "IMMEDIATE_WITHOUT_PRORATION", "INSTANT_NO_PRORATION", GoogleReplacementMode.WITHOUT_PRORATION)), new l(StoreReplacementMode.WITH_TIME_PRORATION, new StoreReplacementModeMapping(1, "IMMEDIATE_WITH_TIME_PRORATION", "INSTANT_PRORATED_DATE", GoogleReplacementMode.WITH_TIME_PRORATION)), new l(StoreReplacementMode.CHARGE_FULL_PRICE, new StoreReplacementModeMapping(5, "IMMEDIATE_AND_CHARGE_FULL_PRICE", null, GoogleReplacementMode.CHARGE_FULL_PRICE)), new l(StoreReplacementMode.CHARGE_PRORATED_PRICE, new StoreReplacementModeMapping(2, "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "INSTANT_PRORATED_CHARGE", GoogleReplacementMode.CHARGE_PRORATED_PRICE)), new l(StoreReplacementMode.DEFERRED, new StoreReplacementModeMapping(6, "DEFERRED", "DEFERRED", GoogleReplacementMode.DEFERRED)));

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GoogleReplacementMode.values().length];
            try {
                iArr2[GoogleReplacementMode.WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GoogleReplacementMode.WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GoogleReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GoogleReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GoogleReplacementMode.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final StoreReplacementModeMapping getMapping(StoreReplacementMode storeReplacementMode) {
        return (StoreReplacementModeMapping) y.c0(storeReplacementMode, storeReplacementModeMappings);
    }

    public static final String legacyPlayBackendName(StoreReplacementMode storeReplacementMode) {
        m.f(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getLegacyPlayBackendName();
    }

    public static final String storeBackendName(StoreReplacementMode storeReplacementMode, Store store) {
        m.f(storeReplacementMode, "<this>");
        m.f(store, "store");
        int i10 = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i10 == 1) {
            return legacyPlayBackendName(storeReplacementMode);
        }
        if (i10 != 2) {
            return null;
        }
        return getMapping(storeReplacementMode).getGalaxyBackendName();
    }

    public static final GoogleReplacementMode toGoogleReplacementMode(StoreReplacementMode storeReplacementMode) {
        m.f(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getGoogleReplacementMode();
    }

    public static final int toPlayBillingClientMode(StoreReplacementMode storeReplacementMode) {
        m.f(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getPlayBillingClientMode();
    }

    public static final StoreReplacementMode toStoreReplacementMode(GoogleReplacementMode googleReplacementMode) {
        m.f(googleReplacementMode, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[googleReplacementMode.ordinal()];
        if (i10 == 1) {
            return StoreReplacementMode.WITHOUT_PRORATION;
        }
        if (i10 == 2) {
            return StoreReplacementMode.WITH_TIME_PRORATION;
        }
        if (i10 == 3) {
            return StoreReplacementMode.CHARGE_FULL_PRICE;
        }
        if (i10 == 4) {
            return StoreReplacementMode.CHARGE_PRORATED_PRICE;
        }
        if (i10 == 5) {
            return StoreReplacementMode.DEFERRED;
        }
        throw new V();
    }

    public static final StoreReplacementMode toStoreReplacementModeOrNull(ReplacementMode replacementMode) {
        if (replacementMode == null) {
            return null;
        }
        if (replacementMode instanceof StoreReplacementMode) {
            return (StoreReplacementMode) replacementMode;
        }
        if (replacementMode instanceof GoogleReplacementMode) {
            return toStoreReplacementMode((GoogleReplacementMode) replacementMode);
        }
        return null;
    }
}
