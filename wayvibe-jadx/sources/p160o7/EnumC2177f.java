package p160o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2177f {
    private static final /* synthetic */ EnumC2177f[] $VALUES;
    public static final EnumC2177f FULL;
    public static final EnumC2177f NONE;
    public static final EnumC2177f PARTIAL;

    static {
        EnumC2177f enumC2177f = new EnumC2177f("NONE", 0);
        NONE = enumC2177f;
        EnumC2177f enumC2177f2 = new EnumC2177f("PARTIAL", 1);
        PARTIAL = enumC2177f2;
        EnumC2177f enumC2177f3 = new EnumC2177f("FULL", 2);
        FULL = enumC2177f3;
        $VALUES = new EnumC2177f[]{enumC2177f, enumC2177f2, enumC2177f3};
    }

    public static EnumC2177f valueOf(String str) {
        return (EnumC2177f) Enum.valueOf(EnumC2177f.class, str);
    }

    public static EnumC2177f[] values() {
        return (EnumC2177f[]) $VALUES.clone();
    }
}
