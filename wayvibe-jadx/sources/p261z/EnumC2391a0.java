package p261z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2391a0 {
    private static final /* synthetic */ EnumC2391a0[] $VALUES;
    public static final EnumC2391a0 Horizontal;
    public static final EnumC2391a0 Vertical;

    static {
        EnumC2391a0 enumC2391a0 = new EnumC2391a0("Vertical", 0);
        Vertical = enumC2391a0;
        EnumC2391a0 enumC2391a1 = new EnumC2391a0("Horizontal", 1);
        Horizontal = enumC2391a1;
        $VALUES = new EnumC2391a0[]{enumC2391a0, enumC2391a1};
    }

    public static EnumC2391a0 valueOf(String str) {
        return (EnumC2391a0) Enum.valueOf(EnumC2391a0.class, str);
    }

    public static EnumC2391a0[] values() {
        return (EnumC2391a0[]) $VALUES.clone();
    }
}
