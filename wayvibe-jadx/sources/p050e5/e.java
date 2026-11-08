package p050e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e best;
    public static final e bestForNavigation;
    public static final e high;
    public static final e low;
    public static final e lowest;
    public static final e medium;

    static {
        e eVar = new e("lowest", 0);
        lowest = eVar;
        e eVar2 = new e("low", 1);
        low = eVar2;
        e eVar3 = new e("medium", 2);
        medium = eVar3;
        e eVar4 = new e("high", 3);
        high = eVar4;
        e eVar5 = new e("best", 4);
        best = eVar5;
        e eVar6 = new e("bestForNavigation", 5);
        bestForNavigation = eVar6;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
