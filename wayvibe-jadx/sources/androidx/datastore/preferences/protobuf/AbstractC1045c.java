package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1045c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f15071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f15072b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f15071a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f15072b = cls2 != null;
    }

    public static boolean a() {
        return (f15071a == null || f15072b) ? false : true;
    }
}
