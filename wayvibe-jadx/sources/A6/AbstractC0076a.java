package A6;

/* JADX INFO: renamed from: A6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0076a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f338a;

    static {
        int[] iArr = new int[EnumC0077b.values().length];
        f338a = iArr;
        try {
            iArr[EnumC0077b.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f338a[EnumC0077b.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
