package p154o1;

import p144n1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23575a;

    static {
        int[] iArr = new int[k.values().length];
        f23575a = iArr;
        try {
            iArr[k.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23575a[k.START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23575a[k.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23575a[k.END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f23575a[k.TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f23575a[k.BOTTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
