package Q7;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    STRING(0),
    STRING_SET(1),
    INT(2),
    LONG(3),
    FLOAT(4),
    BOOLEAN(5);

    private final int mId;

    b(int i10) {
        this.mId = i10;
    }

    public final int f() {
        return this.mId;
    }
}
