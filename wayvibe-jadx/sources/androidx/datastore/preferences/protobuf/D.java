package androidx.datastore.preferences.protobuf;

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
public final class D {
    private static final /* synthetic */ D[] $VALUES;
    public static final D BOOLEAN;
    public static final D BYTE_STRING;
    public static final D DOUBLE;
    public static final D ENUM;
    public static final D FLOAT;
    public static final D INT;
    public static final D LONG;
    public static final D MESSAGE;
    public static final D STRING;
    public static final D VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        D d10 = new D("VOID", 0, Void.class, Void.class, null);
        VOID = d10;
        Class cls = Integer.TYPE;
        D d11 = new D("INT", 1, cls, Integer.class, 0);
        INT = d11;
        D d12 = new D("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = d12;
        D d13 = new D("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = d13;
        D d14 = new D("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = d14;
        D d15 = new D("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = d15;
        D d16 = new D("STRING", 6, String.class, String.class, "");
        STRING = d16;
        D d17 = new D("BYTE_STRING", 7, C1049g.class, C1049g.class, C1049g.f15092c);
        BYTE_STRING = d17;
        D d18 = new D("ENUM", 8, cls, Integer.class, null);
        ENUM = d18;
        D d19 = new D("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = d19;
        $VALUES = new D[]{d10, d11, d12, d13, d14, d15, d16, d17, d18, d19};
    }

    public D(String str, int i10, Class cls, Class cls2, Serializable serializable) {
        super(str, i10);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }

    public final Class f() {
        return this.boxedType;
    }
}
