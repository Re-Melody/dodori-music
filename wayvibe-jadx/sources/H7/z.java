package H7;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6232a;

    static {
        int[] iArr = new int[M7.c.values().length];
        f6232a = iArr;
        try {
            iArr[M7.c.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6232a[M7.c.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6232a[M7.c.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6232a[M7.c.BEGIN_ARRAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6232a[M7.c.BEGIN_OBJECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6232a[M7.c.NULL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
