package A0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f90a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.Impulse.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.Lsq2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f90a = iArr;
    }
}
