package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A Left;
    public static final A Middle;
    public static final A Right;

    static {
        A a10 = new A("Left", 0);
        Left = a10;
        A a11 = new A("Middle", 1);
        Middle = a11;
        A a12 = new A("Right", 2);
        Right = a12;
        $VALUES = new A[]{a10, a11, a12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
