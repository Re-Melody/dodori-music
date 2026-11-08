package C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {
    private static final /* synthetic */ I[] $VALUES;
    public static final I Both;
    public static final I Horizontal;
    public static final I Vertical;

    static {
        I i10 = new I("Vertical", 0);
        Vertical = i10;
        I i11 = new I("Horizontal", 1);
        Horizontal = i11;
        I i12 = new I("Both", 2);
        Both = i12;
        $VALUES = new I[]{i10, i11, i12};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }
}
