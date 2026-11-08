package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 CUSTOM_MANAGERS;
    public static final z0 FAKE;
    public static final z0 MTLS;

    static {
        z0 z0Var = new z0("FAKE", 0);
        FAKE = z0Var;
        z0 z0Var2 = new z0("MTLS", 1);
        MTLS = z0Var2;
        z0 z0Var3 = new z0("CUSTOM_MANAGERS", 2);
        CUSTOM_MANAGERS = z0Var3;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
