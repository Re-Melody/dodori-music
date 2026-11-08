package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2054f {
    private static final /* synthetic */ EnumC2054f[] $VALUES;
    public static final EnumC2054f ADDED;
    public static final EnumC2054f METADATA;
    public static final EnumC2054f MODIFIED;
    public static final EnumC2054f REMOVED;

    static {
        EnumC2054f enumC2054f = new EnumC2054f("REMOVED", 0);
        REMOVED = enumC2054f;
        EnumC2054f enumC2054f2 = new EnumC2054f("ADDED", 1);
        ADDED = enumC2054f2;
        EnumC2054f enumC2054f3 = new EnumC2054f("MODIFIED", 2);
        MODIFIED = enumC2054f3;
        EnumC2054f enumC2054f4 = new EnumC2054f("METADATA", 3);
        METADATA = enumC2054f4;
        $VALUES = new EnumC2054f[]{enumC2054f, enumC2054f2, enumC2054f3, enumC2054f4};
    }

    public static EnumC2054f valueOf(String str) {
        return (EnumC2054f) Enum.valueOf(EnumC2054f.class, str);
    }

    public static EnumC2054f[] values() {
        return (EnumC2054f[]) $VALUES.clone();
    }
}
