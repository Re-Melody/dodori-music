package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1198t {
    private static final /* synthetic */ EnumC1198t[] $VALUES;
    public static final EnumC1198t BOOL;
    public static final EnumC1198t BOOL_LIST;
    public static final EnumC1198t BOOL_LIST_PACKED;
    public static final EnumC1198t BYTES;
    public static final EnumC1198t BYTES_LIST;
    public static final EnumC1198t DOUBLE;
    public static final EnumC1198t DOUBLE_LIST;
    public static final EnumC1198t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1198t ENUM;
    public static final EnumC1198t ENUM_LIST;
    public static final EnumC1198t ENUM_LIST_PACKED;
    public static final EnumC1198t FIXED32;
    public static final EnumC1198t FIXED32_LIST;
    public static final EnumC1198t FIXED32_LIST_PACKED;
    public static final EnumC1198t FIXED64;
    public static final EnumC1198t FIXED64_LIST;
    public static final EnumC1198t FIXED64_LIST_PACKED;
    public static final EnumC1198t FLOAT;
    public static final EnumC1198t FLOAT_LIST;
    public static final EnumC1198t FLOAT_LIST_PACKED;
    public static final EnumC1198t GROUP;
    public static final EnumC1198t GROUP_LIST;
    public static final EnumC1198t INT32;
    public static final EnumC1198t INT32_LIST;
    public static final EnumC1198t INT32_LIST_PACKED;
    public static final EnumC1198t INT64;
    public static final EnumC1198t INT64_LIST;
    public static final EnumC1198t INT64_LIST_PACKED;
    public static final EnumC1198t MAP;
    public static final EnumC1198t MESSAGE;
    public static final EnumC1198t MESSAGE_LIST;
    public static final EnumC1198t SFIXED32;
    public static final EnumC1198t SFIXED32_LIST;
    public static final EnumC1198t SFIXED32_LIST_PACKED;
    public static final EnumC1198t SFIXED64;
    public static final EnumC1198t SFIXED64_LIST;
    public static final EnumC1198t SFIXED64_LIST_PACKED;
    public static final EnumC1198t SINT32;
    public static final EnumC1198t SINT32_LIST;
    public static final EnumC1198t SINT32_LIST_PACKED;
    public static final EnumC1198t SINT64;
    public static final EnumC1198t SINT64_LIST;
    public static final EnumC1198t SINT64_LIST_PACKED;
    public static final EnumC1198t STRING;
    public static final EnumC1198t STRING_LIST;
    public static final EnumC1198t UINT32;
    public static final EnumC1198t UINT32_LIST;
    public static final EnumC1198t UINT32_LIST_PACKED;
    public static final EnumC1198t UINT64;
    public static final EnumC1198t UINT64_LIST;
    public static final EnumC1198t UINT64_LIST_PACKED;
    private static final EnumC1198t[] VALUES;
    private final EnumC1197s collection;
    private final Class<?> elementType;
    private final int id;
    private final H javaType;
    private final boolean primitiveScalar;

    static {
        EnumC1197s enumC1197s = EnumC1197s.SCALAR;
        H h10 = H.DOUBLE;
        EnumC1198t enumC1198t = new EnumC1198t("DOUBLE", 0, 0, enumC1197s, h10);
        DOUBLE = enumC1198t;
        H h11 = H.FLOAT;
        EnumC1198t enumC1198t2 = new EnumC1198t("FLOAT", 1, 1, enumC1197s, h11);
        FLOAT = enumC1198t2;
        H h12 = H.LONG;
        EnumC1198t enumC1198t3 = new EnumC1198t("INT64", 2, 2, enumC1197s, h12);
        INT64 = enumC1198t3;
        EnumC1198t enumC1198t4 = new EnumC1198t("UINT64", 3, 3, enumC1197s, h12);
        UINT64 = enumC1198t4;
        H h13 = H.INT;
        EnumC1198t enumC1198t5 = new EnumC1198t("INT32", 4, 4, enumC1197s, h13);
        INT32 = enumC1198t5;
        EnumC1198t enumC1198t6 = new EnumC1198t("FIXED64", 5, 5, enumC1197s, h12);
        FIXED64 = enumC1198t6;
        EnumC1198t enumC1198t7 = new EnumC1198t("FIXED32", 6, 6, enumC1197s, h13);
        FIXED32 = enumC1198t7;
        H h14 = H.BOOLEAN;
        EnumC1198t enumC1198t8 = new EnumC1198t("BOOL", 7, 7, enumC1197s, h14);
        BOOL = enumC1198t8;
        H h15 = H.STRING;
        EnumC1198t enumC1198t9 = new EnumC1198t("STRING", 8, 8, enumC1197s, h15);
        STRING = enumC1198t9;
        H h16 = H.MESSAGE;
        EnumC1198t enumC1198t10 = new EnumC1198t("MESSAGE", 9, 9, enumC1197s, h16);
        MESSAGE = enumC1198t10;
        H h17 = H.BYTE_STRING;
        EnumC1198t enumC1198t11 = new EnumC1198t("BYTES", 10, 10, enumC1197s, h17);
        BYTES = enumC1198t11;
        EnumC1198t enumC1198t12 = new EnumC1198t("UINT32", 11, 11, enumC1197s, h13);
        UINT32 = enumC1198t12;
        H h18 = H.ENUM;
        EnumC1198t enumC1198t13 = new EnumC1198t("ENUM", 12, 12, enumC1197s, h18);
        ENUM = enumC1198t13;
        EnumC1198t enumC1198t14 = new EnumC1198t("SFIXED32", 13, 13, enumC1197s, h13);
        SFIXED32 = enumC1198t14;
        EnumC1198t enumC1198t15 = new EnumC1198t("SFIXED64", 14, 14, enumC1197s, h12);
        SFIXED64 = enumC1198t15;
        EnumC1198t enumC1198t16 = new EnumC1198t("SINT32", 15, 15, enumC1197s, h13);
        SINT32 = enumC1198t16;
        EnumC1198t enumC1198t17 = new EnumC1198t("SINT64", 16, 16, enumC1197s, h12);
        SINT64 = enumC1198t17;
        EnumC1198t enumC1198t18 = new EnumC1198t("GROUP", 17, 17, enumC1197s, h16);
        GROUP = enumC1198t18;
        EnumC1197s enumC1197s2 = EnumC1197s.VECTOR;
        EnumC1198t enumC1198t19 = new EnumC1198t("DOUBLE_LIST", 18, 18, enumC1197s2, h10);
        DOUBLE_LIST = enumC1198t19;
        EnumC1198t enumC1198t20 = new EnumC1198t("FLOAT_LIST", 19, 19, enumC1197s2, h11);
        FLOAT_LIST = enumC1198t20;
        EnumC1198t enumC1198t21 = new EnumC1198t("INT64_LIST", 20, 20, enumC1197s2, h12);
        INT64_LIST = enumC1198t21;
        EnumC1198t enumC1198t22 = new EnumC1198t("UINT64_LIST", 21, 21, enumC1197s2, h12);
        UINT64_LIST = enumC1198t22;
        EnumC1198t enumC1198t23 = new EnumC1198t("INT32_LIST", 22, 22, enumC1197s2, h13);
        INT32_LIST = enumC1198t23;
        EnumC1198t enumC1198t24 = new EnumC1198t("FIXED64_LIST", 23, 23, enumC1197s2, h12);
        FIXED64_LIST = enumC1198t24;
        EnumC1198t enumC1198t25 = new EnumC1198t("FIXED32_LIST", 24, 24, enumC1197s2, h13);
        FIXED32_LIST = enumC1198t25;
        EnumC1198t enumC1198t26 = new EnumC1198t("BOOL_LIST", 25, 25, enumC1197s2, h14);
        BOOL_LIST = enumC1198t26;
        EnumC1198t enumC1198t27 = new EnumC1198t("STRING_LIST", 26, 26, enumC1197s2, h15);
        STRING_LIST = enumC1198t27;
        EnumC1198t enumC1198t28 = new EnumC1198t("MESSAGE_LIST", 27, 27, enumC1197s2, h16);
        MESSAGE_LIST = enumC1198t28;
        EnumC1198t enumC1198t29 = new EnumC1198t("BYTES_LIST", 28, 28, enumC1197s2, h17);
        BYTES_LIST = enumC1198t29;
        EnumC1198t enumC1198t30 = new EnumC1198t("UINT32_LIST", 29, 29, enumC1197s2, h13);
        UINT32_LIST = enumC1198t30;
        EnumC1198t enumC1198t31 = new EnumC1198t("ENUM_LIST", 30, 30, enumC1197s2, h18);
        ENUM_LIST = enumC1198t31;
        EnumC1198t enumC1198t32 = new EnumC1198t("SFIXED32_LIST", 31, 31, enumC1197s2, h13);
        SFIXED32_LIST = enumC1198t32;
        EnumC1198t enumC1198t33 = new EnumC1198t("SFIXED64_LIST", 32, 32, enumC1197s2, h12);
        SFIXED64_LIST = enumC1198t33;
        EnumC1198t enumC1198t34 = new EnumC1198t("SINT32_LIST", 33, 33, enumC1197s2, h13);
        SINT32_LIST = enumC1198t34;
        EnumC1198t enumC1198t35 = new EnumC1198t("SINT64_LIST", 34, 34, enumC1197s2, h12);
        SINT64_LIST = enumC1198t35;
        EnumC1197s enumC1197s3 = EnumC1197s.PACKED_VECTOR;
        EnumC1198t enumC1198t36 = new EnumC1198t("DOUBLE_LIST_PACKED", 35, 35, enumC1197s3, h10);
        DOUBLE_LIST_PACKED = enumC1198t36;
        EnumC1198t enumC1198t37 = new EnumC1198t("FLOAT_LIST_PACKED", 36, 36, enumC1197s3, h11);
        FLOAT_LIST_PACKED = enumC1198t37;
        EnumC1198t enumC1198t38 = new EnumC1198t("INT64_LIST_PACKED", 37, 37, enumC1197s3, h12);
        INT64_LIST_PACKED = enumC1198t38;
        EnumC1198t enumC1198t39 = new EnumC1198t("UINT64_LIST_PACKED", 38, 38, enumC1197s3, h12);
        UINT64_LIST_PACKED = enumC1198t39;
        EnumC1198t enumC1198t40 = new EnumC1198t("INT32_LIST_PACKED", 39, 39, enumC1197s3, h13);
        INT32_LIST_PACKED = enumC1198t40;
        EnumC1198t enumC1198t41 = new EnumC1198t("FIXED64_LIST_PACKED", 40, 40, enumC1197s3, h12);
        FIXED64_LIST_PACKED = enumC1198t41;
        EnumC1198t enumC1198t42 = new EnumC1198t("FIXED32_LIST_PACKED", 41, 41, enumC1197s3, h13);
        FIXED32_LIST_PACKED = enumC1198t42;
        EnumC1198t enumC1198t43 = new EnumC1198t("BOOL_LIST_PACKED", 42, 42, enumC1197s3, h14);
        BOOL_LIST_PACKED = enumC1198t43;
        EnumC1198t enumC1198t44 = new EnumC1198t("UINT32_LIST_PACKED", 43, 43, enumC1197s3, h13);
        UINT32_LIST_PACKED = enumC1198t44;
        EnumC1198t enumC1198t45 = new EnumC1198t("ENUM_LIST_PACKED", 44, 44, enumC1197s3, h18);
        ENUM_LIST_PACKED = enumC1198t45;
        EnumC1198t enumC1198t46 = new EnumC1198t("SFIXED32_LIST_PACKED", 45, 45, enumC1197s3, h13);
        SFIXED32_LIST_PACKED = enumC1198t46;
        EnumC1198t enumC1198t47 = new EnumC1198t("SFIXED64_LIST_PACKED", 46, 46, enumC1197s3, h12);
        SFIXED64_LIST_PACKED = enumC1198t47;
        EnumC1198t enumC1198t48 = new EnumC1198t("SINT32_LIST_PACKED", 47, 47, enumC1197s3, h13);
        SINT32_LIST_PACKED = enumC1198t48;
        EnumC1198t enumC1198t49 = new EnumC1198t("SINT64_LIST_PACKED", 48, 48, enumC1197s3, h12);
        SINT64_LIST_PACKED = enumC1198t49;
        EnumC1198t enumC1198t50 = new EnumC1198t("GROUP_LIST", 49, 49, enumC1197s2, h16);
        GROUP_LIST = enumC1198t50;
        EnumC1198t enumC1198t51 = new EnumC1198t("MAP", 50, 50, EnumC1197s.MAP, H.VOID);
        MAP = enumC1198t51;
        $VALUES = new EnumC1198t[]{enumC1198t, enumC1198t2, enumC1198t3, enumC1198t4, enumC1198t5, enumC1198t6, enumC1198t7, enumC1198t8, enumC1198t9, enumC1198t10, enumC1198t11, enumC1198t12, enumC1198t13, enumC1198t14, enumC1198t15, enumC1198t16, enumC1198t17, enumC1198t18, enumC1198t19, enumC1198t20, enumC1198t21, enumC1198t22, enumC1198t23, enumC1198t24, enumC1198t25, enumC1198t26, enumC1198t27, enumC1198t28, enumC1198t29, enumC1198t30, enumC1198t31, enumC1198t32, enumC1198t33, enumC1198t34, enumC1198t35, enumC1198t36, enumC1198t37, enumC1198t38, enumC1198t39, enumC1198t40, enumC1198t41, enumC1198t42, enumC1198t43, enumC1198t44, enumC1198t45, enumC1198t46, enumC1198t47, enumC1198t48, enumC1198t49, enumC1198t50, enumC1198t51};
        EMPTY_TYPES = new Type[0];
        EnumC1198t[] enumC1198tArrValues = values();
        VALUES = new EnumC1198t[enumC1198tArrValues.length];
        for (EnumC1198t enumC1198t52 : enumC1198tArrValues) {
            VALUES[enumC1198t52.id] = enumC1198t52;
        }
    }

    public EnumC1198t(String str, int i10, int i11, EnumC1197s enumC1197s, H h10) {
        int i12;
        super(str, i10);
        this.id = i11;
        this.collection = enumC1197s;
        this.javaType = h10;
        int iOrdinal = enumC1197s.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.elementType = h10.f();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (enumC1197s != EnumC1197s.SCALAR || (i12 = r.f18483a[h10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC1198t valueOf(String str) {
        return (EnumC1198t) Enum.valueOf(EnumC1198t.class, str);
    }

    public static EnumC1198t[] values() {
        return (EnumC1198t[]) $VALUES.clone();
    }

    public final int f() {
        return this.id;
    }
}
