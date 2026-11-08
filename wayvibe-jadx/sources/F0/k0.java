package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 Height;
    public static final k0 Width;

    static {
        k0 k0Var = new k0("Width", 0);
        Width = k0Var;
        k0 k0Var2 = new k0("Height", 1);
        Height = k0Var2;
        $VALUES = new k0[]{k0Var, k0Var2};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
