package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G0 {
    private static final /* synthetic */ G0[] $VALUES;
    public static final G0 ADDING;
    public static final G0 NONE;
    public static final G0 REMOVING;

    static {
        G0 g3 = new G0("NONE", 0);
        NONE = g3;
        G0 g10 = new G0("ADDING", 1);
        ADDING = g10;
        G0 g11 = new G0("REMOVING", 2);
        REMOVING = g11;
        $VALUES = new G0[]{g3, g10, g11};
    }

    public static G0 valueOf(String str) {
        return (G0) Enum.valueOf(G0.class, str);
    }

    public static G0[] values() {
        return (G0[]) $VALUES.clone();
    }
}
