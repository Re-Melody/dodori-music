package p182r1;

import p174q1.c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25743a;

    static {
        int[] iArr = new int[c.values().length];
        f25743a = iArr;
        try {
            iArr[c.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f25743a[c.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f25743a[c.TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f25743a[c.BASELINE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f25743a[c.BOTTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
