package O6;

import T6.Z0;

/* JADX INFO: renamed from: O6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0703n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9313a;

    static {
        int[] iArr = new int[Z0.values().length];
        f9313a = iArr;
        try {
            iArr[Z0.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9313a[Z0.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9313a[Z0.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9313a[Z0.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
