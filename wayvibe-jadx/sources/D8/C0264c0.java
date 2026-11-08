package D8;

/* JADX INFO: renamed from: D8.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0264c0 extends B8.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2501a;

    static {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, C0264c0.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        f2501a = z10;
    }
}
