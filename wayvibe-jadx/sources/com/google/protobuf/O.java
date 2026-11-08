package com.google.protobuf;

import D7.C0210c;

/* JADX INFO: loaded from: classes.dex */
public final class O extends J {
    private static final O DEFAULT_INSTANCE;
    private static volatile InterfaceC1274w0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        O o10 = new O();
        DEFAULT_INSTANCE = o10;
        J.r(O.class, o10);
    }

    @Override // com.google.protobuf.J
    public final Object h(I i10) {
        InterfaceC1274w0 h10;
        switch (N.f18690a[i10.ordinal()]) {
            case 1:
                return new O();
            case 2:
                return new C0210c(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (O.class) {
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
}
