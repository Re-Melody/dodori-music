package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class F0 {
    private static final /* synthetic */ F0[] $VALUES;
    public static final F0 BottomBar;
    public static final F0 Fab;
    public static final F0 MainContent;
    public static final F0 Snackbar;
    public static final F0 TopBar;

    static {
        F0 f10 = new F0("TopBar", 0);
        TopBar = f10;
        F0 f11 = new F0("MainContent", 1);
        MainContent = f11;
        F0 f12 = new F0("Snackbar", 2);
        Snackbar = f12;
        F0 f13 = new F0("Fab", 3);
        Fab = f13;
        F0 f14 = new F0("BottomBar", 4);
        BottomBar = f14;
        $VALUES = new F0[]{f10, f11, f12, f13, f14};
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) $VALUES.clone();
    }
}
