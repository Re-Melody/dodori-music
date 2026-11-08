package F0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3647b;

    static {
        int[] iArr = new int[D.values().length];
        try {
            iArr[D.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[D.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f3646a = iArr;
        int[] iArr2 = new int[F.values().length];
        try {
            iArr2[F.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[F.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f3647b = iArr2;
    }
}
