package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    static final r DEFAULT;
    public static final r ESTIMATE;
    public static final r NONE;
    public static final r PREVIOUS;

    static {
        r rVar = new r("NONE", 0);
        NONE = rVar;
        r rVar2 = new r("ESTIMATE", 1);
        ESTIMATE = rVar2;
        r rVar3 = new r("PREVIOUS", 2);
        PREVIOUS = rVar3;
        $VALUES = new r[]{rVar, rVar2, rVar3};
        DEFAULT = rVar;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
