package p170p7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m FOUND_DOCUMENT;
    public static final m INVALID;
    public static final m NO_DOCUMENT;
    public static final m UNKNOWN_DOCUMENT;

    static {
        m mVar = new m("INVALID", 0);
        INVALID = mVar;
        m mVar2 = new m("FOUND_DOCUMENT", 1);
        FOUND_DOCUMENT = mVar2;
        m mVar3 = new m("NO_DOCUMENT", 2);
        NO_DOCUMENT = mVar3;
        m mVar4 = new m("UNKNOWN_DOCUMENT", 3);
        UNKNOWN_DOCUMENT = mVar4;
        $VALUES = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
