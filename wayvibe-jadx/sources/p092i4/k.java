package p092i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k IGNORE;
    public static final k RESPECT_ALL;
    public static final k RESPECT_PERFORMANCE;

    static {
        k kVar = new k("IGNORE", 0);
        IGNORE = kVar;
        k kVar2 = new k("RESPECT_PERFORMANCE", 1);
        RESPECT_PERFORMANCE = kVar2;
        k kVar3 = new k("RESPECT_ALL", 2);
        RESPECT_ALL = kVar3;
        $VALUES = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
