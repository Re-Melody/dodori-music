package p196s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEVICE_CHARGING;
    public static final d DEVICE_IDLE;
    public static final d NETWORK_UNMETERED;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        NETWORK_UNMETERED = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        DEVICE_IDLE = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        DEVICE_CHARGING = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
