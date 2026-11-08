package M6;

import T6.Z0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8371a;

    static {
        int[] iArr = new int[Z0.values().length];
        f8371a = iArr;
        try {
            iArr[Z0.RAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8371a[Z0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8371a[Z0.CRUNCHY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8371a[Z0.TINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
