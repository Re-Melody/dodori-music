package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1061t {
    private static final /* synthetic */ EnumC1061t[] $VALUES;
    public static final EnumC1061t BOOL;
    public static final EnumC1061t BOOL_LIST;
    public static final EnumC1061t BOOL_LIST_PACKED;
    public static final EnumC1061t BYTES;
    public static final EnumC1061t BYTES_LIST;
    public static final EnumC1061t DOUBLE;
    public static final EnumC1061t DOUBLE_LIST;
    public static final EnumC1061t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC1061t ENUM;
    public static final EnumC1061t ENUM_LIST;
    public static final EnumC1061t ENUM_LIST_PACKED;
    public static final EnumC1061t FIXED32;
    public static final EnumC1061t FIXED32_LIST;
    public static final EnumC1061t FIXED32_LIST_PACKED;
    public static final EnumC1061t FIXED64;
    public static final EnumC1061t FIXED64_LIST;
    public static final EnumC1061t FIXED64_LIST_PACKED;
    public static final EnumC1061t FLOAT;
    public static final EnumC1061t FLOAT_LIST;
    public static final EnumC1061t FLOAT_LIST_PACKED;
    public static final EnumC1061t GROUP;
    public static final EnumC1061t GROUP_LIST;
    public static final EnumC1061t INT32;
    public static final EnumC1061t INT32_LIST;
    public static final EnumC1061t INT32_LIST_PACKED;
    public static final EnumC1061t INT64;
    public static final EnumC1061t INT64_LIST;
    public static final EnumC1061t INT64_LIST_PACKED;
    public static final EnumC1061t MAP;
    public static final EnumC1061t MESSAGE;
    public static final EnumC1061t MESSAGE_LIST;
    public static final EnumC1061t SFIXED32;
    public static final EnumC1061t SFIXED32_LIST;
    public static final EnumC1061t SFIXED32_LIST_PACKED;
    public static final EnumC1061t SFIXED64;
    public static final EnumC1061t SFIXED64_LIST;
    public static final EnumC1061t SFIXED64_LIST_PACKED;
    public static final EnumC1061t SINT32;
    public static final EnumC1061t SINT32_LIST;
    public static final EnumC1061t SINT32_LIST_PACKED;
    public static final EnumC1061t SINT64;
    public static final EnumC1061t SINT64_LIST;
    public static final EnumC1061t SINT64_LIST_PACKED;
    public static final EnumC1061t STRING;
    public static final EnumC1061t STRING_LIST;
    public static final EnumC1061t UINT32;
    public static final EnumC1061t UINT32_LIST;
    public static final EnumC1061t UINT32_LIST_PACKED;
    public static final EnumC1061t UINT64;
    public static final EnumC1061t UINT64_LIST;
    public static final EnumC1061t UINT64_LIST_PACKED;
    private static final EnumC1061t[] VALUES;
    private final EnumC1060s collection;
    private final Class<?> elementType;
    private final int id;
    private final D javaType;
    private final boolean primitiveScalar;

    static {
        EnumC1060s enumC1060s = EnumC1060s.SCALAR;
        D d10 = D.DOUBLE;
        EnumC1061t enumC1061t = new EnumC1061t("DOUBLE", 0, 0, enumC1060s, d10);
        DOUBLE = enumC1061t;
        D d11 = D.FLOAT;
        EnumC1061t enumC1061t2 = new EnumC1061t("FLOAT", 1, 1, enumC1060s, d11);
        FLOAT = enumC1061t2;
        D d12 = D.LONG;
        EnumC1061t enumC1061t3 = new EnumC1061t("INT64", 2, 2, enumC1060s, d12);
        INT64 = enumC1061t3;
        EnumC1061t enumC1061t4 = new EnumC1061t("UINT64", 3, 3, enumC1060s, d12);
        UINT64 = enumC1061t4;
        D d13 = D.INT;
        EnumC1061t enumC1061t5 = new EnumC1061t("INT32", 4, 4, enumC1060s, d13);
        INT32 = enumC1061t5;
        EnumC1061t enumC1061t6 = new EnumC1061t("FIXED64", 5, 5, enumC1060s, d12);
        FIXED64 = enumC1061t6;
        EnumC1061t enumC1061t7 = new EnumC1061t("FIXED32", 6, 6, enumC1060s, d13);
        FIXED32 = enumC1061t7;
        D d14 = D.BOOLEAN;
        EnumC1061t enumC1061t8 = new EnumC1061t("BOOL", 7, 7, enumC1060s, d14);
        BOOL = enumC1061t8;
        D d15 = D.STRING;
        EnumC1061t enumC1061t9 = new EnumC1061t("STRING", 8, 8, enumC1060s, d15);
        STRING = enumC1061t9;
        D d16 = D.MESSAGE;
        EnumC1061t enumC1061t10 = new EnumC1061t("MESSAGE", 9, 9, enumC1060s, d16);
        MESSAGE = enumC1061t10;
        D d17 = D.BYTE_STRING;
        EnumC1061t enumC1061t11 = new EnumC1061t("BYTES", 10, 10, enumC1060s, d17);
        BYTES = enumC1061t11;
        EnumC1061t enumC1061t12 = new EnumC1061t("UINT32", 11, 11, enumC1060s, d13);
        UINT32 = enumC1061t12;
        D d18 = D.ENUM;
        EnumC1061t enumC1061t13 = new EnumC1061t("ENUM", 12, 12, enumC1060s, d18);
        ENUM = enumC1061t13;
        EnumC1061t enumC1061t14 = new EnumC1061t("SFIXED32", 13, 13, enumC1060s, d13);
        SFIXED32 = enumC1061t14;
        EnumC1061t enumC1061t15 = new EnumC1061t("SFIXED64", 14, 14, enumC1060s, d12);
        SFIXED64 = enumC1061t15;
        EnumC1061t enumC1061t16 = new EnumC1061t("SINT32", 15, 15, enumC1060s, d13);
        SINT32 = enumC1061t16;
        EnumC1061t enumC1061t17 = new EnumC1061t("SINT64", 16, 16, enumC1060s, d12);
        SINT64 = enumC1061t17;
        EnumC1061t enumC1061t18 = new EnumC1061t("GROUP", 17, 17, enumC1060s, d16);
        GROUP = enumC1061t18;
        EnumC1060s enumC1060s2 = EnumC1060s.VECTOR;
        EnumC1061t enumC1061t19 = new EnumC1061t("DOUBLE_LIST", 18, 18, enumC1060s2, d10);
        DOUBLE_LIST = enumC1061t19;
        EnumC1061t enumC1061t20 = new EnumC1061t("FLOAT_LIST", 19, 19, enumC1060s2, d11);
        FLOAT_LIST = enumC1061t20;
        EnumC1061t enumC1061t21 = new EnumC1061t("INT64_LIST", 20, 20, enumC1060s2, d12);
        INT64_LIST = enumC1061t21;
        EnumC1061t enumC1061t22 = new EnumC1061t("UINT64_LIST", 21, 21, enumC1060s2, d12);
        UINT64_LIST = enumC1061t22;
        EnumC1061t enumC1061t23 = new EnumC1061t("INT32_LIST", 22, 22, enumC1060s2, d13);
        INT32_LIST = enumC1061t23;
        EnumC1061t enumC1061t24 = new EnumC1061t("FIXED64_LIST", 23, 23, enumC1060s2, d12);
        FIXED64_LIST = enumC1061t24;
        EnumC1061t enumC1061t25 = new EnumC1061t("FIXED32_LIST", 24, 24, enumC1060s2, d13);
        FIXED32_LIST = enumC1061t25;
        EnumC1061t enumC1061t26 = new EnumC1061t("BOOL_LIST", 25, 25, enumC1060s2, d14);
        BOOL_LIST = enumC1061t26;
        EnumC1061t enumC1061t27 = new EnumC1061t("STRING_LIST", 26, 26, enumC1060s2, d15);
        STRING_LIST = enumC1061t27;
        EnumC1061t enumC1061t28 = new EnumC1061t("MESSAGE_LIST", 27, 27, enumC1060s2, d16);
        MESSAGE_LIST = enumC1061t28;
        EnumC1061t enumC1061t29 = new EnumC1061t("BYTES_LIST", 28, 28, enumC1060s2, d17);
        BYTES_LIST = enumC1061t29;
        EnumC1061t enumC1061t30 = new EnumC1061t("UINT32_LIST", 29, 29, enumC1060s2, d13);
        UINT32_LIST = enumC1061t30;
        EnumC1061t enumC1061t31 = new EnumC1061t("ENUM_LIST", 30, 30, enumC1060s2, d18);
        ENUM_LIST = enumC1061t31;
        EnumC1061t enumC1061t32 = new EnumC1061t("SFIXED32_LIST", 31, 31, enumC1060s2, d13);
        SFIXED32_LIST = enumC1061t32;
        EnumC1061t enumC1061t33 = new EnumC1061t("SFIXED64_LIST", 32, 32, enumC1060s2, d12);
        SFIXED64_LIST = enumC1061t33;
        EnumC1061t enumC1061t34 = new EnumC1061t("SINT32_LIST", 33, 33, enumC1060s2, d13);
        SINT32_LIST = enumC1061t34;
        EnumC1061t enumC1061t35 = new EnumC1061t("SINT64_LIST", 34, 34, enumC1060s2, d12);
        SINT64_LIST = enumC1061t35;
        EnumC1060s enumC1060s3 = EnumC1060s.PACKED_VECTOR;
        EnumC1061t enumC1061t36 = new EnumC1061t("DOUBLE_LIST_PACKED", 35, 35, enumC1060s3, d10);
        DOUBLE_LIST_PACKED = enumC1061t36;
        EnumC1061t enumC1061t37 = new EnumC1061t("FLOAT_LIST_PACKED", 36, 36, enumC1060s3, d11);
        FLOAT_LIST_PACKED = enumC1061t37;
        EnumC1061t enumC1061t38 = new EnumC1061t("INT64_LIST_PACKED", 37, 37, enumC1060s3, d12);
        INT64_LIST_PACKED = enumC1061t38;
        EnumC1061t enumC1061t39 = new EnumC1061t("UINT64_LIST_PACKED", 38, 38, enumC1060s3, d12);
        UINT64_LIST_PACKED = enumC1061t39;
        EnumC1061t enumC1061t40 = new EnumC1061t("INT32_LIST_PACKED", 39, 39, enumC1060s3, d13);
        INT32_LIST_PACKED = enumC1061t40;
        EnumC1061t enumC1061t41 = new EnumC1061t("FIXED64_LIST_PACKED", 40, 40, enumC1060s3, d12);
        FIXED64_LIST_PACKED = enumC1061t41;
        EnumC1061t enumC1061t42 = new EnumC1061t("FIXED32_LIST_PACKED", 41, 41, enumC1060s3, d13);
        FIXED32_LIST_PACKED = enumC1061t42;
        EnumC1061t enumC1061t43 = new EnumC1061t("BOOL_LIST_PACKED", 42, 42, enumC1060s3, d14);
        BOOL_LIST_PACKED = enumC1061t43;
        EnumC1061t enumC1061t44 = new EnumC1061t("UINT32_LIST_PACKED", 43, 43, enumC1060s3, d13);
        UINT32_LIST_PACKED = enumC1061t44;
        EnumC1061t enumC1061t45 = new EnumC1061t("ENUM_LIST_PACKED", 44, 44, enumC1060s3, d18);
        ENUM_LIST_PACKED = enumC1061t45;
        EnumC1061t enumC1061t46 = new EnumC1061t("SFIXED32_LIST_PACKED", 45, 45, enumC1060s3, d13);
        SFIXED32_LIST_PACKED = enumC1061t46;
        EnumC1061t enumC1061t47 = new EnumC1061t("SFIXED64_LIST_PACKED", 46, 46, enumC1060s3, d12);
        SFIXED64_LIST_PACKED = enumC1061t47;
        EnumC1061t enumC1061t48 = new EnumC1061t("SINT32_LIST_PACKED", 47, 47, enumC1060s3, d13);
        SINT32_LIST_PACKED = enumC1061t48;
        EnumC1061t enumC1061t49 = new EnumC1061t("SINT64_LIST_PACKED", 48, 48, enumC1060s3, d12);
        SINT64_LIST_PACKED = enumC1061t49;
        EnumC1061t enumC1061t50 = new EnumC1061t("GROUP_LIST", 49, 49, enumC1060s2, d16);
        GROUP_LIST = enumC1061t50;
        EnumC1061t enumC1061t51 = new EnumC1061t("MAP", 50, 50, EnumC1060s.MAP, D.VOID);
        MAP = enumC1061t51;
        $VALUES = new EnumC1061t[]{enumC1061t, enumC1061t2, enumC1061t3, enumC1061t4, enumC1061t5, enumC1061t6, enumC1061t7, enumC1061t8, enumC1061t9, enumC1061t10, enumC1061t11, enumC1061t12, enumC1061t13, enumC1061t14, enumC1061t15, enumC1061t16, enumC1061t17, enumC1061t18, enumC1061t19, enumC1061t20, enumC1061t21, enumC1061t22, enumC1061t23, enumC1061t24, enumC1061t25, enumC1061t26, enumC1061t27, enumC1061t28, enumC1061t29, enumC1061t30, enumC1061t31, enumC1061t32, enumC1061t33, enumC1061t34, enumC1061t35, enumC1061t36, enumC1061t37, enumC1061t38, enumC1061t39, enumC1061t40, enumC1061t41, enumC1061t42, enumC1061t43, enumC1061t44, enumC1061t45, enumC1061t46, enumC1061t47, enumC1061t48, enumC1061t49, enumC1061t50, enumC1061t51};
        EMPTY_TYPES = new Type[0];
        EnumC1061t[] enumC1061tArrValues = values();
        VALUES = new EnumC1061t[enumC1061tArrValues.length];
        for (EnumC1061t enumC1061t52 : enumC1061tArrValues) {
            VALUES[enumC1061t52.id] = enumC1061t52;
        }
    }

    public EnumC1061t(String str, int i10, int i11, EnumC1060s enumC1060s, D d10) {
        int i12;
        super(str, i10);
        this.id = i11;
        this.collection = enumC1060s;
        this.javaType = d10;
        int i13 = r.f15152a[enumC1060s.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = d10.f();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (enumC1060s != EnumC1060s.SCALAR || (i12 = r.f15153b[d10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static EnumC1061t valueOf(String str) {
        return (EnumC1061t) Enum.valueOf(EnumC1061t.class, str);
    }

    public static EnumC1061t[] values() {
        return (EnumC1061t[]) $VALUES.clone();
    }

    public final int f() {
        return this.id;
    }
}
