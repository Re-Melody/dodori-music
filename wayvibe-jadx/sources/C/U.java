package C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class U {
    private static final /* synthetic */ U[] $VALUES;
    public static final U Max;
    public static final U Min;

    static {
        U u10 = new U("Min", 0);
        Min = u10;
        U u11 = new U("Max", 1);
        Max = u11;
        $VALUES = new U[]{u10, u11};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) $VALUES.clone();
    }
}
