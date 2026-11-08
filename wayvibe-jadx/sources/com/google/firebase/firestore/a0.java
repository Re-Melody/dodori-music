package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 EXCLUDE;
    public static final a0 INCLUDE;

    static {
        a0 a0Var = new a0("EXCLUDE", 0);
        EXCLUDE = a0Var;
        a0 a0Var2 = new a0("INCLUDE", 1);
        INCLUDE = a0Var2;
        $VALUES = new a0[]{a0Var, a0Var2};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
