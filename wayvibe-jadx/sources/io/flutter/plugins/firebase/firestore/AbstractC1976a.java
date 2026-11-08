package io.flutter.plugins.firebase.firestore;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.firestore.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1976a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20981a;

    static {
        int[] iArr = new int[com.google.firebase.firestore.J.values().length];
        f20981a = iArr;
        try {
            iArr[com.google.firebase.firestore.J.ABORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.ALREADY_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.DATA_LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.DEADLINE_EXCEEDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.FAILED_PRECONDITION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.INTERNAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.INVALID_ARGUMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.NOT_FOUND.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.OUT_OF_RANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.PERMISSION_DENIED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.RESOURCE_EXHAUSTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.UNAUTHENTICATED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.UNAVAILABLE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.UNIMPLEMENTED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f20981a[com.google.firebase.firestore.J.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
    }
}
