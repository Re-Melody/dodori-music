package p201t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d NONE;
    public static final d STRONG;
    public static final d WEAK;

    static {
        d dVar = new d("NONE", 0);
        NONE = dVar;
        d dVar2 = new d("STRONG", 1);
        STRONG = dVar2;
        d dVar3 = new d("WEAK", 2);
        WEAK = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
