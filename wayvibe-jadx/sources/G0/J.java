package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5027a;

    static {
        int[] iArr = new int[N0.a.values().length];
        try {
            iArr[N0.a.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[N0.a.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[N0.a.Indeterminate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5027a = iArr;
    }
}
