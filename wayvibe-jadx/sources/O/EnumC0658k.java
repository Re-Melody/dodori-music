package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: O.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0658k {
    private static final /* synthetic */ EnumC0658k[] $VALUES;
    public static final EnumC0658k COLLAPSED;
    public static final EnumC0658k CROSSED;
    public static final EnumC0658k NOT_CROSSED;

    static {
        EnumC0658k enumC0658k = new EnumC0658k("CROSSED", 0);
        CROSSED = enumC0658k;
        EnumC0658k enumC0658k2 = new EnumC0658k("NOT_CROSSED", 1);
        NOT_CROSSED = enumC0658k2;
        EnumC0658k enumC0658k3 = new EnumC0658k("COLLAPSED", 2);
        COLLAPSED = enumC0658k3;
        $VALUES = new EnumC0658k[]{enumC0658k, enumC0658k2, enumC0658k3};
    }

    public static EnumC0658k valueOf(String str) {
        return (EnumC0658k) Enum.valueOf(EnumC0658k.class, str);
    }

    public static EnumC0658k[] values() {
        return (EnumC0658k[]) $VALUES.clone();
    }
}
