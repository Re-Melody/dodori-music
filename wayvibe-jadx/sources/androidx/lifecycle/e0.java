package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f15553a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f15553a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
