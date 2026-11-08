package io.flutter.plugin.platform;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f20716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f20717c;

    static {
        int[] iArr = new int[p150n8.c.values().length];
        f20717c = iArr;
        try {
            iArr[p150n8.c.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20717c[p150n8.c.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[p150n8.i.values().length];
        f20716b = iArr2;
        try {
            iArr2[p150n8.i.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20716b[p150n8.i.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[p150n8.f.values().length];
        f20715a = iArr3;
        try {
            iArr3[p150n8.f.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20715a[p150n8.f.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20715a[p150n8.f.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20715a[p150n8.f.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f20715a[p150n8.f.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f20715a[p150n8.f.SUCCESS_NOTIFICATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f20715a[p150n8.f.WARNING_NOTIFICATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f20715a[p150n8.f.ERROR_NOTIFICATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
