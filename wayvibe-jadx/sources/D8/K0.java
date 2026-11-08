package D8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class K0 {
    private static final /* synthetic */ K0[] $VALUES;
    public static final K0 DISCONNECTED;
    public static final K0 IDLE;
    public static final K0 IDLE_AND_PING_SENT;
    public static final K0 PING_DELAYED;
    public static final K0 PING_SCHEDULED;
    public static final K0 PING_SENT;

    static {
        K0 k10 = new K0("IDLE", 0);
        IDLE = k10;
        K0 k11 = new K0("PING_SCHEDULED", 1);
        PING_SCHEDULED = k11;
        K0 k12 = new K0("PING_DELAYED", 2);
        PING_DELAYED = k12;
        K0 k13 = new K0("PING_SENT", 3);
        PING_SENT = k13;
        K0 k14 = new K0("IDLE_AND_PING_SENT", 4);
        IDLE_AND_PING_SENT = k14;
        K0 k15 = new K0("DISCONNECTED", 5);
        DISCONNECTED = k15;
        $VALUES = new K0[]{k10, k11, k12, k13, k14, k15};
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) $VALUES.clone();
    }
}
