package p107j8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b CLIP_PATH;
    public static final b CLIP_RECT;
    public static final b CLIP_RRECT;
    public static final b OPACITY;
    public static final b TRANSFORM;

    static {
        b bVar = new b("CLIP_RECT", 0);
        CLIP_RECT = bVar;
        b bVar2 = new b("CLIP_RRECT", 1);
        CLIP_RRECT = bVar2;
        b bVar3 = new b("CLIP_PATH", 2);
        CLIP_PATH = bVar3;
        b bVar4 = new b("TRANSFORM", 3);
        TRANSFORM = bVar4;
        b bVar5 = new b("OPACITY", 4);
        OPACITY = bVar5;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
