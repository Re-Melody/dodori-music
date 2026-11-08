package p207t7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q DEBUG;
    public static final q NONE;
    public static final q WARN;

    static {
        q qVar = new q("DEBUG", 0);
        DEBUG = qVar;
        q qVar2 = new q("WARN", 1);
        WARN = qVar2;
        q qVar3 = new q("NONE", 2);
        NONE = qVar3;
        $VALUES = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
