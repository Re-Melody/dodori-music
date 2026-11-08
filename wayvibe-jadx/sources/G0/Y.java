package G0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0.c f5171b;

    public Y(Configuration configuration, K0.c cVar) {
        this.f5170a = configuration;
        this.f5171b = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f5170a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f5171b.f7226a.entrySet().iterator();
        while (it.hasNext()) {
            K0.a aVar = (K0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f7223b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5171b.f7226a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f5171b.f7226a.clear();
    }
}
