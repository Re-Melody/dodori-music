package D0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static final /* synthetic */ Q[] $VALUES;
    public static final Q Height;
    public static final Q Width;

    static {
        Q q5 = new Q("Width", 0);
        Width = q5;
        Q q9 = new Q("Height", 1);
        Height = q9;
        $VALUES = new Q[]{q5, q9};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) $VALUES.clone();
    }
}
