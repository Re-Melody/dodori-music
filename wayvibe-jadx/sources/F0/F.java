package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F {
    private static final /* synthetic */ F[] $VALUES;
    public static final F InLayoutBlock;
    public static final F InMeasureBlock;
    public static final F NotUsed;

    static {
        F f10 = new F("InMeasureBlock", 0);
        InMeasureBlock = f10;
        F f11 = new F("InLayoutBlock", 1);
        InLayoutBlock = f11;
        F f12 = new F("NotUsed", 2);
        NotUsed = f12;
        $VALUES = new F[]{f10, f11, f12};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }
}
