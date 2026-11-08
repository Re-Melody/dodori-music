package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: renamed from: T6.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0868x extends AbstractC1204z {
    private static final C0868x DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER;
    private int ivSize_;

    static {
        C0868x c0868x = new C0868x();
        DEFAULT_INSTANCE = c0868x;
        AbstractC1204z.w(C0868x.class, c0868x);
    }

    public static C0868x A() {
        return DEFAULT_INSTANCE;
    }

    public static C0866w C() {
        return (C0866w) DEFAULT_INSTANCE.i();
    }

    public static void z(C0868x c0868x, int i10) {
        c0868x.ivSize_ = i10;
    }

    public final int B() {
        return this.ivSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (AbstractC0864v.f11677a[enumC1203y.ordinal()]) {
            case 1:
                return new C0868x();
            case 2:
                return new C0866w(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C0868x.class) {
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
