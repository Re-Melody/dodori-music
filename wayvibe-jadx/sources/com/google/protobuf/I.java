package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {
    private static final /* synthetic */ I[] $VALUES;
    public static final I BUILD_MESSAGE_INFO;
    public static final I GET_DEFAULT_INSTANCE;
    public static final I GET_MEMOIZED_IS_INITIALIZED;
    public static final I GET_PARSER;
    public static final I NEW_BUILDER;
    public static final I NEW_MUTABLE_INSTANCE;
    public static final I SET_MEMOIZED_IS_INITIALIZED;

    static {
        I i10 = new I("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = i10;
        I i11 = new I("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = i11;
        I i12 = new I("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = i12;
        I i13 = new I("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = i13;
        I i14 = new I("NEW_BUILDER", 4);
        NEW_BUILDER = i14;
        I i15 = new I("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = i15;
        I i16 = new I("GET_PARSER", 6);
        GET_PARSER = i16;
        $VALUES = new I[]{i10, i11, i12, i13, i14, i15, i16};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }
}
