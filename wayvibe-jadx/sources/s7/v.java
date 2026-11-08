package s7;

import p140m7.EnumC2054f;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26243a;

    static {
        int[] iArr = new int[EnumC2054f.values().length];
        f26243a = iArr;
        try {
            iArr[EnumC2054f.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26243a[EnumC2054f.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26243a[EnumC2054f.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
