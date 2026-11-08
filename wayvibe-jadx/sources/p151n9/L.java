package p151n9;

import D7.W;
import T8.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class L {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ L[] $VALUES;
    public static final L START;
    public static final L STOP;
    public static final L STOP_AND_RESET_REPLAY_CACHE;

    static {
        L l10 = new L("START", 0);
        START = l10;
        L l11 = new L("STOP", 1);
        STOP = l11;
        L l12 = new L("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = l12;
        L[] lArr = {l10, l11, l12};
        $VALUES = lArr;
        $ENTRIES = W.B(lArr);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) $VALUES.clone();
    }
}
