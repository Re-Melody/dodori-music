package O7;

import com.google.protobuf.B0;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.InterfaceC1274w0;
import com.google.protobuf.J;

/* JADX INFO: loaded from: classes.dex */
public final class c extends J {
    private static final c DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1274w0 PARSER;
    private double latitude_;
    private double longitude_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        J.r(c.class, cVar);
    }

    public static void t(c cVar, double d10) {
        cVar.latitude_ = d10;
    }

    public static void u(c cVar, double d10) {
        cVar.longitude_ = d10;
    }

    public static c v() {
        return DEFAULT_INSTANCE;
    }

    public static b y() {
        return (b) DEFAULT_INSTANCE.g();
    }

    @Override // com.google.protobuf.J
    public final Object h(I i10) {
        InterfaceC1274w0 h10;
        switch (a.f9333a[i10.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new B0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (c.class) {
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

    public final double w() {
        return this.latitude_;
    }

    public final double x() {
        return this.longitude_;
    }
}
