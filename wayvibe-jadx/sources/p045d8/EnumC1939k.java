package p045d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1939k {
    private static final /* synthetic */ EnumC1939k[] $VALUES;
    public static final EnumC1939k background;
    public static final EnumC1939k overlay;

    static {
        EnumC1939k enumC1939k = new EnumC1939k("background", 0);
        background = enumC1939k;
        EnumC1939k enumC1939k2 = new EnumC1939k("overlay", 1);
        overlay = enumC1939k2;
        $VALUES = new EnumC1939k[]{enumC1939k, enumC1939k2};
    }

    public static EnumC1939k valueOf(String str) {
        return (EnumC1939k) Enum.valueOf(EnumC1939k.class, str);
    }

    public static EnumC1939k[] values() {
        return (EnumC1939k[]) $VALUES.clone();
    }
}
