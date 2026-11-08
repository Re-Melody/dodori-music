package K;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    public static final P Cursor;
    public static final P SelectionEnd;
    public static final P SelectionStart;

    static {
        P p10 = new P("Cursor", 0);
        Cursor = p10;
        P p11 = new P("SelectionStart", 1);
        SelectionStart = p11;
        P p12 = new P("SelectionEnd", 2);
        SelectionEnd = p12;
        $VALUES = new P[]{p10, p11, p12};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}
