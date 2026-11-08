package s7;

import com.google.firebase.firestore.J;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26187a;

    static {
        int[] iArr = new int[J.values().length];
        f26187a = iArr;
        try {
            iArr[J.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26187a[J.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26187a[J.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26187a[J.DEADLINE_EXCEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26187a[J.RESOURCE_EXHAUSTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f26187a[J.INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f26187a[J.UNAVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f26187a[J.UNAUTHENTICATED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f26187a[J.INVALID_ARGUMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f26187a[J.NOT_FOUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f26187a[J.ALREADY_EXISTS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f26187a[J.PERMISSION_DENIED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f26187a[J.FAILED_PRECONDITION.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f26187a[J.ABORTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f26187a[J.OUT_OF_RANGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f26187a[J.UNIMPLEMENTED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f26187a[J.DATA_LOSS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}
