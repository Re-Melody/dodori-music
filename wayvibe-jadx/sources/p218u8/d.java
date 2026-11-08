package p218u8;

import io.flutter.plugins.firebase.firestore.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27274a;

    static {
        int[] iArr = new int[I.values().length];
        f27274a = iArr;
        try {
            iArr[I.DELETE_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f27274a[I.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f27274a[I.SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
