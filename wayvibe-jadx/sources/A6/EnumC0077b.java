package A6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0077b {
    private static final /* synthetic */ EnumC0077b[] $VALUES;
    public static final EnumC0077b DONE;
    public static final EnumC0077b FAILED;
    public static final EnumC0077b NOT_READY;
    public static final EnumC0077b READY;

    static {
        EnumC0077b enumC0077b = new EnumC0077b("READY", 0);
        READY = enumC0077b;
        EnumC0077b enumC0077b2 = new EnumC0077b("NOT_READY", 1);
        NOT_READY = enumC0077b2;
        EnumC0077b enumC0077b3 = new EnumC0077b("DONE", 2);
        DONE = enumC0077b3;
        EnumC0077b enumC0077b4 = new EnumC0077b("FAILED", 3);
        FAILED = enumC0077b4;
        $VALUES = new EnumC0077b[]{enumC0077b, enumC0077b2, enumC0077b3, enumC0077b4};
    }

    public static EnumC0077b valueOf(String str) {
        return (EnumC0077b) Enum.valueOf(EnumC0077b.class, str);
    }

    public static EnumC0077b[] values() {
        return (EnumC0077b[]) $VALUES.clone();
    }
}
