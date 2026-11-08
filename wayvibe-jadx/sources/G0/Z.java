package G0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K0.d f5173a;

    public Z(K0.d dVar) {
        this.f5173a = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        K0.d dVar = this.f5173a;
        synchronized (dVar) {
            dVar.f7227a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        K0.d dVar = this.f5173a;
        synchronized (dVar) {
            dVar.f7227a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        K0.d dVar = this.f5173a;
        synchronized (dVar) {
            dVar.f7227a.a();
        }
    }
}
