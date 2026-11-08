package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 ASCENDING;
    public static final r0 DESCENDING;

    static {
        r0 r0Var = new r0("ASCENDING", 0);
        ASCENDING = r0Var;
        r0 r0Var2 = new r0("DESCENDING", 1);
        DESCENDING = r0Var2;
        $VALUES = new r0[]{r0Var, r0Var2};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
