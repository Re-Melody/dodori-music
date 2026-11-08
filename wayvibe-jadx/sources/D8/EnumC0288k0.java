package D8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: D8.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0288k0 {
    private static final /* synthetic */ EnumC0288k0[] $VALUES;
    public static final EnumC0288k0 CANCEL;
    public static final EnumC0288k0 COMPRESSION_ERROR;
    public static final EnumC0288k0 CONNECT_ERROR;
    public static final EnumC0288k0 ENHANCE_YOUR_CALM;
    public static final EnumC0288k0 FLOW_CONTROL_ERROR;
    public static final EnumC0288k0 FRAME_SIZE_ERROR;
    public static final EnumC0288k0 HTTP_1_1_REQUIRED;
    public static final EnumC0288k0 INADEQUATE_SECURITY;
    public static final EnumC0288k0 INTERNAL_ERROR;
    public static final EnumC0288k0 NO_ERROR;
    public static final EnumC0288k0 PROTOCOL_ERROR;
    public static final EnumC0288k0 REFUSED_STREAM;
    public static final EnumC0288k0 SETTINGS_TIMEOUT;
    public static final EnumC0288k0 STREAM_CLOSED;
    private static final EnumC0288k0[] codeMap;
    private final int code;
    private final B8.r0 status;

    static {
        B8.r0 r0Var = B8.r0.f856n;
        EnumC0288k0 enumC0288k0 = new EnumC0288k0("NO_ERROR", 0, 0, r0Var);
        NO_ERROR = enumC0288k0;
        B8.r0 r0Var2 = B8.r0.f855m;
        EnumC0288k0 enumC0288k1 = new EnumC0288k0("PROTOCOL_ERROR", 1, 1, r0Var2);
        PROTOCOL_ERROR = enumC0288k1;
        EnumC0288k0 enumC0288k2 = new EnumC0288k0("INTERNAL_ERROR", 2, 2, r0Var2);
        INTERNAL_ERROR = enumC0288k2;
        EnumC0288k0 enumC0288k3 = new EnumC0288k0("FLOW_CONTROL_ERROR", 3, 3, r0Var2);
        FLOW_CONTROL_ERROR = enumC0288k3;
        EnumC0288k0 enumC0288k4 = new EnumC0288k0("SETTINGS_TIMEOUT", 4, 4, r0Var2);
        SETTINGS_TIMEOUT = enumC0288k4;
        EnumC0288k0 enumC0288k5 = new EnumC0288k0("STREAM_CLOSED", 5, 5, r0Var2);
        STREAM_CLOSED = enumC0288k5;
        EnumC0288k0 enumC0288k6 = new EnumC0288k0("FRAME_SIZE_ERROR", 6, 6, r0Var2);
        FRAME_SIZE_ERROR = enumC0288k6;
        EnumC0288k0 enumC0288k7 = new EnumC0288k0("REFUSED_STREAM", 7, 7, r0Var);
        REFUSED_STREAM = enumC0288k7;
        EnumC0288k0 enumC0288k8 = new EnumC0288k0("CANCEL", 8, 8, B8.r0.f849f);
        CANCEL = enumC0288k8;
        EnumC0288k0 enumC0288k9 = new EnumC0288k0("COMPRESSION_ERROR", 9, 9, r0Var2);
        COMPRESSION_ERROR = enumC0288k9;
        EnumC0288k0 enumC0288k10 = new EnumC0288k0("CONNECT_ERROR", 10, 10, r0Var2);
        CONNECT_ERROR = enumC0288k10;
        EnumC0288k0 enumC0288k11 = new EnumC0288k0("ENHANCE_YOUR_CALM", 11, 11, B8.r0.k.g("Bandwidth exhausted"));
        ENHANCE_YOUR_CALM = enumC0288k11;
        EnumC0288k0 enumC0288k12 = new EnumC0288k0("INADEQUATE_SECURITY", 12, 12, B8.r0.f852i.g("Permission denied as protocol is not secure enough to call"));
        INADEQUATE_SECURITY = enumC0288k12;
        EnumC0288k0 enumC0288k13 = new EnumC0288k0("HTTP_1_1_REQUIRED", 13, 13, B8.r0.f850g);
        HTTP_1_1_REQUIRED = enumC0288k13;
        $VALUES = new EnumC0288k0[]{enumC0288k0, enumC0288k1, enumC0288k2, enumC0288k3, enumC0288k4, enumC0288k5, enumC0288k6, enumC0288k7, enumC0288k8, enumC0288k9, enumC0288k10, enumC0288k11, enumC0288k12, enumC0288k13};
        EnumC0288k0[] enumC0288k0ArrValues = values();
        EnumC0288k0[] enumC0288k0Arr = new EnumC0288k0[enumC0288k0ArrValues[enumC0288k0ArrValues.length - 1].code + 1];
        for (EnumC0288k0 enumC0288k14 : enumC0288k0ArrValues) {
            enumC0288k0Arr[enumC0288k14.code] = enumC0288k14;
        }
        codeMap = enumC0288k0Arr;
    }

    public EnumC0288k0(String str, int i10, int i11, B8.r0 r0Var) {
        super(str, i10);
        this.code = i11;
        String str2 = "HTTP/2 error code: " + name();
        this.status = r0Var.g(r0Var.f860b != null ? p134m1.b.m(V0.p.t(str2, " ("), r0Var.f860b, ")") : str2);
    }

    public static B8.r0 a(long j10) {
        EnumC0288k0[] enumC0288k0Arr = codeMap;
        EnumC0288k0 enumC0288k0 = (j10 >= ((long) enumC0288k0Arr.length) || j10 < 0) ? null : enumC0288k0Arr[(int) j10];
        if (enumC0288k0 != null) {
            return enumC0288k0.status;
        }
        return B8.r0.c(INTERNAL_ERROR.status.f859a.g()).g("Unrecognized HTTP/2 error code: " + j10);
    }

    public static EnumC0288k0 valueOf(String str) {
        return (EnumC0288k0) Enum.valueOf(EnumC0288k0.class, str);
    }

    public static EnumC0288k0[] values() {
        return (EnumC0288k0[]) $VALUES.clone();
    }
}
