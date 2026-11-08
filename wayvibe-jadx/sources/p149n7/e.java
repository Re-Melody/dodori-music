package p149n7;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22975a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f22975a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22975a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22975a[RoundingMode.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22975a[RoundingMode.CEILING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22975a[RoundingMode.FLOOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f22975a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f22975a[RoundingMode.HALF_DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f22975a[RoundingMode.HALF_UP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
