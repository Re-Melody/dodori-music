package D8;

/* JADX INFO: renamed from: D8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0310s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2776a;

    static {
        int[] iArr = new int[B8.C.values().length];
        f2776a = iArr;
        try {
            iArr[B8.C.CT_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2776a[B8.C.CT_WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
