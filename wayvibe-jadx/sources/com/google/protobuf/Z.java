package com.google.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class Z {
    private static final /* synthetic */ Z[] $VALUES;
    public static final Z BOOLEAN;
    public static final Z BYTE_STRING;
    public static final Z DOUBLE;
    public static final Z ENUM;
    public static final Z FLOAT;
    public static final Z INT;
    public static final Z LONG;
    public static final Z MESSAGE;
    public static final Z STRING;
    public static final Z VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Z z10 = new Z("VOID", 0, Void.class, Void.class, null);
        VOID = z10;
        Class cls = Integer.TYPE;
        Z z11 = new Z("INT", 1, cls, Integer.class, 0);
        INT = z11;
        Z z12 = new Z("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = z12;
        Z z13 = new Z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = z13;
        Z z14 = new Z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = z14;
        Z z15 = new Z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = z15;
        Z z16 = new Z("STRING", 6, String.class, String.class, "");
        STRING = z16;
        Z z17 = new Z("BYTE_STRING", 7, AbstractC1252l.class, AbstractC1252l.class, AbstractC1252l.f18752b);
        BYTE_STRING = z17;
        Z z18 = new Z("ENUM", 8, cls, Integer.class, null);
        ENUM = z18;
        Z z19 = new Z("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = z19;
        $VALUES = new Z[]{z10, z11, z12, z13, z14, z15, z16, z17, z18, z19};
    }

    public Z(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        super(str, i10);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) $VALUES.clone();
    }

    public final Class f() {
        return this.boxedType;
    }
}
