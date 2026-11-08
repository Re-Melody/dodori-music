package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M0 {
    private static final /* synthetic */ M0[] $VALUES;
    public static final M0 Indefinite;
    public static final M0 Long;
    public static final M0 Short;

    static {
        M0 m8 = new M0("Short", 0);
        Short = m8;
        M0 m10 = new M0("Long", 1);
        Long = m10;
        M0 m11 = new M0("Indefinite", 2);
        Indefinite = m11;
        $VALUES = new M0[]{m8, m10, m11};
    }

    public static M0 valueOf(String str) {
        return (M0) Enum.valueOf(M0.class, str);
    }

    public static M0[] values() {
        return (M0[]) $VALUES.clone();
    }
}
