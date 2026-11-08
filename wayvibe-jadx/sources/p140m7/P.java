package p140m7;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22431a;

    static {
        int[] iArr = new int[S.values().length];
        f22431a = iArr;
        try {
            iArr[S.Set.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22431a[S.MergeSet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22431a[S.Update.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22431a[S.Argument.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f22431a[S.ArrayArgument.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
