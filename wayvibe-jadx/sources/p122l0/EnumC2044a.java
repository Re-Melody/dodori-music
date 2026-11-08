package p122l0;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2044a {
    private static final /* synthetic */ EnumC2044a[] $VALUES;
    public static final EnumC2044a Cancelled;
    public static final EnumC2044a None;
    public static final EnumC2044a RedirectCancelled;
    public static final EnumC2044a Redirected;

    static {
        EnumC2044a enumC2044a = new EnumC2044a(OfficeOpenXMLExtended.SECURITY_NONE, 0);
        None = enumC2044a;
        EnumC2044a enumC2044a2 = new EnumC2044a("Cancelled", 1);
        Cancelled = enumC2044a2;
        EnumC2044a enumC2044a3 = new EnumC2044a("Redirected", 2);
        Redirected = enumC2044a3;
        EnumC2044a enumC2044a4 = new EnumC2044a("RedirectCancelled", 3);
        RedirectCancelled = enumC2044a4;
        $VALUES = new EnumC2044a[]{enumC2044a, enumC2044a2, enumC2044a3, enumC2044a4};
    }

    public static EnumC2044a valueOf(String str) {
        return (EnumC2044a) Enum.valueOf(EnumC2044a.class, str);
    }

    public static EnumC2044a[] values() {
        return (EnumC2044a[]) $VALUES.clone();
    }
}
