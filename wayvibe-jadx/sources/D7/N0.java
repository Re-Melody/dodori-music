package D7;

import com.google.protobuf.InterfaceC1274w0;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends com.google.protobuf.J {
    private static final N0 DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile InterfaceC1274w0 PARSER;
    private String fieldPath_ = "";

    static {
        N0 n6 = new N0();
        DEFAULT_INSTANCE = n6;
        com.google.protobuf.J.r(N0.class, n6);
    }

    public static void t(N0 n6, String str) {
        n6.getClass();
        str.getClass();
        n6.fieldPath_ = str;
    }

    public static N0 u() {
        return DEFAULT_INSTANCE;
    }

    public static M0 w() {
        return (M0) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.J
    public final Object h(com.google.protobuf.I i10) {
        InterfaceC1274w0 h10;
        switch (B0.f2146a[i10.ordinal()]) {
            case 1:
                return new N0();
            case 2:
                return new M0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (N0.class) {
                    try {
                        h10 = PARSER;
                        if (h10 == null) {
                            h10 = new com.google.protobuf.H(DEFAULT_INSTANCE);
                            PARSER = h10;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return h10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String v() {
        return this.fieldPath_;
    }
}
