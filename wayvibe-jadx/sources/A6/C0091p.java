package A6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: A6.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091p extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f392b;

    public C0091p(S s8) {
        this.f392b = s8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f391a) {
            case 0:
                ((S) this.f392b).f();
                break;
            default:
                ((C0081f) this.f392b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f391a) {
            case 0:
                S s8 = (S) this.f392b;
                Map mapG = s8.f395c;
                if (mapG == null) {
                    mapG = s8.g();
                    s8.f395c = mapG;
                }
                Iterator it = mapG.values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return ((C0081f) this.f392b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f391a) {
            case 1:
                return ((C0081f) this.f392b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f391a) {
            case 0:
                return new C0078c((S) this.f392b);
            default:
                return new P(((C0081f) this.f392b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f391a) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0081f c0081f = (C0081f) this.f392b;
                    for (Map.Entry entry : c0081f.entrySet()) {
                        if (p228v8.c.d(obj, entry.getValue())) {
                            c0081f.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f391a) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0081f c0081f = (C0081f) this.f392b;
                    for (Map.Entry entry : c0081f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0081f.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f391a) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0081f c0081f = (C0081f) this.f392b;
                    for (Map.Entry entry : c0081f.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0081f.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f391a) {
            case 0:
                return ((S) this.f392b).f324e;
            default:
                return ((C0081f) this.f392b).f371c.size();
        }
    }

    public C0091p(C0081f c0081f) {
        this.f392b = c0081f;
    }
}
