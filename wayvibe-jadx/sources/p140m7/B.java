package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B {
    private static final /* synthetic */ B[] $VALUES;
    public static final B OFFLINE;
    public static final B ONLINE;
    public static final B UNKNOWN;

    static {
        B b10 = new B("UNKNOWN", 0);
        UNKNOWN = b10;
        B b11 = new B("ONLINE", 1);
        ONLINE = b11;
        B b12 = new B("OFFLINE", 2);
        OFFLINE = b12;
        $VALUES = new B[]{b10, b11, b12};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }
}
