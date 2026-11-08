package p150n8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b DETACHED;
    public static final b HIDDEN;
    public static final b INACTIVE;
    public static final b PAUSED;
    public static final b RESUMED;

    static {
        b bVar = new b("DETACHED", 0);
        DETACHED = bVar;
        b bVar2 = new b("RESUMED", 1);
        RESUMED = bVar2;
        b bVar3 = new b("INACTIVE", 2);
        INACTIVE = bVar3;
        b bVar4 = new b("HIDDEN", 3);
        HIDDEN = bVar4;
        b bVar5 = new b("PAUSED", 4);
        PAUSED = bVar5;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
