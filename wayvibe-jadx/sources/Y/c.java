package Y;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends N8.e implements List, Collection, p013a9.a {
    @Override // N8.AbstractC0644a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // N8.AbstractC0644a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // N8.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // N8.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c n(int i10, Object obj);

    public abstract c o(Object obj);

    public c p(Collection collection) {
        f fVarQ = q();
        fVarQ.addAll(collection);
        return fVarQ.o();
    }

    public abstract f q();

    public abstract c r(b bVar);

    public abstract c s(int i10);

    @Override // N8.e, java.util.List
    public final List subList(int i10, int i11) {
        return new X.a(this, i10, i11);
    }

    public abstract c t(int i10, Object obj);
}
