package D8;

import B8.EnumC0128o;

/* JADX INFO: renamed from: D8.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0327x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2839a;

    static {
        int[] iArr = new int[EnumC0128o.values().length];
        f2839a = iArr;
        try {
            iArr[EnumC0128o.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2839a[EnumC0128o.CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2839a[EnumC0128o.READY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2839a[EnumC0128o.TRANSIENT_FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2839a[EnumC0128o.SHUTDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
