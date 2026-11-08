package p050e5;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19594a;

    static {
        int[] iArr = new int[e.values().length];
        f19594a = iArr;
        try {
            iArr[e.lowest.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19594a[e.low.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19594a[e.high.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f19594a[e.best.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f19594a[e.bestForNavigation.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f19594a[e.medium.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
