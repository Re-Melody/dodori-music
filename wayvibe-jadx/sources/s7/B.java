package s7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B {
    private static final /* synthetic */ B[] $VALUES;
    public static final B Added;
    public static final B Current;
    public static final B NoChange;
    public static final B Removed;
    public static final B Reset;

    static {
        B b10 = new B("NoChange", 0);
        NoChange = b10;
        B b11 = new B("Added", 1);
        Added = b11;
        B b12 = new B("Removed", 2);
        Removed = b12;
        B b13 = new B("Current", 3);
        Current = b13;
        B b14 = new B("Reset", 4);
        Reset = b14;
        $VALUES = new B[]{b10, b11, b12, b13, b14};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }
}
