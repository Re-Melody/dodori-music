package O;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8731a;

    static {
        int[] iArr = new int[K.P.values().length];
        try {
            iArr[K.P.Cursor.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[K.P.SelectionStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[K.P.SelectionEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8731a = iArr;
    }
}
