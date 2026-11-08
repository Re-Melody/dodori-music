package s7;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26159a;

    static {
        int[] iArr = new int[B.values().length];
        f26159a = iArr;
        try {
            iArr[B.NoChange.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26159a[B.Added.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26159a[B.Removed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26159a[B.Current.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26159a[B.Reset.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
