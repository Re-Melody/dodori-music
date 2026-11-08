package F6;

import T6.EnumC0869x0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4554a;

    static {
        int[] iArr = new int[EnumC0869x0.values().length];
        f4554a = iArr;
        try {
            iArr[EnumC0869x0.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4554a[EnumC0869x0.DESTROYED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4554a[EnumC0869x0.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
