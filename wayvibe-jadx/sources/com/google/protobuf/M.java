package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class M extends J {
    private static final M DEFAULT_INSTANCE;
    private static volatile InterfaceC1274w0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        M m8 = new M();
        DEFAULT_INSTANCE = m8;
        J.r(M.class, m8);
    }

    public static void t(M m8, int i10) {
        m8.value_ = i10;
    }

    public static M u() {
        return DEFAULT_INSTANCE;
    }

    public static L w() {
        return (L) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.J
    public final Object h(I i10) {
        InterfaceC1274w0 h10;
        switch (K.f18685a[i10.ordinal()]) {
            case 1:
                return new M();
            case 2:
                return new L(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (M.class) {
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

    public final int v() {
        return this.value_;
    }
}
