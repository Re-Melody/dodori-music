package A6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: A6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0081f extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient C0079d f369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient C0091p f370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f372d;

    public C0081f(S s8, Map map) {
        this.f372d = s8;
        this.f371c = map;
    }

    public final A a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        S s8 = this.f372d;
        s8.getClass();
        List list = (List) collection;
        return new A(key, list instanceof RandomAccess ? new C0085j(s8, key, list, null) : new C0089n(s8, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        S s8 = this.f372d;
        if (this.f371c == s8.f323d) {
            s8.f();
            return;
        }
        C0080e c0080e = new C0080e(this);
        while (c0080e.hasNext()) {
            c0080e.next();
            c0080e.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f371c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0079d c0079d = this.f369a;
        if (c0079d != null) {
            return c0079d;
        }
        C0079d c0079d2 = new C0079d(this);
        this.f369a = c0079d2;
        return c0079d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f371c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f371c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        S s8 = this.f372d;
        s8.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0085j(s8, obj, list, null) : new C0089n(s8, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f371c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c0087l;
        S s8 = this.f372d;
        Set set = s8.f393a;
        if (set != null) {
            return set;
        }
        Map map = s8.f323d;
        if (map instanceof NavigableMap) {
            c0087l = new C0084i(s8, (NavigableMap) map);
        } else {
            c0087l = map instanceof SortedMap ? new C0087l(s8, (SortedMap) map) : new C0082g(s8, map);
        }
        s8.f393a = c0087l;
        return c0087l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f371c.remove(obj);
        if (collection == null) {
            return null;
        }
        S s8 = this.f372d;
        Collection collectionK = s8.k();
        collectionK.addAll(collection);
        s8.f324e -= collection.size();
        collection.clear();
        return collectionK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f371c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f371c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0091p c0091p = this.f370b;
        if (c0091p != null) {
            return c0091p;
        }
        C0091p c0091p2 = new C0091p(this);
        this.f370b = c0091p2;
        return c0091p2;
    }
}
