package p045d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BOTH;
    public static final s LEFT;
    public static final s NONE;
    public static final s RIGHT;

    static {
        s sVar = new s("NONE", 0);
        NONE = sVar;
        s sVar2 = new s("LEFT", 1);
        LEFT = sVar2;
        s sVar3 = new s("RIGHT", 2);
        RIGHT = sVar3;
        s sVar4 = new s("BOTH", 3);
        BOTH = sVar4;
        $VALUES = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
