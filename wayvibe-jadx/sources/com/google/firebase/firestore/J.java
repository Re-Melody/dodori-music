package com.google.firebase.firestore;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public enum J {
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

    private static final SparseArray<J> STATUS_LIST;
    private final int value;

    static {
        SparseArray<J> sparseArray = new SparseArray<>();
        for (J j10 : values()) {
            J j11 = sparseArray.get(j10.value);
            if (j11 != null) {
                throw new IllegalStateException("Code value duplication between " + j11 + "&" + j10.name());
            }
            sparseArray.put(j10.value, j10);
        }
        STATUS_LIST = sparseArray;
    }

    J(int i10) {
        this.value = i10;
    }

    public static J e(int i10) {
        return STATUS_LIST.get(i10, UNKNOWN);
    }
}
