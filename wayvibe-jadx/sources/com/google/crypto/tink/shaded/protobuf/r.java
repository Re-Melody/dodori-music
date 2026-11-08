package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18483a;

    static {
        int[] iArr = new int[H.values().length];
        f18483a = iArr;
        try {
            iArr[H.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18483a[H.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18483a[H.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
