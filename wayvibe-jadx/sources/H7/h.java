package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6176a;

    static {
        int[] iArr = new int[M7.c.values().length];
        f6176a = iArr;
        try {
            iArr[M7.c.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6176a[M7.c.END_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6176a[M7.c.END_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6176a[M7.c.END_DOCUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
