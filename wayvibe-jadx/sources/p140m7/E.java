package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class E {
    private static final /* synthetic */ E[] $VALUES;
    public static final E LIMIT_TO_FIRST;
    public static final E LIMIT_TO_LAST;

    static {
        E e2 = new E("LIMIT_TO_FIRST", 0);
        LIMIT_TO_FIRST = e2;
        E e4 = new E("LIMIT_TO_LAST", 1);
        LIMIT_TO_LAST = e4;
        $VALUES = new E[]{e2, e4};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }
}
