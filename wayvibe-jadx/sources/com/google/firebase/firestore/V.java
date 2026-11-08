package com.google.firebase.firestore;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class V {
    private static final /* synthetic */ V[] $VALUES;
    public static final V ERROR;
    public static final V RUNNING;
    public static final V SUCCESS;

    static {
        V v3 = new V(HybridPurchaseLogicBridge.RESULT_ERROR, 0);
        ERROR = v3;
        V v10 = new V("RUNNING", 1);
        RUNNING = v10;
        V v11 = new V(HybridPurchaseLogicBridge.RESULT_SUCCESS, 2);
        SUCCESS = v11;
        $VALUES = new V[]{v3, v10, v11};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) $VALUES.clone();
    }
}
