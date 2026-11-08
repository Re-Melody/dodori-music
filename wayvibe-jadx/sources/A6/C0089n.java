package A6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: A6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0089n extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0089n f387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f390f;

    public C0089n(S s8, Object obj, List list, C0089n c0089n) {
        this.f390f = s8;
        this.f389e = s8;
        this.f385a = obj;
        this.f386b = list;
        this.f387c = c0089n;
        this.f388d = c0089n == null ? null : c0089n.f386b;
    }

    public final void a() {
        C0089n c0089n = this.f387c;
        if (c0089n != null) {
            c0089n.a();
        } else {
            this.f389e.f323d.put(this.f385a, this.f386b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f386b.isEmpty();
        boolean zAdd = this.f386b.add(obj);
        if (zAdd) {
            this.f389e.f324e++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f386b.addAll(collection);
        if (zAddAll) {
            this.f389e.f324e += this.f386b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void c() {
        Collection collection;
        C0089n c0089n = this.f387c;
        if (c0089n != null) {
            c0089n.c();
            if (c0089n.f386b != this.f388d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f386b.isEmpty() || (collection = (Collection) this.f389e.f323d.get(this.f385a)) == null) {
                return;
            }
            this.f386b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f386b.clear();
        this.f389e.f324e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.f386b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.f386b.containsAll(collection);
    }

    public final void d() {
        C0089n c0089n = this.f387c;
        if (c0089n != null) {
            c0089n.d();
        } else if (this.f386b.isEmpty()) {
            this.f389e.f323d.remove(this.f385a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f386b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f386b).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.f386b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f386b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new C0080e(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f386b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new C0088m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f386b.remove(obj);
        if (zRemove) {
            this.f389e.f324e--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f386b.removeAll(collection);
        if (zRemoveAll) {
            this.f389e.f324e += this.f386b.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f386b.retainAll(collection);
        if (zRetainAll) {
            this.f389e.f324e += this.f386b.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f386b).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.f386b.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        List listSubList = ((List) this.f386b).subList(i10, i11);
        C0089n c0089n = this.f387c;
        if (c0089n == null) {
            c0089n = this;
        }
        S s8 = this.f390f;
        s8.getClass();
        boolean z10 = listSubList instanceof RandomAccess;
        Object obj = this.f385a;
        return z10 ? new C0085j(s8, obj, listSubList, c0089n) : new C0089n(s8, obj, listSubList, c0089n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f386b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new C0088m(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = ((List) this.f386b).remove(i10);
        this.f390f.f324e--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean zIsEmpty = this.f386b.isEmpty();
        ((List) this.f386b).add(i10, obj);
        this.f390f.f324e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f386b).addAll(i10, collection);
        if (zAddAll) {
            this.f390f.f324e += this.f386b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
