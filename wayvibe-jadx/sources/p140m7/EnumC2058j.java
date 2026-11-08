package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2058j {
    private static final /* synthetic */ EnumC2058j[] $VALUES;
    public static final EnumC2058j NO_ACTION_REQUIRED;
    public static final EnumC2058j REQUIRE_WATCH_DISCONNECTION_ONLY;
    public static final EnumC2058j TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION;
    public static final EnumC2058j TERMINATE_LOCAL_LISTEN_ONLY;

    static {
        EnumC2058j enumC2058j = new EnumC2058j("TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION", 0);
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION = enumC2058j;
        EnumC2058j enumC2058j2 = new EnumC2058j("TERMINATE_LOCAL_LISTEN_ONLY", 1);
        TERMINATE_LOCAL_LISTEN_ONLY = enumC2058j2;
        EnumC2058j enumC2058j3 = new EnumC2058j("REQUIRE_WATCH_DISCONNECTION_ONLY", 2);
        REQUIRE_WATCH_DISCONNECTION_ONLY = enumC2058j3;
        EnumC2058j enumC2058j4 = new EnumC2058j("NO_ACTION_REQUIRED", 3);
        NO_ACTION_REQUIRED = enumC2058j4;
        $VALUES = new EnumC2058j[]{enumC2058j, enumC2058j2, enumC2058j3, enumC2058j4};
    }

    public static EnumC2058j valueOf(String str) {
        return (EnumC2058j) Enum.valueOf(EnumC2058j.class, str);
    }

    public static EnumC2058j[] values() {
        return (EnumC2058j[]) $VALUES.clone();
    }
}
