package p050e5;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19581a;

    static {
        int[] iArr = new int[e.values().length];
        f19581a = iArr;
        try {
            iArr[e.lowest.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19581a[e.low.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19581a[e.medium.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
