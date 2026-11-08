package B7;

import com.google.protobuf.Q;
import com.google.protobuf.S;

/* JADX INFO: loaded from: classes.dex */
public enum h implements Q {
    QUERY_SCOPE_UNSPECIFIED(0),
    COLLECTION(1),
    COLLECTION_GROUP(2),
    UNRECOGNIZED(-1);

    public static final int COLLECTION_GROUP_VALUE = 2;
    public static final int COLLECTION_VALUE = 1;
    public static final int QUERY_SCOPE_UNSPECIFIED_VALUE = 0;
    private static final S internalValueMap = new p050e5.f(2);
    private final int value;

    h(int i10) {
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
