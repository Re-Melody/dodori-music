package I8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a ASYNC;
    public static final a BLOCKING;
    public static final a FUTURE;

    static {
        a aVar = new a("BLOCKING", 0);
        BLOCKING = aVar;
        a aVar2 = new a("FUTURE", 1);
        FUTURE = aVar2;
        a aVar3 = new a("ASYNC", 2);
        ASYNC = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
