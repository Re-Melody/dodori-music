package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3715a;

    static {
        int[] iArr = new int[D.values().length];
        try {
            iArr[D.LookaheadMeasuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[D.Measuring.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[D.LookaheadLayingOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[D.LayingOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[D.Idle.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f3715a = iArr;
    }
}
