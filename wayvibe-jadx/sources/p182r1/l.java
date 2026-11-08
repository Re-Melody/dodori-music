package p182r1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25735a;

    static {
        int[] iArr = new int[p.values().length];
        f25735a = iArr;
        try {
            iArr[p.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25735a[p.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25735a[p.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
