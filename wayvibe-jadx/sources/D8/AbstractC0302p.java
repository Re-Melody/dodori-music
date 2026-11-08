package D8;

import B8.EnumC0119f;

/* JADX INFO: renamed from: D8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0302p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2735a;

    static {
        int[] iArr = new int[EnumC0119f.values().length];
        f2735a = iArr;
        try {
            iArr[EnumC0119f.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2735a[EnumC0119f.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2735a[EnumC0119f.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
