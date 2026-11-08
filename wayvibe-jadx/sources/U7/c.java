package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12274a;

    static {
        int[] iArr = new int[a.values().length];
        f12274a = iArr;
        try {
            iArr[a.idle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12274a[a.loading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12274a[a.buffering.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12274a[a.ready.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12274a[a.completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12274a[a.error.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
