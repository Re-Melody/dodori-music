package Q5;

import O2.h;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10563b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f10564a;

    static {
        c cVar = new c();
        cVar.f10564a = null;
        f10563b = cVar;
    }

    public static h a(Context context) {
        h hVar;
        c cVar = f10563b;
        synchronized (cVar) {
            try {
                if (cVar.f10564a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f10564a = new h(context);
                }
                hVar = cVar.f10564a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
