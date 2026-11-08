package org.maplibre.android.maps.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONTINUOUS;
    public static final a WHEN_DIRTY;

    static {
        a aVar = new a("WHEN_DIRTY", 0);
        WHEN_DIRTY = aVar;
        a aVar2 = new a("CONTINUOUS", 1);
        CONTINUOUS = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
