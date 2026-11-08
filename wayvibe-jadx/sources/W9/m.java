package W9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m DESTINATION;
    public static final m LABEL;
    public static final m PARAGRAPH;
    public static final m START_DEFINITION;
    public static final m START_TITLE;
    public static final m TITLE;

    static {
        m mVar = new m("START_DEFINITION", 0);
        START_DEFINITION = mVar;
        m mVar2 = new m("LABEL", 1);
        LABEL = mVar2;
        m mVar3 = new m("DESTINATION", 2);
        DESTINATION = mVar3;
        m mVar4 = new m("START_TITLE", 3);
        START_TITLE = mVar4;
        m mVar5 = new m("TITLE", 4);
        TITLE = mVar5;
        m mVar6 = new m("PARAGRAPH", 5);
        PARAGRAPH = mVar6;
        $VALUES = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
