package p089i1;

import p174q1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20458a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.WRAP_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.MATCH_CONSTRAINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.MATCH_PARENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f20458a = iArr;
    }
}
