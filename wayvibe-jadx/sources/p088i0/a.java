package p088i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a SHOW_ORIGINAL;
    public static final a SHOW_TRANSLATED;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        SHOW_ORIGINAL = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        SHOW_TRANSLATED = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
