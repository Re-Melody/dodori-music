package T6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1204z;
import com.google.crypto.tink.shaded.protobuf.C1202x;
import com.google.crypto.tink.shaded.protobuf.EnumC1203y;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC1204z {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final C0 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.Z PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        C0 c3 = new C0();
        DEFAULT_INSTANCE = c3;
        AbstractC1204z.w(C0.class, c3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1204z
    public final Object j(EnumC1203y enumC1203y) {
        com.google.crypto.tink.shaded.protobuf.Z c1202x;
        switch (B0.f11642a[enumC1203y.ordinal()]) {
            case 1:
                return new C0();
            case 2:
                return new C0832e0(DEFAULT_INSTANCE, 1);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.d0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Z z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C0.class) {
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
