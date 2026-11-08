package B7;

import com.google.firebase.firestore.Z;
import com.google.protobuf.Q;
import com.google.protobuf.S;

/* JADX INFO: loaded from: classes.dex */
public enum e implements Q {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);

    public static final int ASCENDING_VALUE = 1;
    public static final int DESCENDING_VALUE = 2;
    public static final int ORDER_UNSPECIFIED_VALUE = 0;
    private static final S internalValueMap = new Z(2);
    private final int value;

    e(int i10) {
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
