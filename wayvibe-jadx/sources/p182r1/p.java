package p182r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p CENTER;
    public static final p END;
    public static final p NONE;
    public static final p START;

    static {
        p pVar = new p("NONE", 0);
        NONE = pVar;
        p pVar2 = new p("START", 1);
        START = pVar2;
        p pVar3 = new p("END", 2);
        END = pVar3;
        p pVar4 = new p("CENTER", 3);
        CENTER = pVar4;
        $VALUES = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
