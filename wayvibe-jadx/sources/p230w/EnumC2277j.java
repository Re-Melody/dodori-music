package p230w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2277j {
    private static final /* synthetic */ EnumC2277j[] $VALUES;
    public static final EnumC2277j BoundReached;
    public static final EnumC2277j Finished;

    static {
        EnumC2277j enumC2277j = new EnumC2277j("BoundReached", 0);
        BoundReached = enumC2277j;
        EnumC2277j enumC2277j2 = new EnumC2277j("Finished", 1);
        Finished = enumC2277j2;
        $VALUES = new EnumC2277j[]{enumC2277j, enumC2277j2};
    }

    public static EnumC2277j valueOf(String str) {
        return (EnumC2277j) Enum.valueOf(EnumC2277j.class, str);
    }

    public static EnumC2277j[] values() {
        return (EnumC2277j[]) $VALUES.clone();
    }
}
