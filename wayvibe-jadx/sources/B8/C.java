package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class C {
    private static final /* synthetic */ C[] $VALUES;
    public static final C CT_ERROR;
    public static final C CT_INFO;
    public static final C CT_UNKNOWN;
    public static final C CT_WARNING;

    static {
        C c3 = new C("CT_UNKNOWN", 0);
        CT_UNKNOWN = c3;
        C c9 = new C("CT_INFO", 1);
        CT_INFO = c9;
        C c10 = new C("CT_WARNING", 2);
        CT_WARNING = c10;
        C c11 = new C("CT_ERROR", 3);
        CT_ERROR = c11;
        $VALUES = new C[]{c3, c9, c10, c11};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
