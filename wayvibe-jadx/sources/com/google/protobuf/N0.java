package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends J {
    private static final N0 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile InterfaceC1274w0 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        N0 n6 = new N0();
        DEFAULT_INSTANCE = n6;
        J.r(N0.class, n6);
    }

    public static void t(N0 n6, long j10) {
        n6.seconds_ = j10;
    }

    public static void u(N0 n6, int i10) {
        n6.nanos_ = i10;
    }

    public static N0 v() {
        return DEFAULT_INSTANCE;
    }

    public static M0 y() {
        return (M0) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.J
    public final Object h(I i10) {
        InterfaceC1274w0 h10;
        switch (L0.f18689a[i10.ordinal()]) {
            case 1:
                return new N0();
            case 2:
                return new M0(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
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
                            h10 = new H(DEFAULT_INSTANCE);
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

    public final int w() {
        return this.nanos_;
    }

    public final long x() {
        return this.seconds_;
    }
}
