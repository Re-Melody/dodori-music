package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 INTEGRITY;
    public static final n0 NONE;
    public static final n0 PRIVACY_AND_INTEGRITY;

    static {
        n0 n0Var = new n0("NONE", 0);
        NONE = n0Var;
        n0 n0Var2 = new n0("INTEGRITY", 1);
        INTEGRITY = n0Var2;
        n0 n0Var3 = new n0("PRIVACY_AND_INTEGRITY", 2);
        PRIVACY_AND_INTEGRITY = n0Var3;
        $VALUES = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
