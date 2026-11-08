package p028c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k Ltr;
    public static final k Rtl;

    static {
        k kVar = new k("Ltr", 0);
        Ltr = kVar;
        k kVar2 = new k("Rtl", 1);
        Rtl = kVar2;
        $VALUES = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
