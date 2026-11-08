package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1188i;
import com.google.crypto.tink.shaded.protobuf.AbstractC1201w;
import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1194o;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC1204z {
    private static final A0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC1188i value_ = AbstractC1188i.f18442b;

    static {
        A0 a10 = new A0();
        DEFAULT_INSTANCE = a10;
        AbstractC1204z.w(A0.class, a10);
    }

    public static void A(A0 a10, AbstractC1188i abstractC1188i) {
        a10.getClass();
        abstractC1188i.getClass();
        a10.value_ = abstractC1188i;
    }

    public static void B(A0 a10, Z0 z1) {
        a10.getClass();
        a10.outputPrefixType_ = z1.f();
    }

    public static A0 C() {
        return DEFAULT_INSTANCE;
    }

    public static C0873z0 G() {
        return (C0873z0) DEFAULT_INSTANCE.i();
    }

    public static C0873z0 H(A0 a10) {
        AbstractC1201w abstractC1201wI = DEFAULT_INSTANCE.i();
        abstractC1201wI.f(a10);
        return (C0873z0) abstractC1201wI;
    }

    public static A0 I(byte[] bArr, C1194o c1194o) {
        return (A0) AbstractC1204z.u(DEFAULT_INSTANCE, bArr, c1194o);
    }

    public static void z(A0 a10, String str) {
        a10.getClass();
        str.getClass();
        a10.typeUrl_ = str;
    }

    public final Z0 D() {
        Z0 z0E = Z0.e(this.outputPrefixType_);
        return z0E == null ? Z0.UNRECOGNIZED : z0E;
    }

    public final String E() {
        return this.typeUrl_;
    }

    public final AbstractC1188i F() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (AbstractC0871y0.f11679a[enumC1203y.ordinal()]) {
            case 1:
                return new A0();
            case 2:
                return new C0873z0(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (A0.class) {
                    try {
                        c1202x = PARSER;
                        if (c1202x == null) {
                            c1202x = new C1202x();
                            PARSER = c1202x;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1202x;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
