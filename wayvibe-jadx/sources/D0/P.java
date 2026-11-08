package D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    public static final P Max;
    public static final P Min;

    static {
        P p10 = new P("Min", 0);
        Min = p10;
        P p11 = new P("Max", 1);
        Max = p11;
        $VALUES = new P[]{p10, p11};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
