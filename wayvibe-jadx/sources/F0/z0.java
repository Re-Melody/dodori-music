package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 CancelTraversal;
    public static final z0 ContinueTraversal;
    public static final z0 SkipSubtreeAndContinueTraversal;

    static {
        z0 z0Var = new z0("ContinueTraversal", 0);
        ContinueTraversal = z0Var;
        z0 z0Var2 = new z0("SkipSubtreeAndContinueTraversal", 1);
        SkipSubtreeAndContinueTraversal = z0Var2;
        z0 z0Var3 = new z0("CancelTraversal", 2);
        CancelTraversal = z0Var3;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
