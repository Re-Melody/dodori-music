package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 CACHE;
    public static final m0 DEFAULT;
    public static final m0 SERVER;

    static {
        m0 m0Var = new m0("DEFAULT", 0);
        DEFAULT = m0Var;
        m0 m0Var2 = new m0("SERVER", 1);
        SERVER = m0Var2;
        m0 m0Var3 = new m0("CACHE", 2);
        CACHE = m0Var3;
        $VALUES = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
