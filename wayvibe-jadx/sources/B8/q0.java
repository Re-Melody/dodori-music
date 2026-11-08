package B8;

/* JADX INFO: loaded from: classes2.dex */
public enum q0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int value;
    private final byte[] valueAscii;

    q0(int i10) {
        this.value = i10;
        this.valueAscii = Integer.toString(i10).getBytes(p267z6.h.f29877a);
    }

    public static byte[] a(q0 q0Var) {
        return q0Var.valueAscii;
    }

    public final r0 f() {
        return (r0) r0.f847d.get(this.value);
    }

    public final int g() {
        return this.value;
    }
}
