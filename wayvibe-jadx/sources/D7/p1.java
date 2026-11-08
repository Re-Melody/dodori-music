package D7;

import com.google.protobuf.AbstractC1252l;
import com.google.protobuf.EnumC1272v0;
import com.google.protobuf.InterfaceC1274w0;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends com.google.protobuf.J {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final p1 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile InterfaceC1274w0 PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.protobuf.J.r(p1.class, p1Var);
    }

    public static void A(p1 p1Var, EnumC1272v0 enumC1272v0) {
        p1Var.getClass();
        p1Var.valueType_ = Integer.valueOf(enumC1272v0.f());
        p1Var.valueTypeCase_ = 11;
    }

    public static void B(p1 p1Var, boolean z10) {
        p1Var.valueTypeCase_ = 1;
        p1Var.valueType_ = Boolean.valueOf(z10);
    }

    public static void C(p1 p1Var, long j10) {
        p1Var.valueTypeCase_ = 2;
        p1Var.valueType_ = Long.valueOf(j10);
    }

    public static void D(p1 p1Var, double d10) {
        p1Var.valueTypeCase_ = 3;
        p1Var.valueType_ = Double.valueOf(d10);
    }

    public static p1 H() {
        return DEFAULT_INSTANCE;
    }

    public static n1 R() {
        return (n1) DEFAULT_INSTANCE.g();
    }

    public static void t(p1 p1Var, com.google.protobuf.N0 n6) {
        p1Var.getClass();
        p1Var.valueType_ = n6;
        p1Var.valueTypeCase_ = 10;
    }

    public static void u(p1 p1Var, String str) {
        p1Var.getClass();
        str.getClass();
        p1Var.valueTypeCase_ = 17;
        p1Var.valueType_ = str;
    }

    public static void v(p1 p1Var, AbstractC1252l abstractC1252l) {
        p1Var.getClass();
        abstractC1252l.getClass();
        p1Var.valueTypeCase_ = 18;
        p1Var.valueType_ = abstractC1252l;
    }

    public static void w(p1 p1Var, String str) {
        p1Var.getClass();
        str.getClass();
        p1Var.valueTypeCase_ = 5;
        p1Var.valueType_ = str;
    }

    public static void x(p1 p1Var, O7.c cVar) {
        p1Var.getClass();
        p1Var.valueType_ = cVar;
        p1Var.valueTypeCase_ = 8;
    }

    public static void y(C0218g c0218g, p1 p1Var) {
        p1Var.getClass();
        c0218g.getClass();
        p1Var.valueType_ = c0218g;
        p1Var.valueTypeCase_ = 9;
    }

    public static void z(p1 p1Var, C0221h0 c0221h0) {
        p1Var.getClass();
        c0221h0.getClass();
        p1Var.valueType_ = c0221h0;
        p1Var.valueTypeCase_ = 6;
    }

    public final C0218g E() {
        return this.valueTypeCase_ == 9 ? (C0218g) this.valueType_ : C0218g.w();
    }

    public final boolean F() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public final AbstractC1252l G() {
        return this.valueTypeCase_ == 18 ? (AbstractC1252l) this.valueType_ : AbstractC1252l.f18752b;
    }

    public final double I() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public final O7.c J() {
        return this.valueTypeCase_ == 8 ? (O7.c) this.valueType_ : O7.c.v();
    }

    public final long K() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public final C0221h0 L() {
        return this.valueTypeCase_ == 6 ? (C0221h0) this.valueType_ : C0221h0.u();
    }

    public final String M() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public final String N() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public final com.google.protobuf.N0 O() {
        return this.valueTypeCase_ == 10 ? (com.google.protobuf.N0) this.valueType_ : com.google.protobuf.N0.v();
    }

    public final o1 P() {
        int i10 = this.valueTypeCase_;
        if (i10 == 0) {
            return o1.VALUETYPE_NOT_SET;
        }
        if (i10 == 1) {
            return o1.BOOLEAN_VALUE;
        }
        if (i10 == 2) {
            return o1.INTEGER_VALUE;
        }
        if (i10 == 3) {
            return o1.DOUBLE_VALUE;
        }
        if (i10 == 5) {
            return o1.REFERENCE_VALUE;
        }
        if (i10 == 6) {
            return o1.MAP_VALUE;
        }
        if (i10 == 17) {
            return o1.STRING_VALUE;
        }
        if (i10 == 18) {
            return o1.BYTES_VALUE;
        }
        switch (i10) {
            case 8:
                return o1.GEO_POINT_VALUE;
            case 9:
                return o1.ARRAY_VALUE;
            case 10:
                return o1.TIMESTAMP_VALUE;
            case 11:
                return o1.NULL_VALUE;
            default:
                return null;
        }
    }

    public final boolean Q() {
        return this.valueTypeCase_ == 11;
    }

    @Override // com.google.protobuf.J
    public final Object h(com.google.protobuf.I i10) {
        InterfaceC1274w0 h10;
        switch (m1.f2175a[i10.ordinal()]) {
            case 1:
                return new p1();
            case 2:
                return new n1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.protobuf.B0(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C0221h0.class, O7.c.class, C0218g.class, com.google.protobuf.N0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1274w0 interfaceC1274w0 = PARSER;
                if (interfaceC1274w0 != null) {
                    return interfaceC1274w0;
                }
                synchronized (p1.class) {
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
}
