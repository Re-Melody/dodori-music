package D8;

import B8.EnumC0128o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2237a;

    static {
        int[] iArr = new int[EnumC0128o.values().length];
        f2237a = iArr;
        try {
            iArr[EnumC0128o.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2237a[EnumC0128o.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2237a[EnumC0128o.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2237a[EnumC0128o.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
