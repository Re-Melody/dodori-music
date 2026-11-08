package p122l0;

import p028c1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21879b;

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
        f21878a = iArr;
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f21879b = iArr2;
    }
}
