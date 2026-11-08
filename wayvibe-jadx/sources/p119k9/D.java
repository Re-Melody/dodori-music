package p119k9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21669a;

    static {
        int[] iArr = new int[E.values().length];
        try {
            iArr[E.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[E.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[E.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[E.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21669a = iArr;
    }
}
