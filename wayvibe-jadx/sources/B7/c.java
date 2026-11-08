package B7;

import com.google.protobuf.Q;
import com.google.protobuf.S;

/* JADX INFO: loaded from: classes.dex */
public enum c implements Q {
    ARRAY_CONFIG_UNSPECIFIED(0),
    CONTAINS(1),
    UNRECOGNIZED(-1);

    public static final int ARRAY_CONFIG_UNSPECIFIED_VALUE = 0;
    public static final int CONTAINS_VALUE = 1;
    private static final S internalValueMap = new K8.c(2);
    private final int value;

    c(int i10) {
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
