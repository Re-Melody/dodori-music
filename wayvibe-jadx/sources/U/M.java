package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class M {
    private static final /* synthetic */ M[] $VALUES;
    public static final M DEFERRED;
    public static final M IGNORED;
    public static final M IMMINENT;
    public static final M SCHEDULED;

    static {
        M m8 = new M("IGNORED", 0);
        IGNORED = m8;
        M m10 = new M("SCHEDULED", 1);
        SCHEDULED = m10;
        M m11 = new M("DEFERRED", 2);
        DEFERRED = m11;
        M m12 = new M("IMMINENT", 3);
        IMMINENT = m12;
        $VALUES = new M[]{m8, m10, m11, m12};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }
}
