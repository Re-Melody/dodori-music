package V0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A HideKeyboard;
    public static final A ShowKeyboard;
    public static final A StartInput;
    public static final A StopInput;

    static {
        A a10 = new A("StartInput", 0);
        StartInput = a10;
        A a11 = new A("StopInput", 1);
        StopInput = a11;
        A a12 = new A("ShowKeyboard", 2);
        ShowKeyboard = a12;
        A a13 = new A("HideKeyboard", 3);
        HideKeyboard = a13;
        $VALUES = new A[]{a10, a11, a12, a13};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
