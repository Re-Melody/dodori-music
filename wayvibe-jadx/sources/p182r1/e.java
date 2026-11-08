package p182r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e BASELINE;
    public static final e BOTTOM;
    public static final e HORIZONTAL_DIMENSION;
    public static final e LEFT;
    public static final e RIGHT;
    public static final e TOP;
    public static final e UNKNOWN;
    public static final e VERTICAL_DIMENSION;

    static {
        e eVar = new e("UNKNOWN", 0);
        UNKNOWN = eVar;
        e eVar2 = new e("HORIZONTAL_DIMENSION", 1);
        HORIZONTAL_DIMENSION = eVar2;
        e eVar3 = new e("VERTICAL_DIMENSION", 2);
        VERTICAL_DIMENSION = eVar3;
        e eVar4 = new e("LEFT", 3);
        LEFT = eVar4;
        e eVar5 = new e("RIGHT", 4);
        RIGHT = eVar5;
        e eVar6 = new e("TOP", 5);
        TOP = eVar6;
        e eVar7 = new e("BOTTOM", 6);
        BOTTOM = eVar7;
        e eVar8 = new e("BASELINE", 7);
        BASELINE = eVar8;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
