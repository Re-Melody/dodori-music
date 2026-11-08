package A9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f416a;

    static {
        int[] iArr = new int[J.values().length];
        try {
            iArr[J.LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[J.MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[J.POLY_OBJ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[J.OBJ.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f416a = iArr;
    }
}
