package p143n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class T {
    private static final /* synthetic */ T[] $VALUES;
    public static final T Clockwise;
    public static final T CounterClockwise;

    static {
        T t10 = new T("CounterClockwise", 0);
        CounterClockwise = t10;
        T t11 = new T("Clockwise", 1);
        Clockwise = t11;
        $VALUES = new T[]{t10, t11};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) $VALUES.clone();
    }
}
