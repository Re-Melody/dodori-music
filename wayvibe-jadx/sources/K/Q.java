package K;

import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    private static final /* synthetic */ Q[] $VALUES;
    public static final Q Cursor;
    public static final Q None;
    public static final Q Selection;

    static {
        Q q5 = new Q(OfficeOpenXMLExtended.SECURITY_NONE, 0);
        None = q5;
        Q q9 = new Q("Selection", 1);
        Selection = q9;
        Q q10 = new Q("Cursor", 2);
        Cursor = q10;
        $VALUES = new Q[]{q5, q9, q10};
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) $VALUES.clone();
    }
}
