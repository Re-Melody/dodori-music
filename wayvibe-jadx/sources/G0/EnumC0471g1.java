package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: G0.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0471g1 {
    private static final /* synthetic */ EnumC0471g1[] $VALUES;
    public static final EnumC0471g1 Hidden;
    public static final EnumC0471g1 Shown;

    static {
        EnumC0471g1 enumC0471g1 = new EnumC0471g1("Shown", 0);
        Shown = enumC0471g1;
        EnumC0471g1 enumC0471g2 = new EnumC0471g1("Hidden", 1);
        Hidden = enumC0471g2;
        $VALUES = new EnumC0471g1[]{enumC0471g1, enumC0471g2};
    }

    public static EnumC0471g1 valueOf(String str) {
        return (EnumC0471g1) Enum.valueOf(EnumC0471g1.class, str);
    }

    public static EnumC0471g1[] values() {
        return (EnumC0471g1[]) $VALUES.clone();
    }
}
