package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class x0 {
    private static final /* synthetic */ x0[] $VALUES;
    public static final x0 BOOL;
    public static final x0 BYTES;
    public static final x0 DOUBLE;
    public static final x0 ENUM;
    public static final x0 FIXED32;
    public static final x0 FIXED64;
    public static final x0 FLOAT;
    public static final x0 GROUP;
    public static final x0 INT32;
    public static final x0 INT64;
    public static final x0 MESSAGE;
    public static final x0 SFIXED32;
    public static final x0 SFIXED64;
    public static final x0 SINT32;
    public static final x0 SINT64;
    public static final x0 STRING;
    public static final x0 UINT32;
    public static final x0 UINT64;
    private final y0 javaType;
    private final int wireType;

    static {
        x0 x0Var = new x0("DOUBLE", 0, y0.DOUBLE, 1);
        DOUBLE = x0Var;
        x0 x0Var2 = new x0("FLOAT", 1, y0.FLOAT, 5);
        FLOAT = x0Var2;
        y0 y0Var = y0.LONG;
        x0 x0Var3 = new x0("INT64", 2, y0Var, 0);
        INT64 = x0Var3;
        x0 x0Var4 = new x0("UINT64", 3, y0Var, 0);
        UINT64 = x0Var4;
        y0 y0Var2 = y0.INT;
        x0 x0Var5 = new x0("INT32", 4, y0Var2, 0);
        INT32 = x0Var5;
        x0 x0Var6 = new x0("FIXED64", 5, y0Var, 1);
        FIXED64 = x0Var6;
        x0 x0Var7 = new x0("FIXED32", 6, y0Var2, 5);
        FIXED32 = x0Var7;
        x0 x0Var8 = new x0("BOOL", 7, y0.BOOLEAN, 0);
        BOOL = x0Var8;
        t0 t0Var = new t0("STRING", 8, y0.STRING, 2);
        STRING = t0Var;
        y0 y0Var3 = y0.MESSAGE;
        u0 u0Var = new u0("GROUP", 9, y0Var3, 3);
        GROUP = u0Var;
        v0 v0Var = new v0("MESSAGE", 10, y0Var3, 2);
        MESSAGE = v0Var;
        w0 w0Var = new w0("BYTES", 11, y0.BYTE_STRING, 2);
        BYTES = w0Var;
        x0 x0Var9 = new x0("UINT32", 12, y0Var2, 0);
        UINT32 = x0Var9;
        x0 x0Var10 = new x0("ENUM", 13, y0.ENUM, 0);
        ENUM = x0Var10;
        x0 x0Var11 = new x0("SFIXED32", 14, y0Var2, 5);
        SFIXED32 = x0Var11;
        x0 x0Var12 = new x0("SFIXED64", 15, y0Var, 1);
        SFIXED64 = x0Var12;
        x0 x0Var13 = new x0("SINT32", 16, y0Var2, 0);
        SINT32 = x0Var13;
        x0 x0Var14 = new x0("SINT64", 17, y0Var, 0);
        SINT64 = x0Var14;
        $VALUES = new x0[]{x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8, t0Var, u0Var, v0Var, w0Var, x0Var9, x0Var10, x0Var11, x0Var12, x0Var13, x0Var14};
    }

    public x0(String str, int i10, y0 y0Var, int i11) {
        super(str, i10);
        this.javaType = y0Var;
        this.wireType = i11;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) $VALUES.clone();
    }

    public final y0 f() {
        return this.javaType;
    }

    public final int g() {
        return this.wireType;
    }
}
