package D7;

import com.google.protobuf.InterfaceC1274w0;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends com.google.protobuf.J {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final E0 DEFAULT_INSTANCE;
    private static volatile InterfaceC1274w0 PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";

    static {
        E0 e1 = new E0();
        DEFAULT_INSTANCE = e1;
        com.google.protobuf.J.r(E0.class, e1);
    }

    public static void t(E0 e1, String str) {
        e1.getClass();
        str.getClass();
        e1.collectionId_ = str;
    }

    public static void u(E0 e1) {
        e1.allDescendants_ = true;
    }

    public static D0 x() {
        return (D0) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.J
    public final Object h(com.google.protobuf.I i10) {
        InterfaceC1274w0 h10;
        switch (B0.f2146a[i10.ordinal()]) {
            case 1:
                return new E0();
            case 2:
                return new D0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (E0.class) {
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

    public final boolean v() {
        return this.allDescendants_;
    }

    public final String w() {
        return this.collectionId_;
    }
}
