package p046da;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e MapLibre;
    public static final e MapTiler;
    public static final e Mapbox;

    static {
        e eVar = new e("Mapbox", 0);
        Mapbox = eVar;
        e eVar2 = new e("MapTiler", 1);
        MapTiler = eVar2;
        e eVar3 = new e("MapLibre", 2);
        MapLibre = eVar3;
        $VALUES = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
