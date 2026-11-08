package B8;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0119f {
    private static final /* synthetic */ EnumC0119f[] $VALUES;
    public static final EnumC0119f DEBUG;
    public static final EnumC0119f ERROR;
    public static final EnumC0119f INFO;
    public static final EnumC0119f WARNING;

    static {
        EnumC0119f enumC0119f = new EnumC0119f("DEBUG", 0);
        DEBUG = enumC0119f;
        EnumC0119f enumC0119f2 = new EnumC0119f("INFO", 1);
        INFO = enumC0119f2;
        EnumC0119f enumC0119f3 = new EnumC0119f("WARNING", 2);
        WARNING = enumC0119f3;
        EnumC0119f enumC0119f4 = new EnumC0119f(HybridPurchaseLogicBridge.RESULT_ERROR, 3);
        ERROR = enumC0119f4;
        $VALUES = new EnumC0119f[]{enumC0119f, enumC0119f2, enumC0119f3, enumC0119f4};
    }

    public static EnumC0119f valueOf(String str) {
        return (EnumC0119f) Enum.valueOf(EnumC0119f.class, str);
    }

    public static EnumC0119f[] values() {
        return (EnumC0119f[]) $VALUES.clone();
    }
}
