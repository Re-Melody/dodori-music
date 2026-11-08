package p122l0;

import B8.V;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w implements u {
    private static final /* synthetic */ w[] $VALUES;
    public static final w Active;
    public static final w ActiveParent;
    public static final w Captured;
    public static final w Inactive;

    static {
        w wVar = new w("Active", 0);
        Active = wVar;
        w wVar2 = new w("ActiveParent", 1);
        ActiveParent = wVar2;
        w wVar3 = new w("Captured", 2);
        Captured = wVar3;
        w wVar4 = new w("Inactive", 3);
        Inactive = wVar4;
        $VALUES = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final boolean f() {
        int i10 = v.f21919a[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new V();
    }

    public final boolean g() {
        int i10 = v.f21919a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new V();
    }
}
