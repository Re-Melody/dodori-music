package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 EDITIONS;
    public static final a0 PROTO2;
    public static final a0 PROTO3;

    static {
        a0 a0Var = new a0("PROTO2", 0);
        PROTO2 = a0Var;
        a0 a0Var2 = new a0("PROTO3", 1);
        PROTO3 = a0Var2;
        a0 a0Var3 = new a0("EDITIONS", 2);
        EDITIONS = a0Var3;
        $VALUES = new a0[]{a0Var, a0Var2, a0Var3};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
