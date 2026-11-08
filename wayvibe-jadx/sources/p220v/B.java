package p220v;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f27297a;

    static {
        int[] iArr = new int[EnumC2266x.values().length];
        try {
            iArr[EnumC2266x.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2266x.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC2266x.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f27297a = iArr;
    }
}
