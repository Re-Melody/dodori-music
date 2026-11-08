package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C1055m f15133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1055m f15134b;

    static {
        C1055m c1055m = new C1055m();
        Map map = Collections.EMPTY_MAP;
        f15134b = c1055m;
    }

    public static C1055m a() {
        C1055m c1055m;
        Z z10 = Z.f15060c;
        C1055m c1055m2 = f15133a;
        if (c1055m2 != null) {
            return c1055m2;
        }
        synchronized (C1055m.class) {
            try {
                c1055m = f15133a;
                if (c1055m == null) {
                    Class cls = AbstractC1054l.f15132a;
                    C1055m c1055m3 = null;
                    if (cls != null) {
                        try {
                            c1055m3 = (C1055m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c1055m = c1055m3 != null ? c1055m3 : f15134b;
                    f15133a = c1055m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1055m;
    }
}
