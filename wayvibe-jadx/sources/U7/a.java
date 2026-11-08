package U7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a buffering;
    public static final a completed;
    public static final a error;
    public static final a idle;
    public static final a loading;
    public static final a ready;

    static {
        a aVar = new a("idle", 0);
        idle = aVar;
        a aVar2 = new a("loading", 1);
        loading = aVar2;
        a aVar3 = new a("buffering", 2);
        buffering = aVar3;
        a aVar4 = new a("ready", 3);
        ready = aVar4;
        a aVar5 = new a("completed", 4);
        completed = aVar5;
        a aVar6 = new a("error", 5);
        error = aVar6;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
