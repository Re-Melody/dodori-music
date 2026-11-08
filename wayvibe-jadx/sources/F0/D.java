package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    private static final /* synthetic */ D[] $VALUES;
    public static final D Idle;
    public static final D LayingOut;
    public static final D LookaheadLayingOut;
    public static final D LookaheadMeasuring;
    public static final D Measuring;

    static {
        D d10 = new D("Measuring", 0);
        Measuring = d10;
        D d11 = new D("LookaheadMeasuring", 1);
        LookaheadMeasuring = d11;
        D d12 = new D("LayingOut", 2);
        LayingOut = d12;
        D d13 = new D("LookaheadLayingOut", 3);
        LookaheadLayingOut = d13;
        D d14 = new D("Idle", 4);
        Idle = d14;
        $VALUES = new D[]{d10, d11, d12, d13, d14};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
