package androidx.fragment.app;

import androidx.lifecycle.EnumC1120o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15404a;

    static {
        int[] iArr = new int[EnumC1120o.values().length];
        f15404a = iArr;
        try {
            iArr[EnumC1120o.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15404a[EnumC1120o.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15404a[EnumC1120o.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15404a[EnumC1120o.INITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
