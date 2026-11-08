package p201t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h FIXED;
    public static final h MATCH_CONSTRAINT;
    public static final h MATCH_PARENT;
    public static final h WRAP_CONTENT;

    static {
        h hVar = new h("FIXED", 0);
        FIXED = hVar;
        h hVar2 = new h("WRAP_CONTENT", 1);
        WRAP_CONTENT = hVar2;
        h hVar3 = new h("MATCH_CONSTRAINT", 2);
        MATCH_CONSTRAINT = hVar3;
        h hVar4 = new h("MATCH_PARENT", 3);
        MATCH_PARENT = hVar4;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
