package io.flutter.plugins.firebase.firestore;

/* JADX INFO: renamed from: io.flutter.plugins.firebase.firestore.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1984i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f21003c;

    static {
        int[] iArr = new int[x.values().length];
        f21003c = iArr;
        try {
            iArr[x.ENABLE_INDEX_AUTO_CREATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21003c[x.DISABLE_INDEX_AUTO_CREATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21003c[x.DELETE_ALL_INDEXES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[I.values().length];
        f21002b = iArr2;
        try {
            iArr2[I.DELETE_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21002b[I.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21002b[I.SET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[o.values().length];
        f21001a = iArr3;
        try {
            iArr3[o.COUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f21001a[o.SUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f21001a[o.AVERAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
