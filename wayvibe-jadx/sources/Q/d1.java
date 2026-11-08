package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 ActionPerformed;
    public static final d1 Dismissed;

    static {
        d1 d1Var = new d1("Dismissed", 0);
        Dismissed = d1Var;
        d1 d1Var2 = new d1("ActionPerformed", 1);
        ActionPerformed = d1Var2;
        $VALUES = new d1[]{d1Var, d1Var2};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
