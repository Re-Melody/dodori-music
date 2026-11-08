package p168p5;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    private final int number_;

    c(int i10) {
        this.number_ = i10;
    }

    public final int f() {
        return this.number_;
    }
}
