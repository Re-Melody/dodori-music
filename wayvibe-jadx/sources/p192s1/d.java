package p192s1;

import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d CONSTANT;
    public static final d ERROR;
    public static final d SLACK;
    public static final d UNKNOWN;
    public static final d UNRESTRICTED;

    static {
        d dVar = new d("UNRESTRICTED", 0);
        UNRESTRICTED = dVar;
        d dVar2 = new d("CONSTANT", 1);
        CONSTANT = dVar2;
        d dVar3 = new d("SLACK", 2);
        SLACK = dVar3;
        d dVar4 = new d(HybridPurchaseLogicBridge.RESULT_ERROR, 3);
        ERROR = dVar4;
        d dVar5 = new d("UNKNOWN", 4);
        UNKNOWN = dVar5;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
