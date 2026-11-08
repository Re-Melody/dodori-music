package org.maplibre.android.location;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f24713a;

    public t(w wVar) {
        this.f24713a = wVar;
    }

    public final void a() {
        w wVar = this.f24713a;
        w.a(wVar);
        Iterator it = wVar.f24746x.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a();
        }
    }
}
