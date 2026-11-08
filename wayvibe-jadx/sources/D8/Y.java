package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Y {
    private static final /* synthetic */ Y[] $VALUES;
    public static final Y INSTANCE;

    static {
        Y y6 = new Y("INSTANCE", 0);
        INSTANCE = y6;
        $VALUES = new Y[]{y6};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) $VALUES.clone();
    }
}
