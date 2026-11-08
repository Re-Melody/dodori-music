package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 BIDI_STREAMING;
    public static final g0 CLIENT_STREAMING;
    public static final g0 SERVER_STREAMING;
    public static final g0 UNARY;
    public static final g0 UNKNOWN;

    static {
        g0 g0Var = new g0("UNARY", 0);
        UNARY = g0Var;
        g0 g0Var2 = new g0("CLIENT_STREAMING", 1);
        CLIENT_STREAMING = g0Var2;
        g0 g0Var3 = new g0("SERVER_STREAMING", 2);
        SERVER_STREAMING = g0Var3;
        g0 g0Var4 = new g0("BIDI_STREAMING", 3);
        BIDI_STREAMING = g0Var4;
        g0 g0Var5 = new g0("UNKNOWN", 4);
        UNKNOWN = g0Var5;
        $VALUES = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
