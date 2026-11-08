package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends AbstractC1204z {
    private static final k1 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER = null;
    public static final int SALT_SIZE_FIELD_NUMBER = 1;
    private int saltSize_;

    static {
        k1 k1Var = new k1();
        DEFAULT_INSTANCE = k1Var;
        AbstractC1204z.w(k1.class, k1Var);
    }

    public static k1 A() {
        return DEFAULT_INSTANCE;
    }

    public static j1 C() {
        return (j1) DEFAULT_INSTANCE.i();
    }

    public static void z(k1 k1Var, int i10) {
        k1Var.saltSize_ = i10;
    }

    public final int B() {
        return this.saltSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (i1.f11666a[enumC1203y.ordinal()]) {
            case 1:
                return new k1();
            case 2:
                return new j1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (k1.class) {
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
