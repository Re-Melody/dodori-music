package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 ASCENDING;
    public static final z0 DESCENDING;

    static {
        z0 z0Var = new z0("ASCENDING", 0);
        ASCENDING = z0Var;
        z0 z0Var2 = new z0("DESCENDING", 1);
        DESCENDING = z0Var2;
        $VALUES = new z0[]{z0Var, z0Var2};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
