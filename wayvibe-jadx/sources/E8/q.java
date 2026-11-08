package E8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES;
    public static final q INBOUND;
    public static final q OUTBOUND;

    static {
        q qVar = new q("INBOUND", 0);
        INBOUND = qVar;
        q qVar2 = new q("OUTBOUND", 1);
        OUTBOUND = qVar2;
        $VALUES = new q[]{qVar, qVar2};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
