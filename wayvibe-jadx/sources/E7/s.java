package E7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s ALLOW;
    public static final s BLOCK_ALL;
    public static final s BLOCK_INACCESSIBLE;
    public static final s INDECISIVE;

    static {
        s sVar = new s("ALLOW", 0);
        ALLOW = sVar;
        s sVar2 = new s("INDECISIVE", 1);
        INDECISIVE = sVar2;
        s sVar3 = new s("BLOCK_INACCESSIBLE", 2);
        BLOCK_INACCESSIBLE = sVar3;
        s sVar4 = new s("BLOCK_ALL", 3);
        BLOCK_ALL = sVar4;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
