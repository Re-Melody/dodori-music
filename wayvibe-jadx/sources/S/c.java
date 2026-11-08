package S;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c Focused;
    public static final c UnfocusedEmpty;
    public static final c UnfocusedNotEmpty;

    static {
        c cVar = new c("Focused", 0);
        Focused = cVar;
        c cVar2 = new c("UnfocusedEmpty", 1);
        UnfocusedEmpty = cVar2;
        c cVar3 = new c("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
