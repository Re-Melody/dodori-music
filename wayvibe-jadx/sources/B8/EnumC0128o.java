package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0128o {
    private static final /* synthetic */ EnumC0128o[] $VALUES;
    public static final EnumC0128o CONNECTING;
    public static final EnumC0128o IDLE;
    public static final EnumC0128o READY;
    public static final EnumC0128o SHUTDOWN;
    public static final EnumC0128o TRANSIENT_FAILURE;

    static {
        EnumC0128o enumC0128o = new EnumC0128o("CONNECTING", 0);
        CONNECTING = enumC0128o;
        EnumC0128o enumC0128o2 = new EnumC0128o("READY", 1);
        READY = enumC0128o2;
        EnumC0128o enumC0128o3 = new EnumC0128o("TRANSIENT_FAILURE", 2);
        TRANSIENT_FAILURE = enumC0128o3;
        EnumC0128o enumC0128o4 = new EnumC0128o("IDLE", 3);
        IDLE = enumC0128o4;
        EnumC0128o enumC0128o5 = new EnumC0128o("SHUTDOWN", 4);
        SHUTDOWN = enumC0128o5;
        $VALUES = new EnumC0128o[]{enumC0128o, enumC0128o2, enumC0128o3, enumC0128o4, enumC0128o5};
    }

    public static EnumC0128o valueOf(String str) {
        return (EnumC0128o) Enum.valueOf(EnumC0128o.class, str);
    }

    public static EnumC0128o[] values() {
        return (EnumC0128o[]) $VALUES.clone();
    }
}
