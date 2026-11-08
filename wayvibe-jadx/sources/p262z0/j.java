package p262z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j Final;
    public static final j Initial;
    public static final j Main;

    static {
        j jVar = new j("Initial", 0);
        Initial = jVar;
        j jVar2 = new j("Main", 1);
        Main = jVar2;
        j jVar3 = new j("Final", 2);
        Final = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
