package Fa;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    ERROR(40, HybridPurchaseLogicBridge.RESULT_ERROR),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final int levelInt;
    private final String levelStr;

    b(int i10, String str) {
        this.levelInt = i10;
        this.levelStr = str;
    }

    public final int f() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.levelStr;
    }
}
