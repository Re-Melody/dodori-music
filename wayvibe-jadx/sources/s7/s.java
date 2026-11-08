package s7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s Backoff;
    public static final s Error;
    public static final s Healthy;
    public static final s Initial;
    public static final s Open;
    public static final s Starting;

    static {
        s sVar = new s("Initial", 0);
        Initial = sVar;
        s sVar2 = new s("Starting", 1);
        Starting = sVar2;
        s sVar3 = new s("Open", 2);
        Open = sVar3;
        s sVar4 = new s("Healthy", 3);
        Healthy = sVar4;
        s sVar5 = new s("Error", 4);
        Error = sVar5;
        s sVar6 = new s("Backoff", 5);
        Backoff = sVar6;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
