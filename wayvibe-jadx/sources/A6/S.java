package A6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractC0092q implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractMap f323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Q f325f;

    public S(AbstractMap abstractMap) {
        p229v9.a.h(abstractMap.isEmpty());
        this.f323d = abstractMap;
    }

    public final void f() {
        AbstractMap abstractMap = this.f323d;
        Iterator it = abstractMap.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        abstractMap.clear();
        this.f324e = 0;
    }

    public final C0081f g() {
        Map map = this.f323d;
        if (map instanceof NavigableMap) {
            return new C0083h(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new C0086k(this, (SortedMap) map) : new C0081f(this, map);
    }

    public final Collection k() {
        return (List) this.f325f.get();
    }
}
