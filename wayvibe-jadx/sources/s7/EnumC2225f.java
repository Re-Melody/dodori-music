package s7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2225f {
    private static final /* synthetic */ EnumC2225f[] $VALUES;
    public static final EnumC2225f REACHABLE;
    public static final EnumC2225f UNREACHABLE;

    static {
        EnumC2225f enumC2225f = new EnumC2225f("UNREACHABLE", 0);
        UNREACHABLE = enumC2225f;
        EnumC2225f enumC2225f2 = new EnumC2225f("REACHABLE", 1);
        REACHABLE = enumC2225f2;
        $VALUES = new EnumC2225f[]{enumC2225f, enumC2225f2};
    }

    public static EnumC2225f valueOf(String str) {
        return (EnumC2225f) Enum.valueOf(EnumC2225f.class, str);
    }

    public static EnumC2225f[] values() {
        return (EnumC2225f[]) $VALUES.clone();
    }
}
