package p140m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y ADDED;
    public static final y REMOVED;

    static {
        y yVar = new y("ADDED", 0);
        ADDED = yVar;
        y yVar2 = new y("REMOVED", 1);
        REMOVED = yVar2;
        $VALUES = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
