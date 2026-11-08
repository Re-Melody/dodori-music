package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15212a;

    static {
        int[] iArr = new int[J0.values().length];
        try {
            iArr[J0.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[J0.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[J0.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[J0.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15212a = iArr;
    }
}
