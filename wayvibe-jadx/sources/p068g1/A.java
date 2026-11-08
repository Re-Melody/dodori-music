package p068g1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19973a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.SecureOff.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.SecureOn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.Inherit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f19973a = iArr;
    }
}
