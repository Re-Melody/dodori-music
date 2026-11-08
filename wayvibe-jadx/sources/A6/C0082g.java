package A6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: A6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0082g extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f376b;

    public C0082g(S s8, Map map) {
        this.f376b = s8;
        map.getClass();
        this.f375a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0080e c0080e = (C0080e) it;
            if (!c0080e.hasNext()) {
                return;
            }
            c0080e.next();
            c0080e.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f375a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f375a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f375a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f375a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f375a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0080e(this, this.f375a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f375a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f376b.f324e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f375a.size();
    }
}
