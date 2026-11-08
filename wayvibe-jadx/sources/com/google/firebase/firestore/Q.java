package com.google.firebase.firestore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static final /* synthetic */ Q[] $VALUES;
    public static final Q CACHE;
    public static final Q DEFAULT;

    static {
        Q q5 = new Q("DEFAULT", 0);
        DEFAULT = q5;
        Q q9 = new Q("CACHE", 1);
        CACHE = q9;
        $VALUES = new Q[]{q5, q9};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) $VALUES.clone();
    }
}
