package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: renamed from: T6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0839i extends AbstractC1204z {
    private static final C0839i DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C0839i c0839i = new C0839i();
        DEFAULT_INSTANCE = c0839i;
        AbstractC1204z.w(C0839i.class, c0839i);
    }

    public static C0839i A() {
        return DEFAULT_INSTANCE;
    }

    public static C0837h C() {
        return (C0837h) DEFAULT_INSTANCE.i();
    }

    public static void z(C0839i c0839i, int i10) {
        c0839i.tagSize_ = i10;
    }

    public final int B() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (AbstractC0835g.f11664a[enumC1203y.ordinal()]) {
            case 1:
                return new C0839i();
            case 2:
                return new C0837h(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C0839i.class) {
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
