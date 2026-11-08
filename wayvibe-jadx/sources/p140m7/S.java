package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class S {
    private static final /* synthetic */ S[] $VALUES;
    public static final S Argument;
    public static final S ArrayArgument;
    public static final S MergeSet;
    public static final S Set;
    public static final S Update;

    static {
        S s8 = new S("Set", 0);
        Set = s8;
        S s10 = new S("MergeSet", 1);
        MergeSet = s10;
        S s11 = new S("Update", 2);
        Update = s11;
        S s12 = new S("Argument", 3);
        Argument = s12;
        S s13 = new S("ArrayArgument", 4);
        ArrayArgument = s13;
        $VALUES = new S[]{s8, s10, s11, s12, s13};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) $VALUES.clone();
    }
}
