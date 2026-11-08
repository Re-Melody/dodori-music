package p005a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h Ltr;
    public static final h Rtl;

    static {
        h hVar = new h("Ltr", 0);
        Ltr = hVar;
        h hVar2 = new h("Rtl", 1);
        Rtl = hVar2;
        $VALUES = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
