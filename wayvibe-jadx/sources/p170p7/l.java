package p170p7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l HAS_COMMITTED_MUTATIONS;
    public static final l HAS_LOCAL_MUTATIONS;
    public static final l SYNCED;

    static {
        l lVar = new l("HAS_LOCAL_MUTATIONS", 0);
        HAS_LOCAL_MUTATIONS = lVar;
        l lVar2 = new l("HAS_COMMITTED_MUTATIONS", 1);
        HAS_COMMITTED_MUTATIONS = lVar2;
        l lVar3 = new l("SYNCED", 2);
        SYNCED = lVar3;
        $VALUES = new l[]{lVar, lVar2, lVar3};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
