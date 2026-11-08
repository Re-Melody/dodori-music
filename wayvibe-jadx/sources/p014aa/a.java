package p014aa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLOCKS;
    public static final a BLOCKS_AND_INLINES;
    public static final a NONE;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("BLOCKS", 1);
        BLOCKS = aVar2;
        a aVar3 = new a("BLOCKS_AND_INLINES", 2);
        BLOCKS_AND_INLINES = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
