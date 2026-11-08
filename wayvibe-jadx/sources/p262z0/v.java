package p262z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    private static final /* synthetic */ v[] $VALUES;
    public static final v Dispatching;
    public static final v NotDispatching;
    public static final v Unknown;

    static {
        v vVar = new v("Unknown", 0);
        Unknown = vVar;
        v vVar2 = new v("Dispatching", 1);
        Dispatching = vVar2;
        v vVar3 = new v("NotDispatching", 2);
        NotDispatching = vVar3;
        $VALUES = new v[]{vVar, vVar2, vVar3};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
