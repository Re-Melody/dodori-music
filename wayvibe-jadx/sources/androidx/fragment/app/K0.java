package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15214a;

    static {
        int[] iArr = new int[G0.values().length];
        try {
            iArr[G0.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[G0.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[G0.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15214a = iArr;
    }
}
