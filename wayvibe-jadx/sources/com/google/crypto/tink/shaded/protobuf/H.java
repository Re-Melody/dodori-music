package com.google.crypto.tink.shaded.protobuf;

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
public final class H {
    private static final /* synthetic */ H[] $VALUES;
    public static final H BOOLEAN;
    public static final H BYTE_STRING;
    public static final H DOUBLE;
    public static final H ENUM;
    public static final H FLOAT;
    public static final H INT;
    public static final H LONG;
    public static final H MESSAGE;
    public static final H STRING;
    public static final H VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        H h10 = new H("VOID", 0, Void.class, Void.class, null);
        VOID = h10;
        Class cls = Integer.TYPE;
        H h11 = new H("INT", 1, cls, Integer.class, 0);
        INT = h11;
        H h12 = new H("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = h12;
        H h13 = new H("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = h13;
        H h14 = new H("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = h14;
        H h15 = new H("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = h15;
        H h16 = new H("STRING", 6, String.class, String.class, "");
        STRING = h16;
        H h17 = new H("BYTE_STRING", 7, AbstractC1188i.class, AbstractC1188i.class, AbstractC1188i.f18442b);
        BYTE_STRING = h17;
        H h18 = new H("ENUM", 8, cls, Integer.class, null);
        ENUM = h18;
        H h19 = new H("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = h19;
        $VALUES = new H[]{h10, h11, h12, h13, h14, h15, h16, h17, h18, h19};
    }

    public H(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        super(str, i10);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }

    public final Class f() {
        return this.boxedType;
    }
}
