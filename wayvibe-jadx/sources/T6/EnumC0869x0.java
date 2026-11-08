package T6;

/* JADX INFO: renamed from: T6.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0869x0 implements com.google.crypto.tink.shaded.protobuf.B {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.C internalValueMap = new K8.c(18);
    private final int value;

    EnumC0869x0(int i10) {
        this.value = i10;
    }

    public final int f() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
