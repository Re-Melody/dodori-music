package p104j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEFAULT;
    public static final c HIGHEST;
    public static final c VERY_LOW;

    static {
        c cVar = new c("DEFAULT", 0);
        DEFAULT = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        VERY_LOW = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        HIGHEST = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
