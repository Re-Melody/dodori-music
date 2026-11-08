package p143n0;

/* JADX INFO: renamed from: n0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2085l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22781a;

    static {
        int[] iArr = new int[T.values().length];
        try {
            iArr[T.CounterClockwise.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[T.Clockwise.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f22781a = iArr;
    }
}
