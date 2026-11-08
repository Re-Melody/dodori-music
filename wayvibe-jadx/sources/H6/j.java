package H6;

import T6.Z0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6094a;

    static {
        int[] iArr = new int[Z0.values().length];
        f6094a = iArr;
        try {
            iArr[Z0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6094a[Z0.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6094a[Z0.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6094a[Z0.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
