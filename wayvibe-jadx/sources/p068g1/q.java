package p068g1;

import p028c1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20017a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20017a = iArr;
    }
}
