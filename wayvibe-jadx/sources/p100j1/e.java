package p100j1;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e CONSTANT;
    public static final e ERROR;
    public static final e SLACK;
    public static final e UNKNOWN;
    public static final e UNRESTRICTED;

    static {
        e eVar = new e("UNRESTRICTED", 0);
        UNRESTRICTED = eVar;
        e eVar2 = new e("CONSTANT", 1);
        CONSTANT = eVar2;
        e eVar3 = new e("SLACK", 2);
        SLACK = eVar3;
        e eVar4 = new e(HybridPurchaseLogicBridge.RESULT_ERROR, 3);
        ERROR = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
