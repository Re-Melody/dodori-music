package K;

import p261z.EnumC2391a0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6830a;

    static {
        int[] iArr = new int[EnumC2391a0.values().length];
        try {
            iArr[EnumC2391a0.Vertical.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC2391a0.Horizontal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6830a = iArr;
    }
}
