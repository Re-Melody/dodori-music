package p045d8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class J {
    private static final /* synthetic */ J[] $VALUES;
    public static final J image;
    public static final J surface;
    public static final J texture;

    static {
        J j10 = new J("surface", 0);
        surface = j10;
        J j11 = new J("texture", 1);
        texture = j11;
        J j12 = new J("image", 2);
        image = j12;
        $VALUES = new J[]{j10, j11, j12};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }
}
