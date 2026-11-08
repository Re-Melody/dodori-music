package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC1204z {
    private static final G DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER;
    private int ivSize_;

    static {
        G g3 = new G();
        DEFAULT_INSTANCE = g3;
        AbstractC1204z.w(G.class, g3);
    }

    public static G A() {
        return DEFAULT_INSTANCE;
    }

    public static F C() {
        return (F) DEFAULT_INSTANCE.i();
    }

    public static void z(G g3, int i10) {
        g3.ivSize_ = i10;
    }

    public final int B() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (E.f11644a[enumC1203y.ordinal()]) {
            case 1:
                return new G();
            case 2:
                return new F(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (G.class) {
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
