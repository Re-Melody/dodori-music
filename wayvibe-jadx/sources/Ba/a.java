package Ba;

import p046da.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f908a;

    static {
        int[] iArr = new int[e.values().length];
        f908a = iArr;
        try {
            iArr[e.Mapbox.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f908a[e.MapTiler.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f908a[e.MapLibre.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
