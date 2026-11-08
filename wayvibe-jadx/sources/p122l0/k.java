package p122l0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21897a;

    static {
        int[] iArr = new int[EnumC2044a.values().length];
        try {
            iArr[EnumC2044a.Redirected.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2044a.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC2044a.RedirectCancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC2044a.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21897a = iArr;
    }
}
