package M8;

import D7.W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ T8.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j NONE;
    public static final j PUBLICATION;
    public static final j SYNCHRONIZED;

    static {
        j jVar = new j("SYNCHRONIZED", 0);
        SYNCHRONIZED = jVar;
        j jVar2 = new j("PUBLICATION", 1);
        PUBLICATION = jVar2;
        j jVar3 = new j("NONE", 2);
        NONE = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = W.B(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
