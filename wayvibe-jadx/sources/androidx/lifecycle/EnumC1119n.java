package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1119n {
    private static final /* synthetic */ EnumC1119n[] $VALUES;
    public static final C1117l Companion;
    public static final EnumC1119n ON_ANY;
    public static final EnumC1119n ON_CREATE;
    public static final EnumC1119n ON_DESTROY;
    public static final EnumC1119n ON_PAUSE;
    public static final EnumC1119n ON_RESUME;
    public static final EnumC1119n ON_START;
    public static final EnumC1119n ON_STOP;

    static {
        EnumC1119n enumC1119n = new EnumC1119n("ON_CREATE", 0);
        ON_CREATE = enumC1119n;
        EnumC1119n enumC1119n2 = new EnumC1119n("ON_START", 1);
        ON_START = enumC1119n2;
        EnumC1119n enumC1119n3 = new EnumC1119n("ON_RESUME", 2);
        ON_RESUME = enumC1119n3;
        EnumC1119n enumC1119n4 = new EnumC1119n("ON_PAUSE", 3);
        ON_PAUSE = enumC1119n4;
        EnumC1119n enumC1119n5 = new EnumC1119n("ON_STOP", 4);
        ON_STOP = enumC1119n5;
        EnumC1119n enumC1119n6 = new EnumC1119n("ON_DESTROY", 5);
        ON_DESTROY = enumC1119n6;
        EnumC1119n enumC1119n7 = new EnumC1119n("ON_ANY", 6);
        ON_ANY = enumC1119n7;
        $VALUES = new EnumC1119n[]{enumC1119n, enumC1119n2, enumC1119n3, enumC1119n4, enumC1119n5, enumC1119n6, enumC1119n7};
        Companion = new C1117l();
    }

    public static EnumC1119n valueOf(String str) {
        return (EnumC1119n) Enum.valueOf(EnumC1119n.class, str);
    }

    public static EnumC1119n[] values() {
        return (EnumC1119n[]) $VALUES.clone();
    }

    public final EnumC1120o f() {
        switch (AbstractC1118m.f15563a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1120o.CREATED;
            case 3:
            case 4:
                return EnumC1120o.STARTED;
            case 5:
                return EnumC1120o.RESUMED;
            case 6:
                return EnumC1120o.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
