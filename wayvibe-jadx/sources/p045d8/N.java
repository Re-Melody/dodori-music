package p045d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class N {
    private static final /* synthetic */ N[] $VALUES;
    public static final N opaque;
    public static final N transparent;

    static {
        N n6 = new N("opaque", 0);
        opaque = n6;
        N n10 = new N("transparent", 1);
        transparent = n10;
        $VALUES = new N[]{n6, n10};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }
}
