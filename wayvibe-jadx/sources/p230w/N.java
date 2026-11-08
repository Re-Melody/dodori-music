package p230w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class N {
    private static final /* synthetic */ N[] $VALUES;
    public static final N Default;
    public static final N PreventUserInput;
    public static final N UserInput;

    static {
        N n6 = new N("Default", 0);
        Default = n6;
        N n10 = new N("UserInput", 1);
        UserInput = n10;
        N n11 = new N("PreventUserInput", 2);
        PreventUserInput = n11;
        $VALUES = new N[]{n6, n10, n11};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }
}
