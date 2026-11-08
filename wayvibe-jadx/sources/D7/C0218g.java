package D7;

import com.google.protobuf.AbstractC1230a;
import com.google.protobuf.AbstractC1232b;
import com.google.protobuf.InterfaceC1274w0;
import java.util.List;

/* JADX INFO: renamed from: D7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218g extends com.google.protobuf.J implements InterfaceC0220h {
    private static final C0218g DEFAULT_INSTANCE;
    private static volatile InterfaceC1274w0 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private com.google.protobuf.U values_ = com.google.protobuf.A0.f18651d;

    static {
        C0218g c0218g = new C0218g();
        DEFAULT_INSTANCE = c0218g;
        com.google.protobuf.J.r(C0218g.class, c0218g);
    }

    public static void t(C0218g c0218g, p1 p1Var) {
        c0218g.getClass();
        p1Var.getClass();
        com.google.protobuf.U u10 = c0218g.values_;
        if (!((AbstractC1232b) u10).f18728a) {
            c0218g.values_ = com.google.protobuf.J.n(u10);
        }
        c0218g.values_.add(p1Var);
    }

    public static void u(C0218g c0218g, List list) {
        com.google.protobuf.U u10 = c0218g.values_;
        if (!((AbstractC1232b) u10).f18728a) {
            c0218g.values_ = com.google.protobuf.J.n(u10);
        }
        AbstractC1230a.b(list, c0218g.values_);
    }

    public static void v(C0218g c0218g, int i10) {
        com.google.protobuf.U u10 = c0218g.values_;
        if (!((AbstractC1232b) u10).f18728a) {
            c0218g.values_ = com.google.protobuf.J.n(u10);
        }
        c0218g.values_.remove(i10);
    }

    public static C0218g w() {
        return DEFAULT_INSTANCE;
    }

    public static C0216f z() {
        return (C0216f) DEFAULT_INSTANCE.g();
    }

    @Override // D7.InterfaceC0220h
    public final List a() {
        return this.values_;
    }

    @Override // com.google.protobuf.J
    public final Object h(com.google.protobuf.I i10) {
        InterfaceC1274w0 h10;
        switch (AbstractC0214e.f2166a[i10.ordinal()]) {
            case 1:
                return new C0218g();
            case 2:
                return new C0216f(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", p1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (C0218g.class) {
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

    public final p1 x(int i10) {
        return (p1) this.values_.get(i10);
    }

    public final int y() {
        return this.values_.size();
    }
}
