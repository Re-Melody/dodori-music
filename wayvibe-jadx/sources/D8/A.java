package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A DROPPED;
    public static final A MISCARRIED;
    public static final A PROCESSED;
    public static final A REFUSED;

    static {
        A a10 = new A("PROCESSED", 0);
        PROCESSED = a10;
        A a11 = new A("REFUSED", 1);
        REFUSED = a11;
        A a12 = new A("DROPPED", 2);
        DROPPED = a12;
        A a13 = new A("MISCARRIED", 3);
        MISCARRIED = a13;
        $VALUES = new A[]{a10, a11, a12, a13};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
