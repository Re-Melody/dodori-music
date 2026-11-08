package p207t7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f ALL;
    public static final f CONNECTIVITY_ATTEMPT_TIMER;
    public static final f GARBAGE_COLLECTION;
    public static final f HEALTH_CHECK_TIMEOUT;
    public static final f INDEX_BACKFILL;
    public static final f LISTEN_STREAM_CONNECTION_BACKOFF;
    public static final f LISTEN_STREAM_IDLE;
    public static final f ONLINE_STATE_TIMEOUT;
    public static final f RETRY_TRANSACTION;
    public static final f WRITE_STREAM_CONNECTION_BACKOFF;
    public static final f WRITE_STREAM_IDLE;

    static {
        f fVar = new f("ALL", 0);
        ALL = fVar;
        f fVar2 = new f("LISTEN_STREAM_IDLE", 1);
        LISTEN_STREAM_IDLE = fVar2;
        f fVar3 = new f("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
        LISTEN_STREAM_CONNECTION_BACKOFF = fVar3;
        f fVar4 = new f("WRITE_STREAM_IDLE", 3);
        WRITE_STREAM_IDLE = fVar4;
        f fVar5 = new f("WRITE_STREAM_CONNECTION_BACKOFF", 4);
        WRITE_STREAM_CONNECTION_BACKOFF = fVar5;
        f fVar6 = new f("HEALTH_CHECK_TIMEOUT", 5);
        HEALTH_CHECK_TIMEOUT = fVar6;
        f fVar7 = new f("ONLINE_STATE_TIMEOUT", 6);
        ONLINE_STATE_TIMEOUT = fVar7;
        f fVar8 = new f("GARBAGE_COLLECTION", 7);
        GARBAGE_COLLECTION = fVar8;
        f fVar9 = new f("RETRY_TRANSACTION", 8);
        RETRY_TRANSACTION = fVar9;
        f fVar10 = new f("CONNECTIVITY_ATTEMPT_TIMER", 9);
        CONNECTIVITY_ATTEMPT_TIMER = fVar10;
        f fVar11 = new f("INDEX_BACKFILL", 10);
        INDEX_BACKFILL = fVar11;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
