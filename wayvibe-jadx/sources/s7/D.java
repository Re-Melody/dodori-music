package s7;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    private static final /* synthetic */ D[] $VALUES;
    public static final D FALSE_POSITIVE;
    public static final D SKIPPED;
    public static final D SUCCESS;

    static {
        D d10 = new D(HybridPurchaseLogicBridge.RESULT_SUCCESS, 0);
        SUCCESS = d10;
        D d11 = new D("SKIPPED", 1);
        SKIPPED = d11;
        D d12 = new D("FALSE_POSITIVE", 2);
        FALSE_POSITIVE = d12;
        $VALUES = new D[]{d10, d11, d12};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
