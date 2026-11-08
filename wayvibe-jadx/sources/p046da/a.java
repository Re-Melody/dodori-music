package p046da;

import com.google.firebase.firestore.Z;
import org.maplibre.android.MapLibre;
import org.maplibre.android.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile sa.a f19431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f19432b;

    static {
        ((Z) MapLibre.getModuleProvider()).getClass();
        f19431a = new sa.a();
    }

    public static synchronized void a() {
        try {
            if (!f19432b) {
                f19432b = true;
                f19431a.getClass();
                System.loadLibrary("maplibre");
            }
        } catch (UnsatisfiedLinkError e2) {
            f19432b = false;
            Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e2);
            b.e0("Failed to load native shared library.", e2);
            try {
                try {
                    try {
                        Class.forName("org.junit.Test");
                    } catch (ClassNotFoundException unused) {
                        Class.forName("org.robolectric.Robolectric");
                    }
                } catch (ClassNotFoundException unused2) {
                    Class.forName("android.os.Build");
                    throw e2;
                }
            } catch (ClassNotFoundException unused3) {
            }
        }
    }
}
