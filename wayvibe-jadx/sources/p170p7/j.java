package p170p7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ASCENDING;
    public static final j CONTAINS;
    public static final j DESCENDING;

    static {
        j jVar = new j("ASCENDING", 0);
        ASCENDING = jVar;
        j jVar2 = new j("DESCENDING", 1);
        DESCENDING = jVar2;
        j jVar3 = new j("CONTAINS", 2);
        CONTAINS = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
