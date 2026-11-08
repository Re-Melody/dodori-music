package p089i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k BOUNDS;
    public static final k NONE;

    static {
        k kVar = new k("NONE", 0);
        NONE = kVar;
        k kVar2 = new k("BOUNDS", 1);
        BOUNDS = kVar2;
        $VALUES = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
