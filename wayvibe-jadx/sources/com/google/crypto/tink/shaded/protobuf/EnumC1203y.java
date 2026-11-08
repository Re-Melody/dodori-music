package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1203y {
    private static final /* synthetic */ EnumC1203y[] $VALUES;
    public static final EnumC1203y BUILD_MESSAGE_INFO;
    public static final EnumC1203y GET_DEFAULT_INSTANCE;
    public static final EnumC1203y GET_MEMOIZED_IS_INITIALIZED;
    public static final EnumC1203y GET_PARSER;
    public static final EnumC1203y NEW_BUILDER;
    public static final EnumC1203y NEW_MUTABLE_INSTANCE;
    public static final EnumC1203y SET_MEMOIZED_IS_INITIALIZED;

    static {
        EnumC1203y enumC1203y = new EnumC1203y("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = enumC1203y;
        EnumC1203y enumC1203y2 = new EnumC1203y("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = enumC1203y2;
        EnumC1203y enumC1203y3 = new EnumC1203y("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = enumC1203y3;
        EnumC1203y enumC1203y4 = new EnumC1203y("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = enumC1203y4;
        EnumC1203y enumC1203y5 = new EnumC1203y("NEW_BUILDER", 4);
        NEW_BUILDER = enumC1203y5;
        EnumC1203y enumC1203y6 = new EnumC1203y("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = enumC1203y6;
        EnumC1203y enumC1203y7 = new EnumC1203y("GET_PARSER", 6);
        GET_PARSER = enumC1203y7;
        $VALUES = new EnumC1203y[]{enumC1203y, enumC1203y2, enumC1203y3, enumC1203y4, enumC1203y5, enumC1203y6, enumC1203y7};
    }

    public static EnumC1203y valueOf(String str) {
        return (EnumC1203y) Enum.valueOf(EnumC1203y.class, str);
    }

    public static EnumC1203y[] values() {
        return (EnumC1203y[]) $VALUES.clone();
    }
}
