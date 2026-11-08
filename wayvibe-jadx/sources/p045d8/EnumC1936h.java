package p045d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1936h {
    private static final /* synthetic */ EnumC1936h[] $VALUES;
    public static final EnumC1936h opaque;
    public static final EnumC1936h transparent;

    static {
        EnumC1936h enumC1936h = new EnumC1936h("opaque", 0);
        opaque = enumC1936h;
        EnumC1936h enumC1936h2 = new EnumC1936h("transparent", 1);
        transparent = enumC1936h2;
        $VALUES = new EnumC1936h[]{enumC1936h, enumC1936h2};
    }

    public static EnumC1936h valueOf(String str) {
        return (EnumC1936h) Enum.valueOf(EnumC1936h.class, str);
    }

    public static EnumC1936h[] values() {
        return (EnumC1936h[]) $VALUES.clone();
    }
}
