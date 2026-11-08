package D8;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D8.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0262b1 {
    private static final /* synthetic */ EnumC0262b1[] $VALUES;
    public static final EnumC0262b1 ERROR;
    public static final EnumC0262b1 NO_RESOLUTION;
    public static final EnumC0262b1 SUCCESS;

    static {
        EnumC0262b1 enumC0262b1 = new EnumC0262b1("NO_RESOLUTION", 0);
        NO_RESOLUTION = enumC0262b1;
        EnumC0262b1 enumC0262b2 = new EnumC0262b1(HybridPurchaseLogicBridge.RESULT_SUCCESS, 1);
        SUCCESS = enumC0262b2;
        EnumC0262b1 enumC0262b3 = new EnumC0262b1(HybridPurchaseLogicBridge.RESULT_ERROR, 2);
        ERROR = enumC0262b3;
        $VALUES = new EnumC0262b1[]{enumC0262b1, enumC0262b2, enumC0262b3};
    }

    public static EnumC0262b1 valueOf(String str) {
        return (EnumC0262b1) Enum.valueOf(EnumC0262b1.class, str);
    }

    public static EnumC0262b1[] values() {
        return (EnumC0262b1[]) $VALUES.clone();
    }
}
