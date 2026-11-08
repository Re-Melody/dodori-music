package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m7.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2059k {
    private static final /* synthetic */ EnumC2059k[] $VALUES;
    public static final EnumC2059k INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION;
    public static final EnumC2059k INITIALIZE_LOCAL_LISTEN_ONLY;
    public static final EnumC2059k NO_ACTION_REQUIRED;
    public static final EnumC2059k REQUIRE_WATCH_CONNECTION_ONLY;

    static {
        EnumC2059k enumC2059k = new EnumC2059k("INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION", 0);
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION = enumC2059k;
        EnumC2059k enumC2059k2 = new EnumC2059k("INITIALIZE_LOCAL_LISTEN_ONLY", 1);
        INITIALIZE_LOCAL_LISTEN_ONLY = enumC2059k2;
        EnumC2059k enumC2059k3 = new EnumC2059k("REQUIRE_WATCH_CONNECTION_ONLY", 2);
        REQUIRE_WATCH_CONNECTION_ONLY = enumC2059k3;
        EnumC2059k enumC2059k4 = new EnumC2059k("NO_ACTION_REQUIRED", 3);
        NO_ACTION_REQUIRED = enumC2059k4;
        $VALUES = new EnumC2059k[]{enumC2059k, enumC2059k2, enumC2059k3, enumC2059k4};
    }

    public static EnumC2059k valueOf(String str) {
        return (EnumC2059k) Enum.valueOf(EnumC2059k.class, str);
    }

    public static EnumC2059k[] values() {
        return (EnumC2059k[]) $VALUES.clone();
    }
}
