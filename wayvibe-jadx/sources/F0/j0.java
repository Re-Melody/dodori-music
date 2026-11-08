package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 Max;
    public static final j0 Min;

    static {
        j0 j0Var = new j0("Min", 0);
        Min = j0Var;
        j0 j0Var2 = new j0("Max", 1);
        Max = j0Var2;
        $VALUES = new j0[]{j0Var, j0Var2};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
