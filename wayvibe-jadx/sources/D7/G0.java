package D7;

/* JADX INFO: loaded from: classes.dex */
public enum G0 implements com.google.protobuf.Q {
    OPERATOR_UNSPECIFIED(0),
    AND(1),
    OR(2),
    UNRECOGNIZED(-1);

    public static final int AND_VALUE = 1;
    public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
    public static final int OR_VALUE = 2;
    private static final com.google.protobuf.S internalValueMap = new com.google.firebase.firestore.Z(3);
    private final int value;

    G0(int i10) {
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
