package Ja;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6781a;

    static {
        int[] iArr = new int[Ia.d.values().length];
        try {
            iArr[Ia.d.MEDIA_PLAYER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Ia.d.LOW_LATENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6781a = iArr;
    }
}
