package D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0192s {
    private static final /* synthetic */ EnumC0192s[] $VALUES;
    public static final EnumC0192s Height;
    public static final EnumC0192s Width;

    static {
        EnumC0192s enumC0192s = new EnumC0192s("Width", 0);
        Width = enumC0192s;
        EnumC0192s enumC0192s2 = new EnumC0192s("Height", 1);
        Height = enumC0192s2;
        $VALUES = new EnumC0192s[]{enumC0192s, enumC0192s2};
    }

    public static EnumC0192s valueOf(String str) {
        return (EnumC0192s) Enum.valueOf(EnumC0192s.class, str);
    }

    public static EnumC0192s[] values() {
        return (EnumC0192s[]) $VALUES.clone();
    }
}
