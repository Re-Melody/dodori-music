package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: D8.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0294m0 {
    private static final /* synthetic */ EnumC0294m0[] $VALUES;
    public static final EnumC0294m0 HEADER;
    public static final EnumC0294m0 HEADER_COMMENT;
    public static final EnumC0294m0 HEADER_CRC;
    public static final EnumC0294m0 HEADER_EXTRA;
    public static final EnumC0294m0 HEADER_EXTRA_LEN;
    public static final EnumC0294m0 HEADER_NAME;
    public static final EnumC0294m0 INFLATER_NEEDS_INPUT;
    public static final EnumC0294m0 INFLATING;
    public static final EnumC0294m0 INITIALIZE_INFLATER;
    public static final EnumC0294m0 TRAILER;

    static {
        EnumC0294m0 enumC0294m0 = new EnumC0294m0("HEADER", 0);
        HEADER = enumC0294m0;
        EnumC0294m0 enumC0294m1 = new EnumC0294m0("HEADER_EXTRA_LEN", 1);
        HEADER_EXTRA_LEN = enumC0294m1;
        EnumC0294m0 enumC0294m2 = new EnumC0294m0("HEADER_EXTRA", 2);
        HEADER_EXTRA = enumC0294m2;
        EnumC0294m0 enumC0294m3 = new EnumC0294m0("HEADER_NAME", 3);
        HEADER_NAME = enumC0294m3;
        EnumC0294m0 enumC0294m4 = new EnumC0294m0("HEADER_COMMENT", 4);
        HEADER_COMMENT = enumC0294m4;
        EnumC0294m0 enumC0294m5 = new EnumC0294m0("HEADER_CRC", 5);
        HEADER_CRC = enumC0294m5;
        EnumC0294m0 enumC0294m6 = new EnumC0294m0("INITIALIZE_INFLATER", 6);
        INITIALIZE_INFLATER = enumC0294m6;
        EnumC0294m0 enumC0294m7 = new EnumC0294m0("INFLATING", 7);
        INFLATING = enumC0294m7;
        EnumC0294m0 enumC0294m8 = new EnumC0294m0("INFLATER_NEEDS_INPUT", 8);
        INFLATER_NEEDS_INPUT = enumC0294m8;
        EnumC0294m0 enumC0294m9 = new EnumC0294m0("TRAILER", 9);
        TRAILER = enumC0294m9;
        $VALUES = new EnumC0294m0[]{enumC0294m0, enumC0294m1, enumC0294m2, enumC0294m3, enumC0294m4, enumC0294m5, enumC0294m6, enumC0294m7, enumC0294m8, enumC0294m9};
    }

    public static EnumC0294m0 valueOf(String str) {
        return (EnumC0294m0) Enum.valueOf(EnumC0294m0.class, str);
    }

    public static EnumC0294m0[] values() {
        return (EnumC0294m0[]) $VALUES.clone();
    }
}
