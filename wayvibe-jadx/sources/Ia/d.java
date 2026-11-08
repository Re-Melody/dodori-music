package Ia;

import D7.W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ T8.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LOW_LATENCY;
    public static final d MEDIA_PLAYER;

    static {
        d dVar = new d("MEDIA_PLAYER", 0);
        MEDIA_PLAYER = dVar;
        d dVar2 = new d("LOW_LATENCY", 1);
        LOW_LATENCY = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = W.B(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
