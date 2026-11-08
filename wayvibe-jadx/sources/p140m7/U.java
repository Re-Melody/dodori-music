package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class U {
    private static final /* synthetic */ U[] $VALUES;
    public static final U LOCAL;
    public static final U NONE;
    public static final U SYNCED;

    static {
        U u10 = new U("NONE", 0);
        NONE = u10;
        U u11 = new U("LOCAL", 1);
        LOCAL = u11;
        U u12 = new U("SYNCED", 2);
        SYNCED = u12;
        $VALUES = new U[]{u10, u11, u12};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) $VALUES.clone();
    }
}
