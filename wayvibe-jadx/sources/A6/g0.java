package A6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends f0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f373a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f373a.iterator();
        it.getClass();
        p267z6.k kVar = this.f374b;
        kVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (kVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new g0(((SortedSet) this.f373a).headSet(obj), this.f374b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f373a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f374b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new g0(((SortedSet) this.f373a).subSet(obj, obj2), this.f374b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new g0(((SortedSet) this.f373a).tailSet(obj), this.f374b);
    }
}
