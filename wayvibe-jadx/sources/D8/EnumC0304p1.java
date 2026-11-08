package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D8.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0304p1 {
    private static final /* synthetic */ EnumC0304p1[] $VALUES;
    public static final EnumC0304p1 BODY;
    public static final EnumC0304p1 HEADER;

    static {
        EnumC0304p1 enumC0304p1 = new EnumC0304p1("HEADER", 0);
        HEADER = enumC0304p1;
        EnumC0304p1 enumC0304p2 = new EnumC0304p1("BODY", 1);
        BODY = enumC0304p2;
        $VALUES = new EnumC0304p1[]{enumC0304p1, enumC0304p2};
    }

    public static EnumC0304p1 valueOf(String str) {
        return (EnumC0304p1) Enum.valueOf(EnumC0304p1.class, str);
    }

    public static EnumC0304p1[] values() {
        return (EnumC0304p1[]) $VALUES.clone();
    }
}
