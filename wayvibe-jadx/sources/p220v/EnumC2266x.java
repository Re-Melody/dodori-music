package p220v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2266x {
    private static final /* synthetic */ EnumC2266x[] $VALUES;
    public static final EnumC2266x PostExit;
    public static final EnumC2266x PreEnter;
    public static final EnumC2266x Visible;

    static {
        EnumC2266x enumC2266x = new EnumC2266x("PreEnter", 0);
        PreEnter = enumC2266x;
        EnumC2266x enumC2266x2 = new EnumC2266x("Visible", 1);
        Visible = enumC2266x2;
        EnumC2266x enumC2266x3 = new EnumC2266x("PostExit", 2);
        PostExit = enumC2266x3;
        $VALUES = new EnumC2266x[]{enumC2266x, enumC2266x2, enumC2266x3};
    }

    public static EnumC2266x valueOf(String str) {
        return (EnumC2266x) Enum.valueOf(EnumC2266x.class, str);
    }

    public static EnumC2266x[] values() {
        return (EnumC2266x[]) $VALUES.clone();
    }
}
