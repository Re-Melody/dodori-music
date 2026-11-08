package p045d8;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19319a;

    static {
        int[] iArr = new int[x.values().length];
        f19319a = iArr;
        try {
            iArr[x.kDown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19319a[x.kUp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19319a[x.kRepeat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
