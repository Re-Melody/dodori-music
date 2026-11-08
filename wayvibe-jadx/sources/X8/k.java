package X8;

import D7.W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ T8.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k BOTTOM_UP;
    public static final k TOP_DOWN;

    static {
        k kVar = new k("TOP_DOWN", 0);
        TOP_DOWN = kVar;
        k kVar2 = new k("BOTTOM_UP", 1);
        BOTTOM_UP = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = W.B(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
