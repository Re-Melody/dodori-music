package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0910s0 {
    private static final /* synthetic */ EnumC0910s0[] $VALUES;
    public static final EnumC0910s0 Idle;
    public static final EnumC0910s0 Inactive;
    public static final EnumC0910s0 InactivePendingWork;
    public static final EnumC0910s0 PendingWork;
    public static final EnumC0910s0 ShutDown;
    public static final EnumC0910s0 ShuttingDown;

    static {
        EnumC0910s0 enumC0910s0 = new EnumC0910s0("ShutDown", 0);
        ShutDown = enumC0910s0;
        EnumC0910s0 enumC0910s1 = new EnumC0910s0("ShuttingDown", 1);
        ShuttingDown = enumC0910s1;
        EnumC0910s0 enumC0910s2 = new EnumC0910s0("Inactive", 2);
        Inactive = enumC0910s2;
        EnumC0910s0 enumC0910s3 = new EnumC0910s0("InactivePendingWork", 3);
        InactivePendingWork = enumC0910s3;
        EnumC0910s0 enumC0910s4 = new EnumC0910s0("Idle", 4);
        Idle = enumC0910s4;
        EnumC0910s0 enumC0910s5 = new EnumC0910s0("PendingWork", 5);
        PendingWork = enumC0910s5;
        $VALUES = new EnumC0910s0[]{enumC0910s0, enumC0910s1, enumC0910s2, enumC0910s3, enumC0910s4, enumC0910s5};
    }

    public static EnumC0910s0 valueOf(String str) {
        return (EnumC0910s0) Enum.valueOf(EnumC0910s0.class, str);
    }

    public static EnumC0910s0[] values() {
        return (EnumC0910s0[]) $VALUES.clone();
    }
}
