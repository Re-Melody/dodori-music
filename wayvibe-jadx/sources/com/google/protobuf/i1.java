package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 ASCENDING;
    public static final i1 DESCENDING;

    static {
        i1 i1Var = new i1("ASCENDING", 0);
        ASCENDING = i1Var;
        i1 i1Var2 = new i1("DESCENDING", 1);
        DESCENDING = i1Var2;
        $VALUES = new i1[]{i1Var, i1Var2};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}
