package p160o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A EXISTENCE_FILTER_MISMATCH;
    public static final A EXISTENCE_FILTER_MISMATCH_BLOOM;
    public static final A LIMBO_RESOLUTION;
    public static final A LISTEN;

    static {
        A a10 = new A("LISTEN", 0);
        LISTEN = a10;
        A a11 = new A("EXISTENCE_FILTER_MISMATCH", 1);
        EXISTENCE_FILTER_MISMATCH = a11;
        A a12 = new A("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        EXISTENCE_FILTER_MISMATCH_BLOOM = a12;
        A a13 = new A("LIMBO_RESOLUTION", 3);
        LIMBO_RESOLUTION = a13;
        $VALUES = new A[]{a10, a11, a12, a13};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
