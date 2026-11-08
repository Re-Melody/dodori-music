package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1065x {
    private static final /* synthetic */ EnumC1065x[] $VALUES;
    public static final EnumC1065x BUILD_MESSAGE_INFO;
    public static final EnumC1065x GET_DEFAULT_INSTANCE;
    public static final EnumC1065x GET_MEMOIZED_IS_INITIALIZED;
    public static final EnumC1065x GET_PARSER;
    public static final EnumC1065x NEW_BUILDER;
    public static final EnumC1065x NEW_MUTABLE_INSTANCE;
    public static final EnumC1065x SET_MEMOIZED_IS_INITIALIZED;

    static {
        EnumC1065x enumC1065x = new EnumC1065x("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = enumC1065x;
        EnumC1065x enumC1065x2 = new EnumC1065x("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = enumC1065x2;
        EnumC1065x enumC1065x3 = new EnumC1065x("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = enumC1065x3;
        EnumC1065x enumC1065x4 = new EnumC1065x("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = enumC1065x4;
        EnumC1065x enumC1065x5 = new EnumC1065x("NEW_BUILDER", 4);
        NEW_BUILDER = enumC1065x5;
        EnumC1065x enumC1065x6 = new EnumC1065x("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = enumC1065x6;
        EnumC1065x enumC1065x7 = new EnumC1065x("GET_PARSER", 6);
        GET_PARSER = enumC1065x7;
        $VALUES = new EnumC1065x[]{enumC1065x, enumC1065x2, enumC1065x3, enumC1065x4, enumC1065x5, enumC1065x6, enumC1065x7};
    }

    public static EnumC1065x valueOf(String str) {
        return (EnumC1065x) Enum.valueOf(EnumC1065x.class, str);
    }

    public static EnumC1065x[] values() {
        return (EnumC1065x[]) $VALUES.clone();
    }
}
