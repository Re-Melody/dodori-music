package p122l0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21919a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.Captured.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21919a = iArr;
    }
}
