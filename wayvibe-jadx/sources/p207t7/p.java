package p207t7;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26945a;

    static {
        int[] iArr = new int[q.values().length];
        f26945a = iArr;
        try {
            iArr[q.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26945a[q.WARN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26945a[q.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
