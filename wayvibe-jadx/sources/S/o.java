package S;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o Filled;
    public static final o Outlined;

    static {
        o oVar = new o("Filled", 0);
        Filled = oVar;
        o oVar2 = new o("Outlined", 1);
        Outlined = oVar2;
        $VALUES = new o[]{oVar, oVar2};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
