package U7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p media;
    public static final p next;
    public static final p previous;

    static {
        p pVar = new p("media", 0);
        media = pVar;
        p pVar2 = new p("next", 1);
        next = pVar2;
        p pVar3 = new p("previous", 2);
        previous = pVar3;
        $VALUES = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
