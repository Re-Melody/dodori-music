package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 ASCENDING;
    public static final f0 DESCENDING;

    static {
        f0 f0Var = new f0("ASCENDING", 0);
        ASCENDING = f0Var;
        f0 f0Var2 = new f0("DESCENDING", 1);
        DESCENDING = f0Var2;
        $VALUES = new f0[]{f0Var, f0Var2};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
