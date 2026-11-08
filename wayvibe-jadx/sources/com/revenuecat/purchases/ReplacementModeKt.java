package com.revenuecat.purchases;

import M8.InterfaceC0641c;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreReplacementMode;
import com.revenuecat.purchases.models.StoreReplacementModeConversionsKt;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ReplacementModeKt {
    public static final String backendName(ReplacementMode replacementMode, Store store) {
        m.f(replacementMode, "<this>");
        m.f(store, "store");
        StoreReplacementMode storeReplacementModeOrNull = StoreReplacementModeConversionsKt.toStoreReplacementModeOrNull(replacementMode);
        if (storeReplacementModeOrNull != null) {
            return StoreReplacementModeConversionsKt.storeBackendName(storeReplacementModeOrNull, store);
        }
        return null;
    }

    public static final String getBackendName(ReplacementMode replacementMode) {
        m.f(replacementMode, "<this>");
        if (replacementMode instanceof GoogleReplacementMode) {
            return StoreReplacementModeConversionsKt.legacyPlayBackendName(StoreReplacementModeConversionsKt.toStoreReplacementMode((GoogleReplacementMode) replacementMode));
        }
        return replacementMode instanceof StoreReplacementMode ? StoreReplacementModeConversionsKt.legacyPlayBackendName((StoreReplacementMode) replacementMode) : replacementMode.getName();
    }

    @InterfaceC0641c
    public static /* synthetic */ void getBackendName$annotations(ReplacementMode replacementMode) {
    }
}
