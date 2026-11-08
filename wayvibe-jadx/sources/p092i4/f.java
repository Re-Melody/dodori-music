package p092i4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f DISK;
    public static final f MEMORY;
    public static final f MEMORY_CACHE;
    public static final f NETWORK;

    static {
        f fVar = new f("MEMORY_CACHE", 0);
        MEMORY_CACHE = fVar;
        f fVar2 = new f("MEMORY", 1);
        MEMORY = fVar2;
        f fVar3 = new f("DISK", 2);
        DISK = fVar3;
        f fVar4 = new f("NETWORK", 3);
        NETWORK = fVar4;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
