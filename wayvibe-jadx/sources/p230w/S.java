package p230w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class S {
    private static final /* synthetic */ S[] $VALUES;
    public static final S Restart;
    public static final S Reverse;

    static {
        S s8 = new S("Restart", 0);
        Restart = s8;
        S s10 = new S("Reverse", 1);
        Reverse = s10;
        $VALUES = new S[]{s8, s10};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }
}
