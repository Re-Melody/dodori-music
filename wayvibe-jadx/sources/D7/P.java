package D7;

/* JADX INFO: loaded from: classes.dex */
public enum P implements com.google.protobuf.Q {
    SERVER_VALUE_UNSPECIFIED(0),
    REQUEST_TIME(1),
    UNRECOGNIZED(-1);

    public static final int REQUEST_TIME_VALUE = 1;
    public static final int SERVER_VALUE_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.S internalValueMap = new K8.c(3);
    private final int value;

    P(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.Q
    public final int f() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
