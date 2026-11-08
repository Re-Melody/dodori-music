package p119k9;

import D7.W;
import T8.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class E {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ E[] $VALUES;
    public static final E ATOMIC;
    public static final E DEFAULT;
    public static final E LAZY;
    public static final E UNDISPATCHED;

    static {
        E e2 = new E("DEFAULT", 0);
        DEFAULT = e2;
        E e4 = new E("LAZY", 1);
        LAZY = e4;
        E e7 = new E("ATOMIC", 2);
        ATOMIC = e7;
        E e10 = new E("UNDISPATCHED", 3);
        UNDISPATCHED = e10;
        E[] eArr = {e2, e4, e7, e10};
        $VALUES = eArr;
        $ENTRIES = W.B(eArr);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }
}
