package E8;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3209b;

    static {
        int[] iArr = new int[h.values().length];
        f3209b = iArr;
        try {
            iArr[h.PLAINTEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3209b[h.TLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[f.values().length];
        f3208a = iArr2;
        try {
            iArr2[f.TLS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3208a[f.PLAINTEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
